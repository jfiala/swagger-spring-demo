package com.wordnik.client.model;

public class User object {
  /* ID of the user */
  private Long id = null;
  /* Name of the user */
  private String name = null;
  private String attributeWithoutDocs = null;
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getAttributeWithoutDocs() {
    return attributeWithoutDocs;
  }
  public void setAttributeWithoutDocs(String attributeWithoutDocs) {
    this.attributeWithoutDocs = attributeWithoutDocs;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class User object {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  attributeWithoutDocs: ").append(attributeWithoutDocs).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

