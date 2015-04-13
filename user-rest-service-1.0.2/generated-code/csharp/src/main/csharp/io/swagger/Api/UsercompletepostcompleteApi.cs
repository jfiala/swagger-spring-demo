using System;
using System.Collections.Generic;
using io.swagger.client;
using io.swagger.Model;



namespace io.swagger.Api {
  
  public class UsercompletepostcompleteApi {
    string basePath;
    private readonly ApiInvoker apiInvoker = ApiInvoker.GetInstance();

    public UsercompletepostcompleteApi(String basePath = "http://localhost/")
    {
      this.basePath = basePath;
    }

    public ApiInvoker getInvoker() {
      return apiInvoker;
    }

    // Sets the endpoint base url for the services being accessed
    public void setBasePath(string basePath) {
      this.basePath = basePath;
    }

    // Gets the endpoint base url for the services being accessed
    public String getBasePath() {
      return basePath;
    }

    

    /// <summary>
    /// create or update a user name by id saveUserComplete
    /// </summary>
    /// <param name="Body">user</param>
    
    /// <returns></returns>
    public User  saveUserComplete (User Body) {
      // create path and map variables
      var path = "/user_complete_post_complete".Replace("{format}","json");

      // query params
      var queryParams = new Dictionary<String, String>();
      var headerParams = new Dictionary<String, String>();
      var formParams = new Dictionary<String, object>();

      

      

      

      

      try {
        if (typeof(User) == typeof(byte[])) {
          
          var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
          return ((object)response) as User;
          
          
        } else {
          
          var response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, Body, headerParams, formParams);
          if (response != null){
             return (User) ApiInvoker.deserialize(response, typeof(User));
          }
          else {
            return null;
          }
          
          
        }
      } catch (ApiException ex) {
        if(ex.ErrorCode == 404) {
          return null;
        }
        else {
          throw ex;
        }
      }
    }
    
  }
  
}
