def generatePrimeNumbers(limit: Int) = {
	val primes = collection.mutable.ListBuffer(2,3)
	for (x <- 5 to limit by 2) {
		if (!primes.exists(x % _ == 0)) {
			primes += x
		}
	}
	primes.toList
}

val limit = 50000000
var total = 0

val forthPowerPrimes = generatePrimeNumbers(math.pow(limit, 0.25).ceil.toInt)
val cubePrimes = generatePrimeNumbers(math.cbrt(limit).ceil.toInt)
val squarePrimes = generatePrimeNumbers(math.sqrt(limit).ceil.toInt)

for( a <- squarePrimes; b <- cubePrimes; c <- forthPowerPrimes) {
	if ((a*a + b*b*b + c*c*c*c) < limit) {
		total += 1
	}
}

println(total)