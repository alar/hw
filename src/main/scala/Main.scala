import org.scalajs.dom

import scala.scalajs.js.annotation.JSExportTopLevel

@JSExportTopLevel("app")
object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world!")
    dom.console.log("wtf")
  }
  println("rld!")
}