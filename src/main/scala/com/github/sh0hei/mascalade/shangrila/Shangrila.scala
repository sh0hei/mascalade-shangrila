package com.github.sh0hei.mascalade.shangrila

trait Shangrila {

  def getCours: Seq[Cours]

  def getDescriptions(year: Int): Seq[Description]

  def getAnimes(year: Int, month: Int): Seq[Anime]
}

object Shangrila {

  def apply(): Shangrila = {
    return new ShangrilaImpl()
  }
}