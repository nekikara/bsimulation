package bignum

import org.scalatest._

class Power3Spec extends FlatSpec with Matchers {
  "quadratic package" should "have qeError" in {
    power3(0) shouldEqual 1
    power3(14) shouldEqual 4782969
    val expected: BigInt = BigInt("171792506910670443678820376588540424234035840667")
    power3(99) shouldEqual expected
  }
}
