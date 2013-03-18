val m = 100

def shortestRouteIsInteger(x: Int, y: Int, z: Int) = {

}

def findShortestRoute(x: Int, y: Int, z: Int) = {
  List(
  math.sqrt(x*x + (y+z) * (y+z)),
  math.sqrt(y*y + (x+z) * (x+z)),
  math.sqrt(z*z + (y+x) * (y+x))
  ).min
}

Console println findShortestRoute(6, 5, 3)