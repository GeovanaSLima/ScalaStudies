package example

def sqrt(x: Double) = {
  def sqrtIter(guess: Double): Double =
    if isGoodEnough(guess) then guess
    else sqrtIter(improve(guess))

  def improve(guess: Double) =
    (guess + x / guess) / 2

  def isGoodEnough(guess: Double) =
    abs(square(guess) - x) < 0.001

  sqrtIter(1.0)

}
