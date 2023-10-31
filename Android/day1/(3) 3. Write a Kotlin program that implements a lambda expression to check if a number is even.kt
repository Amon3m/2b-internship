val isEven: (Int) -> Boolean = { number -> number % 2 == 0 }

fun main() {
    val number = 4
    val result = isEven(number)
    if (result) {
        println("$number is even.")
    } else {
        println("$number is not even.")
    }
}
