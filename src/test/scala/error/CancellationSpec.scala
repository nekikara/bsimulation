package error

import org.scalatest._

class CancellationSpec extends FlatSpec with Matchers {
  "Cancellation" should "have exampleBad1" in {
    Cancellation.exampleBad1(1e15) should not equal Cancellation.exampleGood1(1e15)
    Cancellation.exampleBad1(1e16) should not equal Cancellation.exampleGood1(1e16)
  }

  "Cancellation" should "have exampleBad2" in {
    Cancellation.exampleBad2(1, 10000, 2) should not equal Cancellation.exampleGood2(1, 10000, 2)
    Cancellation.exampleBad2(1, 1e9, 3) should not equal Cancellation.exampleGood2(1, 1e9, 3)
  }
}
