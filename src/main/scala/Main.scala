import org.scalajs.dom

import scala.scalajs.js.annotation.JSExportTopLevel

@JSExportTopLevel("hw")
object Main {
  import org.scalajs.dom._

  def main(args: Array[String]): Unit = {
    dom.document.getElementById("app").textContent = "WtF?"
  }
}