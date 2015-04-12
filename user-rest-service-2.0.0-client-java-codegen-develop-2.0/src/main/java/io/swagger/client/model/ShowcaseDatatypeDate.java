package io.swagger.client.model;

import java.util.Date;
import io.swagger.client.model.Calendar;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;



@ApiModel(description = "")
public class ShowcaseDatatypeDate  {
  
  private Calendar calendar = null;
  private Date date = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("calendar")
  public Calendar getCalendar() {
    return calendar;
  }
  public void setCalendar(Calendar calendar) {
    this.calendar = calendar;
  }

  
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
    
    sb.append("  calendar: ").append(calendar).append("\n");
    sb.append("  date: ").append(date).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


