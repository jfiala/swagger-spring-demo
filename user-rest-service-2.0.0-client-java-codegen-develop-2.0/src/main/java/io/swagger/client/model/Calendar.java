package io.swagger.client.model;

import java.util.Date;
import io.swagger.client.model.TimeZone;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;



@ApiModel(description = "")
public class Calendar  {
  
  private Integer firstDayOfWeek = null;
  private Boolean lenient = null;
  private Integer minimalDaysInFirstWeek = null;
  private Date time = null;
  private Long timeInMillis = null;
  private TimeZone timeZone = null;
  private Boolean weekDateSupported = null;
  private Integer weekYear = null;
  private Integer weeksInWeekYear = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("firstDayOfWeek")
  public Integer getFirstDayOfWeek() {
    return firstDayOfWeek;
  }
  public void setFirstDayOfWeek(Integer firstDayOfWeek) {
    this.firstDayOfWeek = firstDayOfWeek;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("lenient")
  public Boolean getLenient() {
    return lenient;
  }
  public void setLenient(Boolean lenient) {
    this.lenient = lenient;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("minimalDaysInFirstWeek")
  public Integer getMinimalDaysInFirstWeek() {
    return minimalDaysInFirstWeek;
  }
  public void setMinimalDaysInFirstWeek(Integer minimalDaysInFirstWeek) {
    this.minimalDaysInFirstWeek = minimalDaysInFirstWeek;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("time")
  public Date getTime() {
    return time;
  }
  public void setTime(Date time) {
    this.time = time;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("timeInMillis")
  public Long getTimeInMillis() {
    return timeInMillis;
  }
  public void setTimeInMillis(Long timeInMillis) {
    this.timeInMillis = timeInMillis;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("timeZone")
  public TimeZone getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(TimeZone timeZone) {
    this.timeZone = timeZone;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("weekDateSupported")
  public Boolean getWeekDateSupported() {
    return weekDateSupported;
  }
  public void setWeekDateSupported(Boolean weekDateSupported) {
    this.weekDateSupported = weekDateSupported;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("weekYear")
  public Integer getWeekYear() {
    return weekYear;
  }
  public void setWeekYear(Integer weekYear) {
    this.weekYear = weekYear;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("weeksInWeekYear")
  public Integer getWeeksInWeekYear() {
    return weeksInWeekYear;
  }
  public void setWeeksInWeekYear(Integer weeksInWeekYear) {
    this.weeksInWeekYear = weeksInWeekYear;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Calendar {\n");
    
    sb.append("  firstDayOfWeek: ").append(firstDayOfWeek).append("\n");
    sb.append("  lenient: ").append(lenient).append("\n");
    sb.append("  minimalDaysInFirstWeek: ").append(minimalDaysInFirstWeek).append("\n");
    sb.append("  time: ").append(time).append("\n");
    sb.append("  timeInMillis: ").append(timeInMillis).append("\n");
    sb.append("  timeZone: ").append(timeZone).append("\n");
    sb.append("  weekDateSupported: ").append(weekDateSupported).append("\n");
    sb.append("  weekYear: ").append(weekYear).append("\n");
    sb.append("  weeksInWeekYear: ").append(weeksInWeekYear).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


