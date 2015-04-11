package io.swagger.client.model;

import io.swagger.client.model.View;
import java.util.Map;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class ModelAndView  {
  
  private Boolean empty = null;
  private Object model = null;
  private Map<String, Object> modelMap = new HashMap<String, Object>() ;
  private Boolean reference = null;
  private View view = null;
  private String viewName = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("empty")
  public Boolean getEmpty() {
    return empty;
  }
  public void setEmpty(Boolean empty) {
    this.empty = empty;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("model")
  public Object getModel() {
    return model;
  }
  public void setModel(Object model) {
    this.model = model;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("modelMap")
  public Map<String, Object> getModelMap() {
    return modelMap;
  }
  public void setModelMap(Map<String, Object> modelMap) {
    this.modelMap = modelMap;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("reference")
  public Boolean getReference() {
    return reference;
  }
  public void setReference(Boolean reference) {
    this.reference = reference;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("view")
  public View getView() {
    return view;
  }
  public void setView(View view) {
    this.view = view;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("viewName")
  public String getViewName() {
    return viewName;
  }
  public void setViewName(String viewName) {
    this.viewName = viewName;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelAndView {\n");
    
    sb.append("  empty: ").append(empty).append("\n");
    sb.append("  model: ").append(model).append("\n");
    sb.append("  modelMap: ").append(modelMap).append("\n");
    sb.append("  reference: ").append(reference).append("\n");
    sb.append("  view: ").append(view).append("\n");
    sb.append("  viewName: ").append(viewName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
