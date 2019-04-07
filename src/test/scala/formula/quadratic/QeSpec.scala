package formula.quadratic

import org.scalatest._

class QeSpec extends FlatSpec with Matchers {
  "quadratic package" should "qeError" in {
    qeError(1, 0.5, -0.5) shouldEqual "x=0.4571067811865476, -0.9571067811865476"
  }
}
