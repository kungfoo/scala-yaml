import sbt._

class ScalaYamlProject(info: ProjectInfo) extends DefaultProject(info){
  val junit = "junit" % "junit" % "4.4" % "test"
}
