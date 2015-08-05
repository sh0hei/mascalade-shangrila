# mascalade-shangrila
[ShangriLa Anime API](http://api.moemoe.tokyo/) Scala wrapper library.

[![Build Status](https://travis-ci.org/sh0hei/mascalade-shangrila.svg)](https://travis-ci.org/sh0hei/mascalade-shangrila)

## Usage

#### Get Cours

code example
```Scala
val cours = Shangrila.getCours
```
response example
```Scala
List(Cours(5,2015,1), Cours(1,2014,1), Cours(6,2015,2))
```

#### Get Description

code example
```Scala
val descriptions = Shangrila.getDescriptions(2015)
```
response example
```Scala
List(Description(124,幸腹グラフィティ), Description(125,銃皇無尽のファフニール), Description(126,冴えない彼女の育てかた))
```

#### Get Anime

code example
```Scala
val animes = Shangrila.getAnimes(2015, 1)
```
response example
```Scala
List(Anime(124,幸腹グラフィティ,Some(),Some(),Some(),http://www.tbs.co.jp/anime/koufuku_g/,koufuku_g,koufukug,5,2015-01-08 09:32:51.0,2015-01-08 09:33:25.0,Some(0),Some(0)), Anime(125,銃皇無尽のファフニール,Some(ファフニール),Some(),Some(),http://cont.lanove.kodansha.co.jp/9906/21524.html,fafnir_anime,fafnir_anime,5,2015-01-08 09:35:06.0,2015-01-08 09:35:06.0,Some(0),Some(0)), Anime(126,冴えない彼女の育てかた,Some(冴えカノ),Some(),Some(),http://www.saenai.tv/,saenai_heroine,saekano,5,2015-01-08 09:37:01.0,2015-01-08 09:37:01.0,Some(0),Some(0)))
```

## License

```
Copyright (c) 2015 sh0hei
Released under the MIT license
http://opensource.org/licenses/mit-license.php
``````
