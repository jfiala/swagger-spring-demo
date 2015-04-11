package io.swagger.client.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class View  {
  
  private String contentType = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("contentType")
  public String getContentType() {
    return contentType;
  }
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class View {\n");
    
    sb.append("  contentType: ").append(contentType).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
