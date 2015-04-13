package io.swagger.client.model;

import java.util.Date;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * 
 **/
@ApiModel(description = "")
public class ShowcaseDatatypeDate  {
  
  private Date date = null;
  private Long calendar = null;

  
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

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("calendar")
  public Long getCalendar() {
    return calendar;
  }
  public void setCalendar(Long calendar) {
    this.calendar = calendar;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShowcaseDatatypeDate {\n");
    
    sb.append("  date: ").append(date).append("\n");
    sb.append("  calendar: ").append(calendar).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


