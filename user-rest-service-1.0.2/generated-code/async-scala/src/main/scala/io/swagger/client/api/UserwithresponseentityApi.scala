package io.swagger.client.api

import io.swagger.client.model.Any

import com.wordnik.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable


class UserwithresponseentityApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def getUserResponseEntity(id: Long)(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/user_with_responseentity"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(id != null)   queryParams += "id" -> id.toString

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  

}

