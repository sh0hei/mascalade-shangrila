package com.github.sh0hei.mascalade.shangrila

case class Anime(
  id: Long,
  title: String,
  titleShort1: Option[String],
  titleShort2: Option[String],
  titleShort3: Option[String],
  publicUrl: String,
  twitterAccount: String,
  twitterHashTag: String,
  coursId: Int,
  createdAt: String,
  updatedAt: String,
  sex: Option[Int],
  sequel: Option[Int]
)

case class Cours(id: Long, year: Int, cours: Int)

object Cours {

  implicit def orderingByYM[A <: Cours]: Ordering[A] =
    Ordering.by(e => (e.year, e.cours))

  val orderingById: Ordering[Cours] = Ordering.by(e => e.id)
}

case class Description(id: Long, title: String)
