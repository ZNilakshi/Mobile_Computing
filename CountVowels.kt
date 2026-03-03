fun main() {
    val text = "Mobile Computing"
    var count = 0

    for (char in text.lowercase()) {
        if (char in "aeiou") {
            count++
        }
    }

    println("Number of vowels: $count")
}