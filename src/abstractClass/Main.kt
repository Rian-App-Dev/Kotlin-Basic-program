package abstractClass

fun main(){
    val sumObj = Summation(15 ,5)
    sumObj.sumOut()

    val subObj = Substraction(15,5)
    subObj.subOut()

    val multiObj = Multiplecation(10,20, 5)
    multiObj.multiOut()

    val divObj = Division(30,6)
    divObj.divOut()
}