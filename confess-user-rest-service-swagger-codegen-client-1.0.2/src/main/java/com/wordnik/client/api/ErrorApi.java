package com.wordnik.client.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.wordnik.client.common.ApiException;
import com.wordnik.client.common.ApiInvoker;
import com.wordnik.client.model.ModelAndView;

public class ErrorApi {
  String basePath = "/";
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

  public ResponseEntity error () throws ApiException {
    // create path and map variables
    String path = "/error".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, null, headerParams, contentType);
      if(response != null){
        return (ResponseEntity) ApiInvoker.deserialize(response, "", ResponseEntity.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public ModelAndView errorHtml () throws ApiException {
    // create path and map variables
    String path = "/error".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "HEAD", queryParams, null, headerParams, contentType);
      if(response != null){
        return (ModelAndView) ApiInvoker.deserialize(response, "", ModelAndView.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  }

