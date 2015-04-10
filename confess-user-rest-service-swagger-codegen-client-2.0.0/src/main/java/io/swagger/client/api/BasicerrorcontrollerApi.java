package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;

import java.util.HashMap;
import java.util.Map;

import com.sun.jersey.multipart.FormDataMultiPart;

public class BasicerrorcontrollerApi {
  String basePath = "https://localhost:8080/";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  
  /**
   * error
   * error
   * @return Map<String, Object>
   */
  public Map<String, Object> error () throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/error".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    
    String[] contentTypes = {
      "application/json",
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Map<String, Object>) ApiInvoker.deserialize(response, "map", Map.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
    
}
