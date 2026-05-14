addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.21.0")
addSbtPlugin("com.lihaoyi" % "workbench" % "0.4.1")
addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.10.0-RC1")
libraryDependencies += "org.scala-js" %% "scalajs-env-jsdom-nodejs" % "1.1.1"
dependencyOverrides += "com.typesafe" %% "ssl-config-core" % "0.7.1"
dependencyOverrides += "com.typesafe.akka" %% "akka-actor" % "2.8.8"