package io.swagger.client.model;



import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * 
 **/
@ApiModel(description = "")
public class GoogleMapsLocation  {
  
  private String formattedAddress = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("formatted_address")
  public String getFormattedAddress() {
    return formattedAddress;
  }
  public void setFormattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleMapsLocation {\n");
    
    sb.append("  formattedAddress: ").append(formattedAddress).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


