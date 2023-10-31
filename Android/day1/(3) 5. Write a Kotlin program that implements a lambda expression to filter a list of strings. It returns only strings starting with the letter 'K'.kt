fun main() {
    val stringList = listOf("dart", "java", "c", "kotlin", "C++")

    val filteredList = stringList.filter { it.startsWith("k") }

    println(filteredList)
}
