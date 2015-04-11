package io.swagger.client.model;

import io.swagger.client.model.User;
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
  private User state = null;
  private List<String> bytes = new ArrayList<String>() ;

  
  /**
   * ID of the user
   **/
  @ApiModelProperty(required = false, value = "ID of the user")
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
  @ApiModelProperty(required = false, value = "Name of the user")
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
  @JsonProperty("state")
  public User getState() {
    return state;
  }
  public void setState(User state) {
    this.state = state;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("bytes")
  public List<String> getBytes() {
    return bytes;
  }
  public void setBytes(List<String> bytes) {
    this.bytes = bytes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  bytes: ").append(bytes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
