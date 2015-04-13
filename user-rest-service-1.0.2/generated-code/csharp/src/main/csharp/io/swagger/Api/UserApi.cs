using System;
using System.Collections.Generic;
using io.swagger.client;
using io.swagger.Model;





namespace io.swagger.Api {
  
  public class UserApi {
    string basePath;
    private readonly ApiInvoker apiInvoker = ApiInvoker.GetInstance();

    public UserApi(String basePath = "http://localhost/")
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
    /// read User by ID pass ID to read user
    /// </summary>
    /// <param name="Id">id</param>
    
    /// <returns></returns>
    public User  getUser (long? Id) {
      // create path and map variables
      var path = "/user".Replace("{format}","json");

      // query params
      var queryParams = new Dictionary<String, String>();
      var headerParams = new Dictionary<String, String>();
      var formParams = new Dictionary<String, object>();

      

      if (Id != null){
        queryParams.Add("id", apiInvoker.ParameterToString(Id));
      }
      

      

      

      try {
        if (typeof(User) == typeof(byte[])) {
          
          var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
          return ((object)response) as User;
          
          
        } else {
          
          var response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
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
    

    /// <summary>
    /// create or update a user name by id saveUser
    /// </summary>
    /// <param name="Id">id</param>
     /// <param name="Name">name</param>
    
    /// <returns></returns>
    public User  saveUser (long? Id, string Name) {
      // create path and map variables
      var path = "/user".Replace("{format}","json");

      // query params
      var queryParams = new Dictionary<String, String>();
      var headerParams = new Dictionary<String, String>();
      var formParams = new Dictionary<String, object>();

      

      if (Id != null){
        queryParams.Add("id", apiInvoker.ParameterToString(Id));
      }
      if (Name != null){
        queryParams.Add("name", apiInvoker.ParameterToString(Name));
      }
      

      

      

      try {
        if (typeof(User) == typeof(byte[])) {
          
          var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
          return ((object)response) as User;
          
          
        } else {
          
          var response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, null, headerParams, formParams);
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
