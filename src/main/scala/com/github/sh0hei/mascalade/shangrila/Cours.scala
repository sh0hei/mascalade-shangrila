package com.github.sh0hei.mascalade.shangrila

import org.json4s._

case class Cours(id: Long, year: Int, cours: Int)

object Cours {

  implicit val formats = DefaultFormats

  private case class RawCours(id: Int, cours: Cours) {
    def build: Cours = Cours(cours.id, cours.year, cours.cours)
  }

  def fromJson(obj: JValue): Option[Cours] = {
    obj.extractOpt[RawCours].map(_.build)
  }
}