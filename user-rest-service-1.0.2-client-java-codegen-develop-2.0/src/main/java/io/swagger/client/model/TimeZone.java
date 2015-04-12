package io.swagger.client.model;



import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * 
 **/
@ApiModel(description = "")
public class TimeZone  {
  
  private Integer rawOffset = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("rawOffset")
  public Integer getRawOffset() {
    return rawOffset;
  }
  public void setRawOffset(Integer rawOffset) {
    this.rawOffset = rawOffset;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeZone {\n");
    
    sb.append("  rawOffset: ").append(rawOffset).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


