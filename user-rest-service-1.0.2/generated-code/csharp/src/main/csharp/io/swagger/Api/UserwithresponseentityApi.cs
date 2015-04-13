using System;
using System.Collections.Generic;
using io.swagger.client;
using io.swagger.Model;




namespace io.swagger.Api {
  
  public class UserwithresponseentityApi {
    string basePath;
    private readonly ApiInvoker apiInvoker = ApiInvoker.GetInstance();

    public UserwithresponseentityApi(String basePath = "http://localhost/")
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
    /// getUserResponseEntity getUserResponseEntity
    /// </summary>
    /// <param name="Id">id</param>
    
    /// <returns></returns>
    public object  getUserResponseEntity (long? Id) {
      // create path and map variables
      var path = "/user_with_responseentity".Replace("{format}","json");

      // query params
      var queryParams = new Dictionary<String, String>();
      var headerParams = new Dictionary<String, String>();
      var formParams = new Dictionary<String, object>();

      

      if (Id != null){
        queryParams.Add("id", apiInvoker.ParameterToString(Id));
      }
      

      

      

      try {
        if (typeof(object) == typeof(byte[])) {
          
          var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
          return ((object)response) as object;
          
          
        } else {
          
          var response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
          if (response != null){
             return (object) ApiInvoker.deserialize(response, typeof(object));
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
