fun generatePermutations(input: String, currentIndex: Int = 0) {
    val length = input.length

    if (currentIndex == length - 1) {
        println(input)
    } else {
        for (i in currentIndex until length) {
            val inputArray = input.toCharArray()
            val temp = inputArray[currentIndex]
            inputArray[currentIndex] = inputArray[i]
            inputArray[i] = temp
            val modifiedInput = String(inputArray)

            generatePermutations(modifiedInput, currentIndex + 1)

            val temp2 = inputArray[currentIndex]
            inputArray[currentIndex] = inputArray[i]
            inputArray[i] = temp2
        }
    }
}

fun main() {
    val inputString = "abc" 
    generatePermutations(inputString)
}
