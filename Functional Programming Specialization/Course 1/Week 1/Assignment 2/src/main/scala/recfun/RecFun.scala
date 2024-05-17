package recfun

import scala.annotation.tailrec

object RecFun extends RecFunInterface:

  def main(args: Array[String]): Unit =
    println("Pascal's Triangle")
    for row <- 0 to 10 do
      for col <- 0 to row do
        print(s"${pascal(col, row)} ")
      println()

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else (pascal(c - 1, r - 1) + pascal(c, r - 1))
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    @tailrec
    def balanceHelper(chars: List[Char], openCount: Int): Boolean = {
      if (chars.isEmpty) {
        openCount == 0
      } else {
        val head = chars.head
        val newOpenCount =
          if (head == '(') openCount + 1
          else if (head == ')') openCount - 1
          else openCount

        if (newOpenCount < 0) false
        else balanceHelper(chars.tail, newOpenCount)
      }
    }

    balanceHelper(chars, 0)
  }

  // Testing balance function
  @main def runBalance(): Unit = {
    val testString = "this is a (test) )(".toList
    val second = "(if (zero? x) max (/ 1 x))".toList
    val third = ":-)".toList
    val fourth = "".toList

    println(s"Parenthesis Balancing: ${balance(testString)}")
    println(s"Parenthesis Balancing: ${balance(second)}")
    println(s"Parenthesis Balancing: ${balance(third)}")
    println(s"Parenthesis Balancing: ${balance(fourth)}")
//    println(testString)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def changeHelper(remaining: Int, availableCoins: List[Int]): Int = {
      if (remaining == 0) {
        1
      } else if (remaining < 0 || availableCoins.isEmpty) {
        0
      } else {
        changeHelper(remaining - availableCoins.head, availableCoins) +
          changeHelper(remaining, availableCoins.tail)
      }
    }

    if (money == 0) 0 else changeHelper(money, coins)
  }

  @main def testCountChange(): Unit = {
    println(s"Money: 4\n Coins: [1, 2]\n Total Combinations: ${countChange(4, List(1, 2))}")
    println(s"Money: 6\n Coins: [1, 2, 3]\n Total Combinations: ${countChange(6, List(1, 2, 3))}")
    println(s"Money: 20\n Coins: [1, 2, 3, 4]\n Total Combinations: ${countChange(20, List(1, 2, 3, 4))}")
  }