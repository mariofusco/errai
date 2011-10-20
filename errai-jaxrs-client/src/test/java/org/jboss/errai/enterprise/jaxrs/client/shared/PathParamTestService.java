package org.jboss.errai.enterprise.jaxrs.client.shared;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HEAD;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/test/pathparam")
public interface PathParamTestService {

  @GET 
  @Path("/{id}")
  public long getWithPathParam(@PathParam("id") long id);

  @GET 
  @Path("/{id1}/{id2}")
  public String getWithMultiplePathParams(@PathParam("id1") long id1, @PathParam("id2") long id2);

  @GET 
  @Path("/{id1}/{id2}/{id1}")
  public String getWithReusedPathParam(@PathParam("id1") long id1, @PathParam("id2") long id2);
  
  @POST
  @Path("/{id}")
  public long postWithPathParam(@PathParam("id") long id);

  @PUT
  @Path("/{id}")
  public long putWithPathParam(@PathParam("id") long id);

  @DELETE
  @Path("/{id}")
  public long deleteWithPathParam(@PathParam("id") long id);
  
  @HEAD
  @Path("/{id}")
  public void headWithPathParam(@PathParam("id") long id);
}
