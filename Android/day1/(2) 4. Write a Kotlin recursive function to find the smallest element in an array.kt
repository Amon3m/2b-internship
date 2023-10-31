fun findSmallestElement(arr: IntArray, index: Int = 0, smallest: Int = Int.MAX_VALUE): Int {
    if (index == arr.size) {
        return smallest
    } else {
        val currentElement = arr[index]
        val newSmallest = if (currentElement < smallest) currentElement else smallest
        return findSmallestElement(arr, index + 1, newSmallest)
    }
}

fun main() {
    val array = intArrayOf(6, 7, 1, 12, 2)
    val result = findSmallestElement(array)
    println("The smallest element = $result")
}

