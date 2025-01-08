package sealedClass

fun main(){

    show(Data.Load())
}
fun show(check:Data){
    when(check){
        is Data.Load -> println("Data loading")
        is Data.Error -> println("Error.....")
        is Data.Successful -> println("Data loading successful")
    }
}
sealed class Data{
    class Load:Data()
    class Error:Data()
    class Successful:Data()

}