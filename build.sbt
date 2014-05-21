name := "RDF Partitioner"

version := "1.0"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
  ("org.apache.spark" %% "spark-core" % "0.9.1" % "provided").
    exclude("org.mortbay.jetty", "servlet-api").
    exclude("commons-beanutils", "commons-beanutils-core").
    exclude("commons-collections", "commons-collections").
    exclude("commons-collections", "commons-collections").
    exclude("com.esotericsoftware.minlog", "minlog")
)

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"
