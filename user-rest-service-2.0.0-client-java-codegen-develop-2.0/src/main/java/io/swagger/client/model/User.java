package io.swagger.client.model;

import io.swagger.client.model.ShowcaseDatatypePrimitives;
import io.swagger.client.model.Category;
import io.swagger.client.model.ShowcaseDatatypeDate;
import io.swagger.client.model.ShowcaseDatatypeMath;
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
  private ShowcaseDatatypeDate date = null;
  private Long id = null;
  private Map<String, Location> locationMap = new HashMap<String, Location>() ;
  private List<Location> locations = new ArrayList<Location>() ;
  private ShowcaseDatatypeMath math = null;
  private String name = null;
  private List<String> photo = new ArrayList<String>() ;
  private ShowcaseDatatypePrimitives primitives = null;
  public enum StateEnum {
     ACTIVE,  DISABLED, 
  };
  private StateEnum state = null;

  
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
  @JsonProperty("date")
  public ShowcaseDatatypeDate getDate() {
    return date;
  }
  public void setDate(ShowcaseDatatypeDate date) {
    this.date = date;
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
   * demo for java.util.Map
   **/
  @ApiModelProperty(value = "demo for java.util.Map")
  @JsonProperty("locationMap")
  public Map<String, Location> getLocationMap() {
    return locationMap;
  }
  public void setLocationMap(Map<String, Location> locationMap) {
    this.locationMap = locationMap;
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

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("math")
  public ShowcaseDatatypeMath getMath() {
    return math;
  }
  public void setMath(ShowcaseDatatypeMath math) {
    this.math = math;
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
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("primitives")
  public ShowcaseDatatypePrimitives getPrimitives() {
    return primitives;
  }
  public void setPrimitives(ShowcaseDatatypePrimitives primitives) {
    this.primitives = primitives;
  }

  
  /**
   * Current state
   **/
  @ApiModelProperty(value = "Current state")
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
    sb.append("  date: ").append(date).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  locationMap: ").append(locationMap).append("\n");
    sb.append("  locations: ").append(locations).append("\n");
    sb.append("  math: ").append(math).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  photo: ").append(photo).append("\n");
    sb.append("  primitives: ").append(primitives).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


