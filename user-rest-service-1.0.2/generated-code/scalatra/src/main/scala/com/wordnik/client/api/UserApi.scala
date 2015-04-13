package com.wordnik.client.api

import com.wordnik.client.model.User
import com.wordnik.client.model.Void


import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class UserApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "UserApi"
  override protected val applicationName: Option[String] = Some("User")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }


  

  val getUserOperation = (apiOperation[User]("getUser")
      summary "read User by ID"
      parameters(
        queryParam[Long]("id").description("")
        
        
        
        
        
        
        )
  )

  get("/user",operation(getUserOperation)) {
    
    
    
    

    
      
      val id = params.getAs[Long]("id")
      
    

    

    

    
    
    println("id: " + id)
  
  }


  

  val saveUserOperation = (apiOperation[User]("saveUser")
      summary "create or update a user name by id"
      parameters(
        queryParam[Long]("id").description("")
        
        
        
        
        
        ,
        queryParam[String]("name").description("")
        
        
        
        
        
        
        )
  )

  post("/user",operation(saveUserOperation)) {
    
    
    
    

    
      
      val id = params.getAs[Long]("id")
      
    

    

    

    
    
    println("id: " + id)
  
    
    
    

    
      
      val name = params.getAs[String]("name")
      
    

    

    

    
    
    println("name: " + name)
  
  }



}