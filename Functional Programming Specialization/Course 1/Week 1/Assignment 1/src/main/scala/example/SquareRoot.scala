package example

def sqrIter(guess: Double, x: Double): Double = {
  def improve(guess: Double, x: Double) =
    (guess + x/guess) / 2

  def isGoodEnough(guess: Double, x: Double) =
    abs(guess * guess - x) < 0.001

  if isGoodEnough(guess, x) then guess
  else sqrIter(improve(guess, x), x)

}



