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

class UsercompletepostcompleteApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "UsercompletepostcompleteApi"
  override protected val applicationName: Option[String] = Some("Usercompletepostcomplete")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }


  

  val saveUserCompleteOperation = (apiOperation[User]("saveUserComplete")
      summary "create or update a user name by id"
      parameters(
        queryParam[Long]("id").description("")
        
        
        
        
        
        ,
        queryParam[String]("user").description("")
        
        
        
        
        
        
        )
  )

  post("/user_complete_post_complete",operation(saveUserCompleteOperation)) {
    
    
    
    

    
      
      val id = params.getAs[Long]("id")
      
    

    

    

    
    
    println("id: " + id)
  
    
    
    

    
      
      val user = params.getAs[String]("user")
      
    

    

    

    
    
    println("user: " + user)
  
  }



}