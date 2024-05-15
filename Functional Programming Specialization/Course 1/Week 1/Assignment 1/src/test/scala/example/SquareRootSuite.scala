package example

class SquareRootSuite extends munit.FunSuite {

  test("square root of 4 is 2") {
    assert(sqrtIter(1, 4) == 2)
  }

  test("square root of 4 is 2") {
    assert(sqrt(4) == 2)
  }
}
