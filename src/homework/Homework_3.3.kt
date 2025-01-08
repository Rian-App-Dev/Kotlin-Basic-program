package homework

fun main() {
    print("Enter a value: ")

    val n = readln().toLong()
    for (i in 1..10) {
        val ans: Long = i * n
        println("$n X $i = $ans")
    }
    main8()
}

fun main8() {
    print("Enter a value: ")

    val n = readln().toLong()
    for (i in 1..10) {
        println("$n X $i = ${n * i}")
    }
}
