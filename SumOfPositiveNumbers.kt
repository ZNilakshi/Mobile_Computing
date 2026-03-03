fun main() {
    val numbers = listOf(-5, 3, -2, 7, 1)
    var sum = 0

    for (num in numbers) {
        if (num > 0) {
            sum += num
        }
    }

    println("Sum of positive numbers: $sum")
}