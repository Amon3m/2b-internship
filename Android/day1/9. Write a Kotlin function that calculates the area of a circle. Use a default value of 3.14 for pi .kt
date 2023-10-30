
fun circleArea(radius: Double, pi: Double = 3.14): Double {
    return pi * radius * radius
}

fun main() {
    val radius = 4.0
    val circleArea = circleArea(radius)
    println("area = $circleArea")
}
