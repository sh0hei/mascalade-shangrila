package com.github.sh0hei.mascalade.shangrila

import com.github.sh0hei.mascalade.shangrila.ShangrilaImpl.Urls
import org.json4s.DefaultFormats
import org.json4s.native.JsonMethods

import scalaj.http.{HttpResponse, Http, HttpRequest}

private class ShangrilaImpl extends Shangrila {

  def getCours: Seq[Cours] = {
    val url = Urls.BASE
    val response: HttpResponse = Http(url).asString
    // deserialize
    implicit val formats = DefaultFormats
    val parsedJson = JsonMethods.parse(response)
    val cours = parsedJson.extract[List[Cours]]
    cours
  }

  def getDescriptions(year: Int): Seq[Description] = {
    val url = Urls.BASE + year
    val request: HttpRequest = Http(url)
    val response = request.asString
    // deserialize
    implicit val formats = DefaultFormats
    val parsedJson = JsonMethods.parse(response)
    val descriptions = parsedJson.extract[List[Description]]
    descriptions
  }

  def getAnimes(year: Int, month: Int): Seq[Anime] = {
    val url = Urls.BASE + year + "/" + month
    // deserialize
    val json = ""
    implicit val formats = DefaultFormats
    val parsedJson = JsonMethods.parse(json)
    val animes = parsedJson.extract[List[Anime]]
    animes
  }
}

private object ShangrilaImpl {
  private object Urls {
    val BASE = "http://api.moemoe.tokyo/anime/v1/master/"
  }
}