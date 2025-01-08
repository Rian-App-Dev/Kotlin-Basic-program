package homework

fun main() {

    println("Enter a word")
    val word = readln().toString()
    main6(word)
}

fun main6(w: String) {
    when (w.uppercase()) {
        "A" -> println("Vowel")
        "E" -> println("Vowel")
        "I" -> println("Vowel")
        "O" -> println("Vowel")
        "U" -> println("Vowel")
        else -> println("Consonant")
    }
}
fun main7(){
    print("Enter yor mark: ")
    val mark = readln().toInt()
    when {
        mark < 40 -> println("You are fail!")
        mark in 40..44 -> println("Your grade is: D")
        mark in 45..49 -> println("Your grade is: C")
        mark in 50..54 -> println("Your grade is: C+")
        mark in 55..59 -> println("Your grade is: B-")
        mark in 60..64 -> println("Your grade is: B")
        mark in 65..69 -> println("Your grade is: B+")
        mark in 70..74 -> println("Your grade is: A-")
        mark in 75..79 -> println("Your grade is: A")
        mark in 80..100 -> println("Your grade is: A+")
        else -> println("Invalid mark.")
    }
}