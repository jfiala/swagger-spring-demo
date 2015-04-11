package com.wordnik.client.model;

import com.wordnik.client.model.Object;
import com.wordnik.client.model.View;
import com.wordnik.client.model.ModelMap;
public class ModelAndView {
  private View view = null;
  private Object model = null;
  private Boolean empty = null;
  private String viewName = null;
  private Boolean reference = null;
  private ModelMap modelMap = null;
  public View getView() {
    return view;
  }
  public void setView(View view) {
    this.view = view;
  }

  public Object getModel() {
    return model;
  }
  public void setModel(Object model) {
    this.model = model;
  }

  public Boolean getEmpty() {
    return empty;
  }
  public void setEmpty(Boolean empty) {
    this.empty = empty;
  }

  public String getViewName() {
    return viewName;
  }
  public void setViewName(String viewName) {
    this.viewName = viewName;
  }

  public Boolean getReference() {
    return reference;
  }
  public void setReference(Boolean reference) {
    this.reference = reference;
  }

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
    sb.append("  viewName: ").append(viewName).append("\n");
    sb.append("  reference: ").append(reference).append("\n");
    sb.append("  modelMap: ").append(modelMap).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

