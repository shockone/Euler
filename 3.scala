def isPrime(x: Long) = !Stream.range(2L, x).exists(x % _ == 0)

def primeFactors(x: Long): scala.collection.mutable.Set[Long] = {
  var number = x
  var factors = scala.collection.mutable.Set[Long]()
  for (i <- Stream.range(2L, number).filter(isPrime)) {
    if (i > number) { return factors }
    while (number % i == 0) {
      number = number / i
      factors = factors + i
    }
  }
  factors
}

Console println primeFactors(600851475143L).max
