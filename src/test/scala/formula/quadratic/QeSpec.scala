package formula.quadratic

import org.scalatest._

class QeSpec extends FlatSpec with Matchers {
  "quadratic package" should "have qeError" in {
    qeError(1, 0.5, -0.5) shouldEqual "x=0.4571067811865476, -0.9571067811865476"
    qeError(2, 1, -1) shouldEqual "x=0.5, -1.0"
  }

  "quadratic package" should "have qeSuccess" in {
    qeSuccess(1, 0.5, -0.5) shouldEqual "x=0.5, -1.0"
    qeSuccess(2, 1, -1) shouldEqual "x=0.5, -1.0"
  }
}
