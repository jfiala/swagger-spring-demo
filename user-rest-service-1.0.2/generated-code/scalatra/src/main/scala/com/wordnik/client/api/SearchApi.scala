package com.wordnik.client.api

import com.wordnik.client.model.User


import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class SearchApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "SearchApi"
  override protected val applicationName: Option[String] = Some("Search")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }


  

  val searchUsersOperation = (apiOperation[List[User]]("searchUsers")
      summary "search for users by name-part"
      parameters(
        queryParam[String]("query").description("")
        
        
        
        
        
        
        )
  )

  get("/search",operation(searchUsersOperation)) {
    
    
    
    

    
      
      val query = params.getAs[String]("query")
      
    

    

    

    
    
    println("query: " + query)
  
  }


  

  val saveUserOperation = (apiOperation[User]("saveUser")
      summary "create or update a user name by id"
      parameters(
        queryParam[Long]("id").description("")
        
        
        
        
        
        ,
        queryParam[String]("name").description("")
        
        
        
        
        
        
        )
  )

  post("/search",operation(saveUserOperation)) {
    
    
    
    

    
      
      val id = params.getAs[Long]("id")
      
    

    

    

    
    
    println("id: " + id)
  
    
    
    

    
      
      val name = params.getAs[String]("name")
      
    

    

    

    
    
    println("name: " + name)
  
  }



}