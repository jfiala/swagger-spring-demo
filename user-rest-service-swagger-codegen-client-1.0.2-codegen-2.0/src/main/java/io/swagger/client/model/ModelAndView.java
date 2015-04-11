package io.swagger.client.model;

import io.swagger.client.model.View;
import io.swagger.client.model.ModelMap;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * 
 **/
@ApiModel(description = "")
public class ModelAndView  {
  
  private View view = null;
  private Object model = null;
  private Boolean empty = null;
  private Boolean reference = null;
  private String viewName = null;
  private ModelMap modelMap = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("view")
  public View getView() {
    return view;
  }
  public void setView(View view) {
    this.view = view;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("model")
  public Object getModel() {
    return model;
  }
  public void setModel(Object model) {
    this.model = model;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("empty")
  public Boolean getEmpty() {
    return empty;
  }
  public void setEmpty(Boolean empty) {
    this.empty = empty;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("reference")
  public Boolean getReference() {
    return reference;
  }
  public void setReference(Boolean reference) {
    this.reference = reference;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("viewName")
  public String getViewName() {
    return viewName;
  }
  public void setViewName(String viewName) {
    this.viewName = viewName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("modelMap")
  public ModelMap getModelMap() {
    return modelMap;
  }
  public void setModelMap(ModelMap modelMap) {
    this.modelMap = modelMap;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelAndView {\n");
    
    sb.append("  view: ").append(view).append("\n");
    sb.append("  model: ").append(model).append("\n");
    sb.append("  empty: ").append(empty).append("\n");
    sb.append("  reference: ").append(reference).append("\n");
    sb.append("  viewName: ").append(viewName).append("\n");
    sb.append("  modelMap: ").append(modelMap).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


