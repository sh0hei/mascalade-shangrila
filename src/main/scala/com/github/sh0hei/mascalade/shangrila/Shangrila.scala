package com.github.sh0hei.mascalade.shangrila

import org.json4s.DefaultFormats
import org.json4s.native.JsonMethods
import org.json4s._

import scala.io.Source

object Shangrila {

  val API_BASE_URL = "http://api.moemoe.tokyo/anime/v1/master"

  def coursApiEndpoint(): String = s"${API_BASE_URL}/cours"

  def descriptionsApiEndpoint(year: Int): String = s"${API_BASE_URL}/${year}"

  def animesApiEndpoint(year: Int, month: Int): String = s"${API_BASE_URL}/${year}/${month}"

  def getCours: Seq[Cours] = {
    implicit val formats = DefaultFormats
    val jsonResponse = Source.fromURL(coursApiEndpoint(), "utf-8").mkString
    val parsedJson = JsonMethods.parse(jsonResponse)
    val cours = parsedJson.extract[List[Cours]]
    cours
  }

  def getDescriptions(year: Int): Seq[Description] = {
    implicit val formats = DefaultFormats
    val jsonResponse = Source.fromURL(descriptionsApiEndpoint(year), "utf-8").mkString
    val parsedJson = JsonMethods.parse(jsonResponse)
    val descriptions = parsedJson.extract[List[Description]]
    descriptions
  }

  def getAnimes(year: Int, month: Int): Seq[Anime] = {
    implicit val formats = DefaultFormats
    val jsonResponse = Source.fromURL(animesApiEndpoint(year, month), "utf-8").mkString
    val parsedJson = JsonMethods.parse(jsonResponse).map(v => v.camelizeKeys)
    val animes = parsedJson.extract[List[Anime]]
    animes
  }
}
