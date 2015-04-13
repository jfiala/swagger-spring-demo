package io.swagger.client.model

import io.swagger.client.model.ShowcaseDatatypePrimitives
import io.swagger.client.model.Category
import org.joda.time.DateTime
import io.swagger.client.model.ShowcaseDatatypeDate
import io.swagger.client.model.ShowcaseDatatypeMath
import io.swagger.client.model.Location






case class User (
  /* ID of the user */
  id: Long,
  /* Name of the user */
  name: String,
  /* First name of the user */
  firstName: String,
  /*  */
  state: String,
  /* demo for java.lang.Byte[] */
  photo: List[String],
  /* demo for java.util.List */
  categories: List[Category],
  locations: List[Location],
  primitives: ShowcaseDatatypePrimitives,
  math: ShowcaseDatatypeMath,
  date: ShowcaseDatatypeDate,
  /* created */
  createTimestamp: DateTime,
  /* last modified */
  modifyTimestamp: DateTime)
  

