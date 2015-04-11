package com.wordnik.client.model;

public class Cover {
  private Long id = null;
  private String source = null;
  private Long offset_x = null;
  private Long offset_y = null;
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  public Long getOffset_x() {
    return offset_x;
  }
  public void setOffset_x(Long offset_x) {
    this.offset_x = offset_x;
  }

  public Long getOffset_y() {
    return offset_y;
  }
  public void setOffset_y(Long offset_y) {
    this.offset_y = offset_y;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cover {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  source: ").append(source).append("\n");
    sb.append("  offset_x: ").append(offset_x).append("\n");
    sb.append("  offset_y: ").append(offset_y).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

