package io.swagger.client.api

import io.swagger.client.model.User

import com.wordnik.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable


class UsercompletepostcompleteApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def saveUserComplete(id: Long,
      user: String)(implicit reader: ClientResponseReader[User]): Future[User] = {
    // create path and map variables
    val path = (addFmt("/user_complete_post_complete"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(id != null)   queryParams += "id" -> id.toString
    if(user != null)   queryParams += "user" -> user.toString

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  

}

