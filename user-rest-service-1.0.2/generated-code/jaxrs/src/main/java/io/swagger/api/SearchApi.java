package io.swagger.api;

import io.swagger.model.*;

import com.wordnik.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.User;


import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/search")
@com.wordnik.swagger.annotations.Api(value = "/search", description = "the search API")

public class SearchApi {
  
  @GET
  
  @Consumes({ "application/json",  })
  @Produces({ "*/*" })
  @com.wordnik.swagger.annotations.ApiOperation(value = "search for users by name-part", notes = "search for users", response = User.class, responseContainer = "List")
  @com.wordnik.swagger.annotations.ApiResponses(value = { 
    @com.wordnik.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
    
    @com.wordnik.swagger.annotations.ApiResponse(code = 200, message = "success"),
    
    @com.wordnik.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
    
    @com.wordnik.swagger.annotations.ApiResponse(code = 403, message = "Forbidden") })

  public Response searchUsers(@ApiParam(value = "query",required=true) @QueryParam("query") String query)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  
  @POST
  
  @Consumes({ "application/json",  })
  @Produces({ "*/*" })
  @com.wordnik.swagger.annotations.ApiOperation(value = "create or update a user name by id", notes = "saveUser", response = User.class)
  @com.wordnik.swagger.annotations.ApiResponses(value = { 
    @com.wordnik.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
    
    @com.wordnik.swagger.annotations.ApiResponse(code = 200, message = "success"),
    
    @com.wordnik.swagger.annotations.ApiResponse(code = 201, message = "Created"),
    
    @com.wordnik.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
    
    @com.wordnik.swagger.annotations.ApiResponse(code = 403, message = "Forbidden") })

  public Response saveUser(@ApiParam(value = "id",required=true) @QueryParam("id") Long id,
    @ApiParam(value = "name",required=true) @QueryParam("name") String name)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  
}

