package io.swagger.client.api

import io.swagger.client.model.Any

import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap


class UserwithresponseentityApi(val defBasePath: String = "http://localhost/",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  
  def getUserResponseEntity (id: Long) : Option[Any] = {
    // create path and map variables
    val path = "/user_with_responseentity".replaceAll("\\{format\\}","json")

    
    val contentType = {
      
      "application/json"
    }

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    

    if(String.valueOf(id) != "null") queryParams += "id" -> id.toString
    
    
    

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[Any]).asInstanceOf[Any])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
}
