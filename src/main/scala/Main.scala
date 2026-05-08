import scala.scalajs.js.annotation.JSExportTopLevel

@JSExportTopLevel("app")
object Main {
  def main(args: Array[String]): Unit = {
    import org.scalajs.dom
    dom.window.alert("Hi from Scala-js-dom")
    println("Hello world!")
  }
}