val calculateAverage: (List<Double>) -> Double = { num -> num.sum() / num.size.toDouble() }

fun main() {
    val list = listOf(5.0, 6.0, 4.0, 3.0)
    println(calculateAverage(list))
}
