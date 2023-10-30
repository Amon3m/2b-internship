fun countVowels(input: String): Int {
    val vowels = "aeiouAEIOU"
    var count = 0

    for (char in input) {
        if (char in vowels) {
            count++
        }
    }

    return count
}

fun main() {
    val input = "Ahmed Mohamed"
    val vowelCount = countVowels(input)
    println("Number of vowels = $vowelCount")
}
