package org.hl7.fhir.services.context;

import java.util.List;

import org.hl7.fhir.model.core.Resource;

/**
 * Told about what a worker context's lookups return, for a caller that works out what its own work depended on (to
 * cache the work's result, for example). See {@link IWorkerContext#getResourceReadListener()}
 */
public interface IResourceReadListener {

  /**
   * A lookup of one resource returned this one, or nothing.
   *
   * @param type the type asked for (null if any type)
   * @param canonical the canonical URL asked for (or the id, for a lookup by id, or the type name, for a type definition)
   * @param version the version asked for, if it was given apart from the canonical
   * @param result what the lookup returned (null if nothing)
   */
  void resourceRead(String type, String canonical, String version, Resource result);

  /**
   * A lookup returned these resources.
   *
   * @param query what was asked for: the type (empty if every type), then the filter, if any, after a '?'
   * @param result what the lookup returned
   */
  void resourcesRead(String query, List<? extends Resource> result);
}
