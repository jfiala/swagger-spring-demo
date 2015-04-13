package io.swagger.client.api

import io.swagger.client.model.User

import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap


class UsercompletepostcompleteApi(val defBasePath: String = "http://localhost/",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  
  def saveUserComplete (id: Long, user: String) : Option[User] = {
    // create path and map variables
    val path = "/user_complete_post_complete".replaceAll("\\{format\\}","json")

    
    val contentType = {
      
      "application/json"
    }

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    

    if(String.valueOf(id) != "null") queryParams += "id" -> id.toString
    if(String.valueOf(user) != "null") queryParams += "user" -> user.toString
    
    
    

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[User]).asInstanceOf[User])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
}
