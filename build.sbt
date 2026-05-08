ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.21"

lazy val root = (project in file(".")).enablePlugins(ScalaJSPlugin)
  .settings(
    scalaJSUseMainModuleInitializer := true,
    name := "hw"
  )
libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.8.1"
