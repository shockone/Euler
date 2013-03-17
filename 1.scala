def isMultiplierOfThreeOrFive(x: Int) = (x % 3 == 0) || (x % 5 == 0)

Console println (1 until 1000).filter(isMultiplierOfThreeOrFive).sum
