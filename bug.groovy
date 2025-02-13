def myMethod() {
  def result = []
  for (i in 1..10) {
    if (i % 2 == 0) {
      result << i * 2
    } else {
      result << i * 3
    }
  }
  return result
}
println myMethod()