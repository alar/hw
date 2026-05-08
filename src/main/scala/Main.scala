import org.scalajs.dom

import scala.scalajs.js.annotation.JSExportTopLevel

@JSExportTopLevel("app")
object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world!")
    dom.console.log("wtf")
    import scala.scalajs.js
    import scala.scalajs.js.timers._

    println("Начало")

    // setTimeout на 1000 миллисекунд
    js.timers.setTimeout(1000) {
      println("Прошла 1 секунда")
    }
  }
  println("rld!")
}