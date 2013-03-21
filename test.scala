val divisorsCombinations = collection.mutable.Map[Int, collection.mutable.Set[List[Int]]]()withDefaultValue(collection.mutable.Set[List[Int]]())
def getDivisorsCombinations(n: Int) = {
	def calculateDivisorsCombinations(n: Int) = {
		val combinations = collection.mutable.Set[List[Int]]()
		def calculateCombination(n: Int, divisor: Int, divisors: List[Int]) {
			if (n == 1)	combinations += divisors.sorted
			if (n % divisor == 0) calculateCombination(n/divisor, 2, divisor :: divisors)
			if (divisor < n) calculateCombination(n, divisor+1, divisors)
		}
		calculateCombination(n, 2, List())
		divisorsCombinations(n) = combinations
		combinations
	}
	divisorsCombinations.getOrElse(n, calculateDivisorsCombinations(n))
}

val productSums = collection.mutable.Set[Int]()
(2 to 12000).foreach{ k =>
	println(k)
	var i = 2
	while (!getDivisorsCombinations(i).exists{y => (i == y.sum + k - y.length) && k >= y.length}) i += 1
	productSums += i
}

Console println productSums
Console println productSums.sum