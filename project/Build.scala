import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "server"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      // Add your project dependencies here,
      "mysql" % "mysql-connector-java" % "5.1.18",
      "redis.clients" % "jedis" % "2.0.0"
      //2.6.10
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
      // Add your own project settings here      
    )

}
