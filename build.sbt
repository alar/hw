ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.12.21"


Compile / fastLinkJS / crossTarget := baseDirectory.value / "target" / "scala-2.12" / "classes"
Compile / fullLinkJS / crossTarget := baseDirectory.value / "target" / "scala-2.12" / "classes"
workbenchDefaultRootObject := Some(("target/scala-2.12/classes/index.html", "target/scala-2.12/classes/"))
lazy val root = (project in file(".")).enablePlugins(ScalaJSPlugin)  .enablePlugins(WorkbenchPlugin)
  .settings(
    scalaJSUseMainModuleInitializer := true,
    name := "hw"
  )
libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.8.1"
jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()

dependencyOverrides += "com.typesafe" %% "ssl-config-core" % "0.7.1"
