package error
import scala.math.sqrt

object Cancellation {

  def exampleBad1(x: Double): Double = {
    sqrt(x + 1) - sqrt(x)
  }

  def exampleGood1(x: Double): Double = 1 / (sqrt(x + 1) + sqrt(x))

  def exampleBad2(a: Double, b: Double, c: Double): Double = {
    ((-1 * b) + sqrt((b * b) - (4 * a * c))) / (2 * a)
  }

  def exampleGood2(a: Double, b: Double, c: Double): Double = {
    (-2 * c) / (b + sqrt(b * b - 4 * a * c))
  }
}
