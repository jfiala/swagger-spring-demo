package io.swagger.client.model;

import io.swagger.client.model.Category;
import io.swagger.client.model.Location;
import java.util.*;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * User object
 **/
@ApiModel(description = "User object")
public class User  {
  
  private Long id = null;
  private String name = null;
  public enum StateEnum {
     ACTIVE,  DISABLED, 
  };
  private StateEnum state = null;
  private List<String> photo = new ArrayList<String>() ;
  private List<Category> categories = new ArrayList<Category>() ;
  private List<Location> locations = new ArrayList<Location>() ;

  
  /**
   * ID of the user
   **/
  @ApiModelProperty(value = "ID of the user")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Name of the user
   **/
  @ApiModelProperty(value = "Name of the user")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  /**
   * demo for java.lang.Byte[]
   **/
  @ApiModelProperty(value = "demo for java.lang.Byte[]")
  @JsonProperty("photo")
  public List<String> getPhoto() {
    return photo;
  }
  public void setPhoto(List<String> photo) {
    this.photo = photo;
  }

  
  /**
   * demo for java.util.List
   **/
  @ApiModelProperty(value = "demo for java.util.List")
  @JsonProperty("categories")
  public List<Category> getCategories() {
    return categories;
  }
  public void setCategories(List<Category> categories) {
    this.categories = categories;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("locations")
  public List<Location> getLocations() {
    return locations;
  }
  public void setLocations(List<Location> locations) {
    this.locations = locations;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  photo: ").append(photo).append("\n");
    sb.append("  categories: ").append(categories).append("\n");
    sb.append("  locations: ").append(locations).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


