package io.swagger.client.api

import io.swagger.client.model.User

import com.wordnik.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable


class UserApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def getUser(id: Long)(implicit reader: ClientResponseReader[User]): Future[User] = {
    // create path and map variables
    val path = (addFmt("/user"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(id != null)   queryParams += "id" -> id.toString

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def saveUser(id: Long,
      name: String)(implicit reader: ClientResponseReader[User]): Future[User] = {
    // create path and map variables
    val path = (addFmt("/user"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(id != null)   queryParams += "id" -> id.toString
    if(name != null)   queryParams += "name" -> name.toString

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  

}

