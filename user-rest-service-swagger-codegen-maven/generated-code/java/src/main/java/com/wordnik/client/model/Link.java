package com.wordnik.client.model;

public class Link {
  private String rel = null;
  private String href = null;
  private Boolean templated = null;
  public String getRel() {
    return rel;
  }
  public void setRel(String rel) {
    this.rel = rel;
  }

  public String getHref() {
    return href;
  }
  public void setHref(String href) {
    this.href = href;
  }

  public Boolean getTemplated() {
    return templated;
  }
  public void setTemplated(Boolean templated) {
    this.templated = templated;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Link {\n");
    sb.append("  rel: ").append(rel).append("\n");
    sb.append("  href: ").append(href).append("\n");
    sb.append("  templated: ").append(templated).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

