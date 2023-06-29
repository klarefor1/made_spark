name := "linear-regression-spark"

version := "1.0"

scalaVersion := "2.12.13"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-mllib" % "3.0.1" withSources(),
  "org.apache.spark" %% "spark-sql" % "3.0.1" withSources(),
  "org.scalatest" %% "scalatest" % "3.2.9" % "test" withSources()
)