package com.wordnik.client.model;

public class Location {
  private String zip = null;
  private String street = null;
  private Double longitude = null;
  private Double latitude = null;
  private String country = null;
  private String city = null;
  public String getZip() {
    return zip;
  }
  public void setZip(String zip) {
    this.zip = zip;
  }

  public String getStreet() {
    return street;
  }
  public void setStreet(String street) {
    this.street = street;
  }

  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    sb.append("  zip: ").append(zip).append("\n");
    sb.append("  street: ").append(street).append("\n");
    sb.append("  longitude: ").append(longitude).append("\n");
    sb.append("  latitude: ").append(latitude).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("  city: ").append(city).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

