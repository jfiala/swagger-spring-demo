package io.swagger.client.model;

import io.swagger.client.model.ShowcaseDatatypePrimitives;
import io.swagger.client.model.Category;
import java.util.Date;
import io.swagger.client.model.ShowcaseDatatypeDate;
import io.swagger.client.model.ShowcaseDatatypeMath;
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
  private String firstName = null;
  public enum StateEnum {
     ACTIVE,  DISABLED, 
  };
  private StateEnum state = null;
  private List<String> photo = new ArrayList<String>() ;
  private List<Category> categories = new ArrayList<Category>() ;
  private List<Location> locations = new ArrayList<Location>() ;
  private ShowcaseDatatypePrimitives primitives = null;
  private ShowcaseDatatypeMath math = null;
  private ShowcaseDatatypeDate date = null;
  private Date createTimestamp = null;
  private Date modifyTimestamp = null;
  private String nickname = null;

  
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
   * First name of the user
   **/
  @ApiModelProperty(value = "First name of the user")
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
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
   * created
   **/
  @ApiModelProperty(value = "created")
  @JsonProperty("createTimestamp")
  public Date getCreateTimestamp() {
    return createTimestamp;
  }
  public void setCreateTimestamp(Date createTimestamp) {
    this.createTimestamp = createTimestamp;
  }

  
  /**
   * last modified
   **/
  @ApiModelProperty(value = "last modified")
  @JsonProperty("modifyTimestamp")
  public Date getModifyTimestamp() {
    return modifyTimestamp;
  }
  public void setModifyTimestamp(Date modifyTimestamp) {
    this.modifyTimestamp = modifyTimestamp;
  }

  
  /**
   * the nickname
   **/
  @ApiModelProperty(value = "the nickname")
  @JsonProperty("nickname")
  public String getNickname() {
    return nickname;
  }
  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  photo: ").append(photo).append("\n");
    sb.append("  categories: ").append(categories).append("\n");
    sb.append("  locations: ").append(locations).append("\n");
    sb.append("  primitives: ").append(primitives).append("\n");
    sb.append("  math: ").append(math).append("\n");
    sb.append("  date: ").append(date).append("\n");
    sb.append("  createTimestamp: ").append(createTimestamp).append("\n");
    sb.append("  modifyTimestamp: ").append(modifyTimestamp).append("\n");
    sb.append("  nickname: ").append(nickname).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


