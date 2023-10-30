fun calcBMI(weight: Double = 0.0, height: Double = 0.0): Double {

    return weight / (height * height)
}

fun main() {
    val bmi = calcBMI(105.0,1.79)
    println(bmi)
}
