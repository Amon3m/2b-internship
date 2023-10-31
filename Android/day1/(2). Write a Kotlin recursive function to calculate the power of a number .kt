fun power(x: Double, n: Int): Double {
    return if (n == 0) {
        1.0
    } else  {
        x * power(x, n - 1)
    }
}

fun main() {
    val base = 5.0
    val power = 2
    val result = power(base, power)
    println("$result")
}
