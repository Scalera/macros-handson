organization := "scalera"

name := "tuple-macros"

version := "1.0"

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % "2.11.5"
)

addCompilerPlugin("org.scalamacros" % "paradise" % "2.0.1" cross CrossVersion.full)