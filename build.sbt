name := "simple001"

organization := "com.kazshu"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.10.1"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "1.13" % "test"
)

initialCommands := "import com.kazshu.simple001._"
