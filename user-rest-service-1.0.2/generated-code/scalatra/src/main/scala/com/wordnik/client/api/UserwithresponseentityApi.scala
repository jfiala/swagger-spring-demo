package com.wordnik.client.api

import com.wordnik.client.model.Void


import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class UserwithresponseentityApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "UserwithresponseentityApi"
  override protected val applicationName: Option[String] = Some("Userwithresponseentity")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }


  

  val getUserResponseEntityOperation = (apiOperation[Object]("getUserResponseEntity")
      summary "getUserResponseEntity"
      parameters(
        queryParam[Long]("id").description("")
        
        
        
        
        
        
        )
  )

  get("/user_with_responseentity",operation(getUserResponseEntityOperation)) {
    
    
    
    

    
      
      val id = params.getAs[Long]("id")
      
    

    

    

    
    
    println("id: " + id)
  
  }



}