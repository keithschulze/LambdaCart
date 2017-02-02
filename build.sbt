name := "lambda-cart"

version := "0.1-SNAPSHOT"

organization := "com.github.tomasmikula"

scalaVersion := "2.12.1"

autoCompilerPlugins := true
addCompilerPlugin("org.spire-math" % "kind-projector" % "0.9.3" cross CrossVersion.binary)

scalacOptions ++= Seq(
  "-language:higherKinds",
  "-Xlint",
  "-unchecked",
  "-deprecation",
  "-feature",
  "-Xfatal-warnings",
  "-Yno-adapted-args",
  "-Ypartial-unification",
  "-Ywarn-numeric-widen",
  "-Ywarn-unused-import",
  "-Ywarn-value-discard",
  "-Ypatmat-exhaust-depth", "40",
  "-Xfuture")

libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % "7.3.0-M8"
)

fork := true