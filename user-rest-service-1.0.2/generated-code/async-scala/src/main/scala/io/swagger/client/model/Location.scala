package io.swagger.client.model

import org.joda.time.DateTime




case class Location (
  street: String,
  zip: String,
  city: String,
  country: String,
  latitude: Double,  // demo for java.math.BigDecimal
  longitude: Double  // demo for java.lang.Double
  
)

