package io.swagger.client.model;



import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;



@ApiModel(description = "")
public class TimeZone  {
  
  private String displayName = null;
  private Integer rawOffset = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  
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
    
    sb.append("  displayName: ").append(displayName).append("\n");
    sb.append("  rawOffset: ").append(rawOffset).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


