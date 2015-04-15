package io.swagger.client.model;



import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * 
 **/
@ApiModel(description = "")
public class ShowcaseDatatypePrimitives  {
  
  private String singleByte = null;
  private Integer tinyNumber = null;
  private Integer counter = null;
  private Long id = null;
  private Double budget = null;
  private Boolean deleted = null;
  private String singleCharacter = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("singleByte")
  public String getSingleByte() {
    return singleByte;
  }
  public void setSingleByte(String singleByte) {
    this.singleByte = singleByte;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("tinyNumber")
  public Integer getTinyNumber() {
    return tinyNumber;
  }
  public void setTinyNumber(Integer tinyNumber) {
    this.tinyNumber = tinyNumber;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("counter")
  public Integer getCounter() {
    return counter;
  }
  public void setCounter(Integer counter) {
    this.counter = counter;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("budget")
  public Double getBudget() {
    return budget;
  }
  public void setBudget(Double budget) {
    this.budget = budget;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("deleted")
  public Boolean getDeleted() {
    return deleted;
  }
  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("singleCharacter")
  public String getSingleCharacter() {
    return singleCharacter;
  }
  public void setSingleCharacter(String singleCharacter) {
    this.singleCharacter = singleCharacter;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShowcaseDatatypePrimitives {\n");
    
    sb.append("  singleByte: ").append(singleByte).append("\n");
    sb.append("  tinyNumber: ").append(tinyNumber).append("\n");
    sb.append("  counter: ").append(counter).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  budget: ").append(budget).append("\n");
    sb.append("  deleted: ").append(deleted).append("\n");
    sb.append("  singleCharacter: ").append(singleCharacter).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


