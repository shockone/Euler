def isPrime(x: Long) = !Stream.range(2L, x).exists(x % _ == 0)

def primeFactors(x: Long): scala.collection.mutable.Set[Long] = {
  var number = x
  var factors = scala.collection.mutable.Set[Long]()
  for (i <- Stream.range(2L, number)) {
    if (i > number) { return factors }
    if (isPrime(i) && number % i == 0) {
      factors = factors + i
      while (number % i == 0) {
        number = number / i
      }
    }
  }
  factors
}

var x = 600851475143L

Console println primeFactors(x).max
