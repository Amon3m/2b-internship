fun evenNumbers(numbers: IntArray) {
    for (number in numbers) {
        if (number % 2 == 0) {
            println(number)
        }
    }
}

fun main() {
    val numbers = intArrayOf(0,1, 2, 3, 4, 5)
    evenNumbers(numbers)
}
