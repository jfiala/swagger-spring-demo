package io.swagger.client.model

import org.joda.time.DateTime




case class User (
  id: Long,  // ID of the user
  name: String,  // Name of the user
  firstName: String,  // First name of the user
  state: String,  // 
  photo: List[String],  // demo for java.lang.Byte[]
  categories: List[Category],  // demo for java.util.List
  locations: List[Location],
  primitives: ShowcaseDatatypePrimitives,
  math: ShowcaseDatatypeMath,
  date: ShowcaseDatatypeDate,
  createTimestamp: DateTime,  // created
  modifyTimestamp: DateTime  // last modified
  
)

