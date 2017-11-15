class Factorial {
  def factorial(n: Int): Int = {
    var result: Int = 1

    if(n > 0) {
      result = n * factorial(n-1)
    }

    result
  }
}