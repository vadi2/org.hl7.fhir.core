package org.hl7.fhir.utilities.json;

import java.io.File;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
    
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
 */



import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Map;
import java.util.Stack;

import org.hl7.fhir.utilities.FileUtilities;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.utilities.http.HTTPResult;
import org.hl7.fhir.utilities.http.ManagedWebAccess;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;


/**
 * This is created to get a json parser that can track line numbers... grr...
 * 
 * @author Grahame Grieve
 *
 */
public class JsonTrackingParser {

	public class PresentedBigDecimal extends BigDecimal {

	  public String presentation;
	  
    public PresentedBigDecimal(String value) {
      super(value);
      presentation = value;
    }

    public String getPresentation() {
      return presentation;
    }

  }

  public enum TokenType {
		Open, Close, String, Number, Colon, Comma, OpenArray, CloseArray, Eof, Null, Boolean;
	}
	
	public class LocationData {
		private int line;
		private int col;
		
		protected LocationData(int line, int col) {
			super();
			this.line = line;
			this.col = col;
		}
		
		public int getLine() {
			return line;
		}
		
		public int getCol() {
			return col;
		}
		
		public void newLine() {
			line++;
			col = 1;		
		}

		public LocationData copy() {
			return new LocationData(line, col);
		}
	}
	
	private class State {
		private String name;
		private boolean isProp;
		protected State(String name, boolean isProp) {
			super();
			this.name = name;
			this.isProp = isProp;
		}
		public String getName() {
			return name;
		}
		public boolean isProp() {
			return isProp;
		}
	}
	
	private class Lexer {
		private String source;
		private int cursor;
		private String peek;
		private String value;
		private TokenType type;
		private Stack<State> states = new Stack<State>();
		private LocationData lastLocationBWS;
		private LocationData lastLocationAWS;
		private LocationData location;
		private StringBuilder b = new StringBuilder();
		
    public Lexer(String source) throws IOException {
    	this.source = source;
    	cursor = -1;
    	location = new LocationData(1, 1);  
    	start();
    }
    
    private boolean more() {
    	return peek != null || cursor < source.length(); 
    }
    
    private String getNext(int length) throws IOException {
    	String result = "";
      if (peek != null) {
      	if (peek.length() > length) {
      		result = peek.substring(0, length);
      		peek = peek.substring(length);
      	} else {
      		result = peek;
      		peek = null;
      	}
      }
      if (result.length() < length) {
      	int len = length - result.length(); 
      	if (cursor > source.length() - len) 
      		throw error("Attempt to read past end of source");
      	result = result + source.substring(cursor+1, cursor+len+1);
      	cursor = cursor + len;
      }
       for (char ch : result.toCharArray())
        if (ch == '\n')
          location.newLine();
        else
          location.col++;
      return result;
    }
    
    private char getNextChar() throws IOException {
      if (peek != null) {
      	char ch = peek.charAt(0);
      	peek = peek.length() == 1 ? null : peek.substring(1);
      	return ch;
      } else {
        cursor++;
        if (cursor >= source.length())
          return (char) 0;
        char ch = source.charAt(cursor);
        if (ch == '\n') {
          location.newLine();
        } else {
          location.col++;
        }
        return ch;
      }
    }
    
    private void push(char ch){
    	peek = peek == null ? String.valueOf(ch) : String.valueOf(ch)+peek;
    }
    
    private void parseWord(String word, char ch, TokenType type) throws IOException {
      this.type = type;
      value = ""+ch+getNext(word.length()-1);
      if (!value.equals(word))
      	throw error("Syntax error in json reading special word "+word);
    }
    
    private IOException error(String msg) {
      return new IOException("Error parsing JSON source: "+msg+" at Line "+Integer.toString(location.line)+" (path=["+path()+"])");
    }
    
    private String path() {
      if (states.empty())
        return value;
      else {
      	String result = "";
        for (State s : states) 
          result = result + '/'+ s.getName();
        result = result + value;
        return result;
      }
    }

    public void start() throws IOException {
//      char ch = getNextChar();
//      if (ch = '\.uEF')
//      begin
//        // skip BOM
//        getNextChar();
//        getNextChar();
//      end
//      else
//        push(ch);
      next();
    }
    
    public TokenType getType() {
    	return type;
    }
    
    public String getValue() {
    	return value;
    }


    public LocationData getLastLocationBWS() {
    	return lastLocationBWS;
    }

    public LocationData getLastLocationAWS() {
    	return lastLocationAWS;
    }

    public void next() throws IOException {
    	lastLocationBWS = location.copy();
    	char ch;
    	do {
    		ch = getNextChar();
    		if (allowComments && ch == '/') {
    		  char ch1 = getNextChar();
    		  if (ch1 == '/') {
    		    while (more() && !Utilities.charInSet(ch, '\r', '\n')) {
    		      ch = getNextChar();
    		    }
    		  } else {
    		    push(ch1);
    		  }    		  
    		}
    	} while (more() && Utilities.charInSet(ch, ' ', '\r', '\n', '\t'));
    	lastLocationAWS = location.copy();

    	if (!more()) {
    		type = TokenType.Eof;
    	} else {
    		switch (ch) {
    		case '{' : 
    			type = TokenType.Open;
    			break;
    		case '}' : 
    			type = TokenType.Close;
    			break;
    		case '"' :
    			type = TokenType.String;
    			b.setLength(0);
    			do {
    				ch = getNextChar();
    				if (ch == '\\') {
    					ch = getNextChar();
    					switch (ch) {
              case '"': b.append('"'); break;
              case '\'': b.append('\''); break;
    					case '\\': b.append('\\'); break;
    					case '/': b.append('/'); break;
    					case 'n': b.append('\n'); break;
    					case 'r': b.append('\r'); break;
    					case 't': b.append('\t'); break;
    					case 'u': b.append((char) Integer.parseInt(getNext(4), 16)); break;
    					default :
    						throw error("unknown escape sequence: \\"+ch);
    					}
    					ch = ' ';
    				} else if (ch != '"')
    					b.append(ch);
    			} while (more() && (ch != '"'));
    			if (!more())
    				throw error("premature termination of json stream during a string");
    			value = b.toString();
    			break;
    		case ':' : 
    			type = TokenType.Colon;
    			break;
    		case ',' : 
    			type = TokenType.Comma;
    			break;
    		case '[' : 
    			type = TokenType.OpenArray;
    			break;
    		case ']' : 
    			type = TokenType.CloseArray;
    			break;
    		case 't' : 
    			parseWord("true", ch, TokenType.Boolean);
    			break;
    		case 'f' : 
    			parseWord("false", ch, TokenType.Boolean);
    			break;
    		case 'n' : 
    			parseWord("null", ch, TokenType.Null);
    			break;
    		default:
    			if ((ch >= '0' && ch <= '9') || ch == '-') {
    				type = TokenType.Number;
    				b.setLength(0);
    				while (more() && ((ch >= '0' && ch <= '9') || ch == '-' || ch == '.') || ch == '+' || ch == 'e' || ch == 'E') {
    					b.append(ch);
    					ch = getNextChar();
    				}
    				value = b.toString();
    				push(ch);
    			} else
    				throw error("Unexpected char '"+ch+"' in json stream");
    		}
    	}
    }

    public String consume(TokenType type) throws IOException {
      if (this.type != type)
        throw error("JSON syntax error - found "+this.type.toString()+" expecting "+type.toString());
      String result = value;
      next();
      return result;
    }

	}

	enum ItemType {
	  Object, String, Number, Boolean, Array, End, Eof, Null;
	}
	private Map<JsonElement, LocationData> map;
  private Lexer lexer;
  private ItemType itemType = ItemType.Object;
  private String itemName;
  private String itemValue;
  private boolean errorOnDuplicates = true;
  private boolean allowComments = false;

  public static JsonObject parseJson(String source) throws IOException {
    return parse(source, null);
  }
  
  public static JsonObject parseJson(InputStream stream) throws IOException {
    return parse(FileUtilities.streamToString(stream), null);
  }
  
  public static JsonObject parseJson(byte[] stream) throws IOException {
    return parse(FileUtilities.bytesToString(stream), null);
  }
  
  public static JsonArray parseJsonArray(byte[] stream) throws IOException {
    return parseArray(FileUtilities.bytesToString(stream), null);
  }
  
  public static JsonObject parseJson(byte[] stream, boolean allowDuplicates) throws IOException {
    return parse(FileUtilities.bytesToString(stream), null, allowDuplicates);
  }
  
  public static JsonObject parseJson(File source) throws IOException {
    return parse(FileUtilities.fileToString(source), null);
  }
  
  public static JsonObject parseJsonFile(String source) throws IOException {
    return parse(FileUtilities.fileToString(source), null);
  }
  
  public static JsonObject parse(String source, Map<JsonElement, LocationData> map) throws IOException {
    return parse(source, map, false);
  }
    
  public static JsonArray parseArray(String source, Map<JsonElement, LocationData> map) throws IOException {
    return parseArray(source, map, false);
  }
    
    
  public static JsonObject parse(String source, Map<JsonElement, LocationData> map, boolean allowDuplicates) throws IOException {
    return parse(source, map, allowDuplicates, false);
  }
  
  public static JsonArray parseArray(String source, Map<JsonElement, LocationData> map, boolean allowDuplicates) throws IOException {
    return parseArray(source, map, allowDuplicates, false);
  }
  
  public static JsonObject parse(String source, Map<JsonElement, LocationData> map, boolean allowDuplicates, boolean allowComments) throws IOException {
    JsonTrackingParser self = new JsonTrackingParser();
    self.map = map;
    self.setErrorOnDuplicates(!allowDuplicates);
    self.setAllowComments(allowComments);
    return self.parse(Utilities.stripBOM(source));
  }

  public static JsonArray parseArray(String source, Map<JsonElement, LocationData> map, boolean allowDuplicates, boolean allowComments) throws IOException {
    JsonTrackingParser self = new JsonTrackingParser();
    self.map = map;
    self.setErrorOnDuplicates(!allowDuplicates);
    self.setAllowComments(allowComments);
    return self.parseArray(Utilities.stripBOM(source));
  }

	private JsonObject parse(String source) throws IOException {
		lexer = new Lexer(source);
		JsonObject result = new JsonObject();
		LocationData loc = lexer.location.copy();
    if (lexer.getType() == TokenType.Open) {
      lexer.next();
      lexer.states.push(new State("", false));
    } 
    else
      throw lexer.error("Unexpected content at start of JSON: "+lexer.getType().toString());

    if (lexer.getType() != TokenType.Close) {
      parseProperty();
      readObject(result, true);
    }
    if (map != null)
		  map.put(result, loc);
    return result;
	}

  private JsonArray parseArray(String source) throws IOException {
    return new Gson().fromJson(source, JsonArray.class);
  }

	private void readObject(JsonObject obj, boolean root) throws IOException {
	  if (map != null)
      map.put(obj, lexer.location.copy());

		while (!(itemType == ItemType.End) || (root && (itemType == ItemType.Eof))) {
			switch (itemType) {
			case Object:
				JsonObject child = new JsonObject(); //(obj.path+'.'+ItemName);
				LocationData loc = lexer.location.copy();
	      if (!obj.has(itemName))
	        obj.add(itemName, child);
	      else if (errorOnDuplicates)
	        throw lexer.error("Duplicated property name: "+itemName);
				next();
				readObject(child, false);
				if (map != null)
		      map.put(obj, loc);
				break;
			case Boolean :
				JsonPrimitive v = new JsonPrimitive(Boolean.valueOf(itemValue));
        if (!obj.has(itemName))
  				obj.add(itemName, v);
        else if (errorOnDuplicates)
          throw lexer.error("Duplicated property name: "+itemName);
				if (map != null)
		      map.put(v, lexer.location.copy());
				break;
			case String:
				v = new JsonPrimitive(itemValue);
        if (!obj.has(itemName))
  				obj.add(itemName, v);
        else if (errorOnDuplicates)
          throw lexer.error("Duplicated property name: "+itemName);
				if (map != null)
		      map.put(v, lexer.location.copy());
				break;
			case Number:
				v = new JsonPrimitive(new PresentedBigDecimal(itemValue));
        if (!obj.has(itemName))
  				obj.add(itemName, v);
        else if (errorOnDuplicates)
          throw lexer.error("Duplicated property name: "+itemName);
				if (map != null)
		      map.put(v, lexer.location.copy());
				break;
			case Null:
				JsonNull n = new JsonNull();
        if (!obj.has(itemName))
  				obj.add(itemName, n);
        else if (errorOnDuplicates)
          throw lexer.error("Duplicated property name: "+itemName);
				if (map != null)
		      map.put(n, lexer.location.copy());
				break;
			case Array:
				JsonArray arr = new JsonArray(); // (obj.path+'.'+ItemName);
				loc = lexer.location.copy();
        if (!obj.has(itemName))
  				obj.add(itemName, arr);
        else if (errorOnDuplicates)
          throw lexer.error("Duplicated property name: "+itemName);
				next();
				if (!readArray(arr, false))
				  next(true);
				if (map != null)
		      map.put(arr, loc);
				break;
			case Eof : 
				throw lexer.error("Unexpected End of File");
			case End:
				// TODO GG: This isn't handled. Should it be?
				break;
			}
			next();
		}
	}

	private boolean readArray(JsonArray arr, boolean root) throws IOException {
	  boolean res = false;
	  while (!((itemType == ItemType.End) || (root && (itemType == ItemType.Eof)))) {
	    res  = true;
	    switch (itemType) {
	    case Object:
	    	JsonObject obj  = new JsonObject(); // (arr.path+'['+inttostr(i)+']');
				LocationData loc = lexer.location.copy();
	    	arr.add(obj);
	      next();
	      readObject(obj, false);
	      if (map != null)
	        map.put(obj, loc);
	      break;
	    case String:
	    	JsonPrimitive v = new JsonPrimitive(itemValue);
				arr.add(v);
				if (map != null)
		      map.put(v, lexer.location.copy());
				break;
	    case Number:
	    	v = new JsonPrimitive(new BigDecimal(itemValue));
				arr.add(v);
				if (map != null)
		      map.put(v, lexer.location.copy());
				break;
	    case Null :
	    	JsonNull n = new JsonNull();
				arr.add(n);
				if (map != null)
		      map.put(n, lexer.location.copy());
				break;
	    case Array:
        JsonArray child = new JsonArray(); // (arr.path+'['+inttostr(i)+']');
				loc = lexer.location.copy();
				arr.add(child);
        next();
	      readArray(child, false);
	      if (map != null)
	        map.put(arr, loc);
        break;
	    case Eof : 
	    	throw lexer.error("Unexpected End of File");
		 case End:
		 case Boolean:
			// TODO GG: These aren't handled. SHould they be?
			break;
	    }
	    next();
	  }
	  return res;
	}

  private void next() throws IOException {
    next(false);
  }
  
	private void next(boolean noPop) throws IOException {
		switch (itemType) {
		case Object :
			lexer.consume(TokenType.Open);
			lexer.states.push(new State(itemName, false));
			if (lexer.getType() == TokenType.Close) {
				itemType = ItemType.End;
				lexer.next();
			} else
				parseProperty();
			break;
		case Null:
		case String:
		case Number: 
		case End: 
		case Boolean :
			if (itemType == ItemType.End && !noPop)
				lexer.states.pop();
			if (lexer.getType() == TokenType.Comma) {
				lexer.next();
				parseProperty();
			} else if (lexer.getType() == TokenType.Close) {
				itemType = ItemType.End;
				lexer.next();
			} else if (lexer.getType() == TokenType.CloseArray) {
				itemType = ItemType.End;
				lexer.next();
			} else if (lexer.getType() == TokenType.Eof) {
				itemType = ItemType.Eof;
			} else
				throw lexer.error("Unexpected JSON syntax");
			break;
		case Array :
			lexer.next();
			lexer.states.push(new State(itemName+"[]", true));
			parseProperty();
			break;
		case Eof :
			throw lexer.error("JSON Syntax Error - attempt to read past end of json stream");
		default:
			throw lexer.error("not done yet (a): "+itemType.toString());
		}
	}

	private void parseProperty() throws IOException {
		if (!lexer.states.peek().isProp) {
			itemName = lexer.consume(TokenType.String);
			itemValue = null;
			lexer.consume(TokenType.Colon);
		}
		switch (lexer.getType()) {
		case Null :
			itemType = ItemType.Null;
			itemValue = lexer.value;
			lexer.next();
			break;
		case String :
			itemType = ItemType.String;
			itemValue = lexer.value;
			lexer.next();
			break;
		case Boolean :
			itemType = ItemType.Boolean;
			itemValue = lexer.value;
			lexer.next();
			break;
		case Number :
			itemType = ItemType.Number;
			itemValue = lexer.value;
			lexer.next();
			break;
		case Open :
			itemType = ItemType.Object;
			break;
		case OpenArray :
			itemType = ItemType.Array;
			break;
		case CloseArray :
			itemType = ItemType.End;
			break;
			// case Close, , case Colon, case Comma, case OpenArray,       !
		default:
			throw lexer.error("not done yet (b): "+lexer.getType().toString());
		}
	}

  public boolean isErrorOnDuplicates() {
    return errorOnDuplicates;
  }

  public void setErrorOnDuplicates(boolean errorOnDuplicates) {
    this.errorOnDuplicates = errorOnDuplicates;
  }

  
  public boolean isAllowComments() {
    return allowComments;
  }

  public void setAllowComments(boolean allowComments) {
    this.allowComments = allowComments;
  }

  public static void write(JsonObject json, File file) throws IOException {
    Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    String jcnt = gson.toJson(json);
    FileUtilities.stringToFile(jcnt, file);    
  }
    
  public static void write(JsonObject json, File file, boolean pretty) throws IOException {
    Gson gson = pretty ? new GsonBuilder().setPrettyPrinting().create() : new GsonBuilder().create();
    String jcnt = gson.toJson(json);
    FileUtilities.stringToFile(jcnt, file);    
  }
    
  public static void write(JsonObject json, String fileName) throws IOException {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    String jcnt = gson.toJson(json);
    FileUtilities.stringToFile(jcnt, fileName);    
  }
  
  public static String write(JsonObject json) {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    return gson.toJson(json);    
  }

  public static String writeDense(JsonObject json) {
    Gson gson = new GsonBuilder().create();
    return gson.toJson(json);    
  }

  public static byte[] writeBytes(JsonObject json, boolean pretty) {
    if (pretty) {
      Gson gson = new GsonBuilder().setPrettyPrinting().create();
      return gson.toJson(json).getBytes(StandardCharsets.UTF_8);    
    } else {
      Gson gson = new GsonBuilder().create();
      return gson.toJson(json).getBytes(StandardCharsets.UTF_8);    
    }    
  }

  public static byte[] writeBytes(JsonArray json, boolean pretty) {
    if (pretty) {
      Gson gson = new GsonBuilder().setPrettyPrinting().create();
      return gson.toJson(json).getBytes(StandardCharsets.UTF_8);    
    } else {
      Gson gson = new GsonBuilder().create();
      return gson.toJson(json).getBytes(StandardCharsets.UTF_8);    
    }    
  }
  
  public static JsonObject fetchJson(String source) throws IOException {
    HTTPResult res = ManagedWebAccess.get(Arrays.asList("web"), source+"?nocache=" + System.currentTimeMillis(), "application/json, application/fhir+json");
    res.checkThrowException();
    return parseJson(res.getContent());
  }
  
  public static JsonArray fetchJsonArray(String source) throws IOException {
    HTTPResult res = ManagedWebAccess.get(Arrays.asList("web"),source+"?nocache=" + System.currentTimeMillis(), "application/json, application/fhir+json");
    res.checkThrowException();
    return parseJsonArray(res.getContent());
  }
	
}