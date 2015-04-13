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

@Path("/user_complete_post_complete")
@com.wordnik.swagger.annotations.Api(value = "/user_complete_post_complete", description = "the user_complete_post_complete API")

public class User_complete_post_completeApi {
  
  @POST
  
  @Consumes({ "application/json",  })
  @Produces({ "*/*" })
  @com.wordnik.swagger.annotations.ApiOperation(value = "create or update a user name by id", notes = "saveUserComplete", response = User.class)
  @com.wordnik.swagger.annotations.ApiResponses(value = { 
    @com.wordnik.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
    
    @com.wordnik.swagger.annotations.ApiResponse(code = 200, message = "success"),
    
    @com.wordnik.swagger.annotations.ApiResponse(code = 201, message = "Created"),
    
    @com.wordnik.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
    
    @com.wordnik.swagger.annotations.ApiResponse(code = 403, message = "Forbidden") })

  public Response saveUserComplete(@ApiParam(value = "user"  ) User body)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  
}

