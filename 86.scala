def findShortestRoute(x: Int, y: Int, z: Int) = {
  List(
  math.sqrt(x*x + (y+z) * (y+z)),
  math.sqrt(y*y + (x+z) * (x+z)),
  math.sqrt(z*z + (y+x) * (y+x))
  ).min
}

def isInteger(x: Double) = x == math.floor(x)

var m = 1000000
var x = 1
var y = 1
var z = 1
var total = 0

while (total <= m) {
	Console println total
	while (y <= x) {
		while (z <= y) {
			if (isInteger(findShortestRoute(x, y, z))) {
				total += 1
			}
			z += 1
		}
		y += 1
		z = 1
	}	
	x += 1
	y = 1
}


Console println x - 1