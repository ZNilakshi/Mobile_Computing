fun main() {
    val numbers = listOf(100, 45, 3, 99, 213)
    var max = numbers[0]

    for (num in numbers) {
        if (num > max) {
            max = num
        }
    }

    println("Maximum number: $max")
}