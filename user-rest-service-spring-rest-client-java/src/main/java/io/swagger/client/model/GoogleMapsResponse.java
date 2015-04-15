package io.swagger.client.model;

import io.swagger.client.model.GoogleMapsLocation;
import java.util.*;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * 
 **/
@ApiModel(description = "")
public class GoogleMapsResponse  {
  
  private List<GoogleMapsLocation> locations = new ArrayList<GoogleMapsLocation>() ;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("locations")
  public List<GoogleMapsLocation> getLocations() {
    return locations;
  }
  public void setLocations(List<GoogleMapsLocation> locations) {
    this.locations = locations;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleMapsResponse {\n");
    
    sb.append("  locations: ").append(locations).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


