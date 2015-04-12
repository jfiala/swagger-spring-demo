package io.swagger.client.model;

import java.util.Date;
import io.swagger.client.model.Locale;
import io.swagger.client.model.TimeZone;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * 
 **/
@ApiModel(description = "")
public class Calendar  {
  
  private Date time = null;
  private Boolean lenient = null;
  private Integer firstDayOfWeek = null;
  private Integer minimalDaysInFirstWeek = null;
  private TimeZone timeZone = null;
  private Long timeInMillis = null;
  private Integer fieldsNormalized = null;
  private Boolean zoneShared = null;
  private Integer fieldsComputed = null;
  private Locale weekCountData = null;

  
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
  @JsonProperty("fieldsNormalized")
  public Integer getFieldsNormalized() {
    return fieldsNormalized;
  }
  public void setFieldsNormalized(Integer fieldsNormalized) {
    this.fieldsNormalized = fieldsNormalized;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("zoneShared")
  public Boolean getZoneShared() {
    return zoneShared;
  }
  public void setZoneShared(Boolean zoneShared) {
    this.zoneShared = zoneShared;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("fieldsComputed")
  public Integer getFieldsComputed() {
    return fieldsComputed;
  }
  public void setFieldsComputed(Integer fieldsComputed) {
    this.fieldsComputed = fieldsComputed;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("weekCountData")
  public Locale getWeekCountData() {
    return weekCountData;
  }
  public void setWeekCountData(Locale weekCountData) {
    this.weekCountData = weekCountData;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Calendar {\n");
    
    sb.append("  time: ").append(time).append("\n");
    sb.append("  lenient: ").append(lenient).append("\n");
    sb.append("  firstDayOfWeek: ").append(firstDayOfWeek).append("\n");
    sb.append("  minimalDaysInFirstWeek: ").append(minimalDaysInFirstWeek).append("\n");
    sb.append("  timeZone: ").append(timeZone).append("\n");
    sb.append("  timeInMillis: ").append(timeInMillis).append("\n");
    sb.append("  fieldsNormalized: ").append(fieldsNormalized).append("\n");
    sb.append("  zoneShared: ").append(zoneShared).append("\n");
    sb.append("  fieldsComputed: ").append(fieldsComputed).append("\n");
    sb.append("  weekCountData: ").append(weekCountData).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


