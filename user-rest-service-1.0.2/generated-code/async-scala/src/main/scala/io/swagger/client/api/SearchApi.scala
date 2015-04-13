package io.swagger.client.api

import io.swagger.client.model.User

import com.wordnik.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable


class SearchApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def searchUsers(query: String)(implicit reader: ClientResponseReader[List[User]]): Future[List[User]] = {
    // create path and map variables
    val path = (addFmt("/search"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(query != null)   queryParams += "query" -> query.toString

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def saveUser(id: Long,
      name: String)(implicit reader: ClientResponseReader[User]): Future[User] = {
    // create path and map variables
    val path = (addFmt("/search"))

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

