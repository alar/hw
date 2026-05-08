import org.scalajs.dom

import scala.scalajs.js.annotation.JSExportTopLevel

@JSExportTopLevel("app")
object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world!")
//    dom.console.log("wtf")
    import scala.scalajs.js
    import scala.scalajs.js.timers._

    println("Начало")

    // setTimeout на 1000 миллисекунд
    js.timers.setTimeout(1000) {
      println("Прошла 1 секунда")
    }
    dom.window.alert("Hi from Scala-js-dom")
    val button = dom.document.createElement("button")
    button.textContent = "Click me!"
    button.addEventListener("click", { (e: dom.MouseEvent) =>
      addClickedMessage("You clicked the button!")
    })
    dom.document.body.appendChild(button)
  }

  private def addClickedMessage(text: String): Unit = {
    val parNode = dom.document.createElement("p")
    parNode.textContent = text
    dom.document.body.appendChild(parNode)
  }

  println("rld!")
}