package formula

import scala.math.sqrt

package object quadratic {
  def qeError(a: Double, b: Double, c: Double): String = {
    val d: Int = (b * b - 4 * a * c).toInt

    if (d == 0) {
      s"${-1 * b / 2 / a}"
    } else if (d < 0) {
      s"x=${-b/2/a}+${sqrt(-d.toDouble)/2/a}, ${-b/2/a}-${sqrt(-d)/2/a}"
    } else {
      s"x=${-b/2/a + sqrt(d)/2/a}, ${-b/2/a - sqrt(d)/2/a}"
    }
  }
}
