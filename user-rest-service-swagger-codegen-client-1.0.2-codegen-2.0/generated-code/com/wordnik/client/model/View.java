package com.wordnik.client.model;

public class View {
  private String contentType = null;
  public String getContentType() {
    return contentType;
  }
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class View {\n");
    sb.append("  contentType: ").append(contentType).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

