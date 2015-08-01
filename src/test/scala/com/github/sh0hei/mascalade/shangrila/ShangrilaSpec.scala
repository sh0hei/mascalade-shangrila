package com.github.sh0hei.mascalade.shangrila

import org.specs2.mutable._

class ShangrilaSpec extends Specification {

  "mascalade-shangrila" should {

    "calls Cours API" in {
      val cours = Shangrila.getCours
      println(cours.take(3))
      cours.size must be_>(0)
    }

    "calls Descriptions API" in {
      val descriptions = Shangrila.getDescriptions(2015)
      println(descriptions.take(3))
      descriptions.size must be_>(0)
    }

    "calls Animes API" in {
      val animes = Shangrila.getAnimes(2015, 1)
      println(animes.take(3))
      animes.size must be_>(0)
    }
  }
}
