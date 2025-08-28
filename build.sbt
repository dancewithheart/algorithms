name := "algorithms"

version := "0.0.1"

scalaVersion := "2.13.16"

resolvers += Resolver.sonatypeCentralSnapshots

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core" % "2.13.0",
  "org.scalatest" %% "scalatest" % "3.2.19" % Test
)

scalacOptions ++= Seq(
  "-encoding", "UTF-8"
)

//wartremoverWarnings ++= Warts.all
