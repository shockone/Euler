def fibonacci(nth: Int): Int = nth match {
  case 1 | 2 => nth
  case _ => fibonacci(nth - 1) + fibonacci(nth - 2)
}

Console println Stream.from(1).takeWhile(fibonacci(_) <= 4000000).map(fibonacci).filter(_ % 2 == 0).sum
