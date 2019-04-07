package object bignum {
  def power3(n: Int): BigInt = {
    val x = collection.mutable.MutableList[BigInt]()
    1 to n foreach {_ => x += BigInt(3)}
    x.product
  }
}
