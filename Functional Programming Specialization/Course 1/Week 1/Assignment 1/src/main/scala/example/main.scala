package example

def sum(xs: List[Int]): Int = {
  if (xs.size == 1) xs.head else xs.head + sum(xs.tail)
}

def max(xs: List[Int]): Int = {
  if (xs.isEmpty) {
    throw new NoSuchElementException("Empty List")
  } else xs.max
}

@main def run(): Unit = {
  val test = List(3, 6, 2)

  println(s"Sum Method Result: ${sum(test)}\nMax Method Result: ${max(test)}")

//  max(List())
}