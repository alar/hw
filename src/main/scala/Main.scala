import org.scalajs.dom

import scala.scalajs.js.annotation.JSExportTopLevel

@JSExportTopLevel("app")
object Main {
  import org.scalajs.dom._
  def main(div: html.Div): Unit = {
    val child = dom.document.createElement("div")
    child.textContent = "Hi from Scala-js-dom"
    div.appendChild(child)
  }
}