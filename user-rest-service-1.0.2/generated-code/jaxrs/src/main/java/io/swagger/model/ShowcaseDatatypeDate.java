package io.swagger.model;

import java.util.Date;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * 
 **/
@ApiModel(description = "")
public class ShowcaseDatatypeDate  {
  
  private Date date = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("date")
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShowcaseDatatypeDate {\n");
    
    sb.append("  date: ").append(date).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


