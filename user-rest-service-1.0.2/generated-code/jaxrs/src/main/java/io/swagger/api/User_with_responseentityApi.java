package io.swagger.api;

import io.swagger.model.*;

import com.wordnik.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Object;


import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/user_with_responseentity")
@com.wordnik.swagger.annotations.Api(value = "/user_with_responseentity", description = "the user_with_responseentity API")

public class User_with_responseentityApi {
  
  @GET
  
  @Consumes({ "application/json",  })
  @Produces({ "*/*" })
  @com.wordnik.swagger.annotations.ApiOperation(value = "getUserResponseEntity", notes = "getUserResponseEntity", response = Object.class)
  @com.wordnik.swagger.annotations.ApiResponses(value = { 
    @com.wordnik.swagger.annotations.ApiResponse(code = 404, message = "User has not been found"),
    
    @com.wordnik.swagger.annotations.ApiResponse(code = 200, message = "success"),
    
    @com.wordnik.swagger.annotations.ApiResponse(code = 500, message = "Unexpected Error") })

  public Response getUserResponseEntity(@ApiParam(value = "id",required=true) @QueryParam("id") Long id)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  
}

