organization := "scalera"

name := "tuple"

version := "1.0"

scalaVersion := "2.11.5"

lazy val root = (project in file(".")).aggregate(tupleMacros, tupleSamples)

lazy val tupleMacros = project.in(file("tuple-macros"))

lazy val tupleSamples = project.in(file("tuple-samples")).dependsOn(tupleMacros)