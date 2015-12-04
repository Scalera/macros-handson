organization := "scalera"

name := "macros-handson"

version := "1.0"

scalaVersion := "2.11.5"

lazy val root = (project in file(".")).aggregate(macros, examples)

lazy val macros = project.in(file("macros"))

lazy val examples = project.in(file("examples")).dependsOn(macros)
