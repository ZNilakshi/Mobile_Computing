fun main() {
    val correctNumber = 6
    var guess = 0

    while (guess != correctNumber) {
        print("Guess a number between 1 and 10: ")
        guess = readLine()!!.toInt()

        if (guess != correctNumber) {
            println("Wrong guess. Try again.")
        }
    }

    println("Correct!")
}