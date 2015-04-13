package com.wordnik.client.model

import com.wordnik.client.model.ShowcaseDatatypePrimitives
import com.wordnik.client.model.Category
import java.util.Date
import com.wordnik.client.model.ShowcaseDatatypeDate
import com.wordnik.client.model.ShowcaseDatatypeMath
import com.wordnik.client.model.Location





case class User (
  id: Long,
  name: String,
  firstName: String,
  state: String,
  photo: List[String],
  categories: List[Category],
  locations: List[Location],
  primitives: ShowcaseDatatypePrimitives,
  math: ShowcaseDatatypeMath,
  date: ShowcaseDatatypeDate,
  createTimestamp: Date,
  modifyTimestamp: Date
)

