package io.swagger.client.model;



import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;



@ApiModel(description = "")
public class ShowcaseDatatypeMath  {
  
  private Double bigDecimal = null;
  private Long bigInteger = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("bigDecimal")
  public Double getBigDecimal() {
    return bigDecimal;
  }
  public void setBigDecimal(Double bigDecimal) {
    this.bigDecimal = bigDecimal;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("bigInteger")
  public Long getBigInteger() {
    return bigInteger;
  }
  public void setBigInteger(Long bigInteger) {
    this.bigInteger = bigInteger;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShowcaseDatatypeMath {\n");
    
    sb.append("  bigDecimal: ").append(bigDecimal).append("\n");
    sb.append("  bigInteger: ").append(bigInteger).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


