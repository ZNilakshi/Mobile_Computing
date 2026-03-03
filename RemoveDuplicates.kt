fun main() {
    val numbers = listOf(1, 2, 2, 3, 4, 4, 5)
    val uniqueList = mutableListOf<Int>()

    for (num in numbers) {
        if (num !in uniqueList) {
            uniqueList.add(num)
        }
    }

    println("List without duplicates: $uniqueList")
}