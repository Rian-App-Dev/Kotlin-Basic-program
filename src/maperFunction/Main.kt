package maperFunction

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()
    println(number.toAnswer())

}

fun Int.toAnswer(): String{
    if (this == 1){
        return "Yes she likes you"
    }
    else
        return "Her answer is no"
}