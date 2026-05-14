import org.scalajs.dom
import org.scalajs.dom.html.{Button, Canvas}

import scala.scalajs.js.annotation.JSExportTopLevel

@JSExportTopLevel("app")
object Main {
  case class Point(x: Int, y: Int){
    def +(p: Point): Point = Point(x + p.x, y + p.y)
    def /(d: Int): Point = Point(x / d, y / d)
  }
  def main(args: Array[String]): Unit = {
    println("Hello world!")
//    dom.console.log("wtf")
    import scala.scalajs.js

    println("Начало")

    // setTimeout на 1000 миллисекунд
    js.timers.setTimeout(1000) {
      println("Прошла 1 секунда")
    }
    dom.window.alert("Hi from Scala-js-dom")
    val button = dom.document.createElement("button").asInstanceOf[Button]
    button.textContent = "Click me!"
    button.addEventListener("click", { (_: dom.MouseEvent) =>
      addClickedMessage("You clicked the buttonz")
    })
    dom.document.body.appendChild(button)
  }

  private def addClickedMessage(text: String): Unit = {
    val parNode = dom.document.createElement("p")
    parNode.textContent = text
    dom.document.body.appendChild(parNode)
  }

  var count = 0
  var p: Point = Point(0, 0)
  val corners: Seq[Point] = Seq(Point(255, 255), Point(0, 255), Point(128, 0))

  println("rld!")
  val canvas = dom.document.getElementsByTagName("canvas")(0).asInstanceOf[Canvas]
  val ctx = canvas.getContext("2d")
    .asInstanceOf[dom.CanvasRenderingContext2D]

  def clear() = {
    ctx.fillStyle = "black"
    ctx.fillRect(0, 0, 255, 255)
  }
  var x = 0.0
  val h = 255
  val w = 255
  import scalajs.js.Math._
  type Graph = (String, Double => Double)
  val graphs = Seq[Graph](
    ("red", sin),
    ("green", x => abs(x % 4 - 2) - 1),
    ("blue", x => sin(x/12) * sin(x))
  ).zipWithIndex
  dom.window.setInterval(() => {
    x = (x + 1) % w; if (x == 0) clear()
    for (((color, f), i) <- graphs) {
      val offset = h / 3 * (i + 0.5)
      val y = f(x / w * 75) * h / 30
      ctx.fillStyle = color
      ctx.fillRect(x, y + offset, 3, 3)
    }
  }, 20)
}