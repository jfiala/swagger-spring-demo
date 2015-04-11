package io.swagger.client.model;

import io.swagger.client.model.Category;
import java.util.Map;
import io.swagger.client.model.Location;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * User object
 **/
@ApiModel(description = "User object")
public class User  {
  
  private List<Category> categories = new ArrayList<Category>() ;
  private Long id = null;
  private Map<String, Location> locationMap = new HashMap<String, Location>() ;
  private List<Location> locations = new ArrayList<Location>() ;
  private String name = null;
  private List<String> photo = new ArrayList<String>() ;
  public enum StateEnum {
     ACTIVE,  DISABLED, 
  };
  private StateEnum state = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("categories")
  public List<Category> getCategories() {
    return categories;
  }
  public void setCategories(List<Category> categories) {
    this.categories = categories;
  }

  
  /**
   * ID of the user
   **/
  @ApiModelProperty(required = true, value = "ID of the user")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("locationMap")
  public Map<String, Location> getLocationMap() {
    return locationMap;
  }
  public void setLocationMap(Map<String, Location> locationMap) {
    this.locationMap = locationMap;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("locations")
  public List<Location> getLocations() {
    return locations;
  }
  public void setLocations(List<Location> locations) {
    this.locations = locations;
  }

  
  /**
   * Name of the user
   **/
  @ApiModelProperty(required = true, value = "Name of the user")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("photo")
  public List<String> getPhoto() {
    return photo;
  }
  public void setPhoto(List<String> photo) {
    this.photo = photo;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("  categories: ").append(categories).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  locationMap: ").append(locationMap).append("\n");
    sb.append("  locations: ").append(locations).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  photo: ").append(photo).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
