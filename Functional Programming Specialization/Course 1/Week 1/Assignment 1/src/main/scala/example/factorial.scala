package example

def factorial(n: Int): Int = {
  def factorialHelper(n: Int, accumulator: Int): Int = {
    if (n == 0) accumulator
    else factorialHelper(n - 1, n * accumulator)
  }

  factorialHelper(n, 1)
}

@main def test = println(factorial(4))
