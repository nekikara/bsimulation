package example
import scala.math.sqrt

object QuadraticFormula {
  def qeError(a: Double, b: Double, c: Double) = {
    val d: Int = (b * b - 4 * a * c).toInt

    if (d == 0) {
      println(s"${-1 * b / 2 / a}")
    } else if (d < 0) {
      println(s"x=${-b/2/a}+${sqrt(-d.toDouble)/2/a}, ${-b/2/a}-${sqrt(-d)/2/a}")
    } else {
      println(s"x=${-b/2/a + sqrt(d)/2/a}, ${-b/2/a - sqrt(d)/2/a}")
    }
  }
}

object Hello extends App {
  QuadraticFormula.qeError(1, 2, -3) // success
  QuadraticFormula.qeError(1, 0.5, -0.5) // error
  QuadraticFormula.qeError(2, 1, -1) // success
}

