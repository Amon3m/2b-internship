fun isPalindrome(str: String): Boolean {
    val lowerStr = str.toLowerCase()
    return lowerStr == lowerStr.reversed()
}

fun main() {
    val str  = "Level"

    if (isPalindrome(str)) {
        println("a palindrome.")
    } else {
        println("not a palindrome.")
    }

}
