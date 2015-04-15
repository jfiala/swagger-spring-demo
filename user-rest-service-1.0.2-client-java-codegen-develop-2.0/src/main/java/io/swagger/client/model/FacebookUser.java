package io.swagger.client.model;

import io.swagger.client.model.Category;
import java.util.*;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * 
 **/
@ApiModel(description = "")
public class FacebookUser  {
  
  private Long id = null;
  private String name = null;
  private String about = null;
  private String description = null;
  private String founded = null;
  private List<Category> categoryList = new ArrayList<Category>() ;
  private String mission = null;

  
  /**
   * Page ID. No access token is required to access this field
   **/
  @ApiModelProperty(value = "Page ID. No access token is required to access this field")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Information about the Page
   **/
  @ApiModelProperty(value = "Information about the Page")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("about")
  public String getAbout() {
    return about;
  }
  public void setAbout(String about) {
    this.about = about;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("founded")
  public String getFounded() {
    return founded;
  }
  public void setFounded(String founded) {
    this.founded = founded;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("category_list")
  public List<Category> getCategoryList() {
    return categoryList;
  }
  public void setCategoryList(List<Category> categoryList) {
    this.categoryList = categoryList;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("mission")
  public String getMission() {
    return mission;
  }
  public void setMission(String mission) {
    this.mission = mission;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacebookUser {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  about: ").append(about).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  founded: ").append(founded).append("\n");
    sb.append("  categoryList: ").append(categoryList).append("\n");
    sb.append("  mission: ").append(mission).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


