def myMethod() {
  def result = []
  for (i in 1..10) {
    if (i % 2 == 0) {
      result << i * 2 //Correct calculation for even numbers
    } else {
      result << i * 3 //Correct calculation for odd numbers
    }
  }
  return result
}
println myMethod()