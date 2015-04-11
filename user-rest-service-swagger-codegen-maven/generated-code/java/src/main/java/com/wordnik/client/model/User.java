package com.wordnik.client.model;

import java.util.*;
import com.wordnik.client.model.Category;
import com.wordnik.client.model.Location;
public class User {
  /* ID of the user */
  private Long id = null;
  private List<Location> locations = new ArrayList<Location>();
  /* Name of the user */
  private String name = null;
  private User state = null;
  //public enum stateEnum { ACTIVE, DISABLED, }; 
  private List<Category> categories = new ArrayList<Category>();
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  public List<Location> getLocations() {
    return locations;
  }
  public void setLocations(List<Location> locations) {
    this.locations = locations;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public User getState() {
    return state;
  }
  public void setState(User state) {
    this.state = state;
  }

  public List<Category> getCategories() {
    return categories;
  }
  public void setCategories(List<Category> categories) {
    this.categories = categories;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  locations: ").append(locations).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  categories: ").append(categories).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

