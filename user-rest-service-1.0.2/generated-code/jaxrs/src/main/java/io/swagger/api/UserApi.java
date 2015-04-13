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

@Path("/user")
@com.wordnik.swagger.annotations.Api(value = "/user", description = "the user API")

public class UserApi {
  
  @GET
  
  @Consumes({ "application/json",  })
  @Produces({ "*/*" })
  @com.wordnik.swagger.annotations.ApiOperation(value = "read User by ID", notes = "pass ID to read user", response = User.class)
  @com.wordnik.swagger.annotations.ApiResponses(value = { 
    @com.wordnik.swagger.annotations.ApiResponse(code = 404, message = "User not found"),
    
    @com.wordnik.swagger.annotations.ApiResponse(code = 200, message = "success") })

  public Response getUser(@ApiParam(value = "id",required=true) @QueryParam("id") Long id)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  
  @POST
  
  @Consumes({ "application/json",  })
  @Produces({ "*/*" })
  @com.wordnik.swagger.annotations.ApiOperation(value = "create or update a user name by id", notes = "saveUser", response = User.class)
  @com.wordnik.swagger.annotations.ApiResponses(value = { 
    @com.wordnik.swagger.annotations.ApiResponse(code = 200, message = "success") })

  public Response saveUser(@ApiParam(value = "id",required=true) @QueryParam("id") Long id,
    @ApiParam(value = "name",required=true) @QueryParam("name") String name)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  
}

