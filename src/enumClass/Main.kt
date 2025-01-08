package enumClass

fun main(){
    val obj = Division.Dhaka
    val obj1 = Division.Khulna
    val obj2 = Division.Barishal
    val obj3 = Division.Chattogram
    val obj4 = Division.Sylhet
    val obj5 = Division.Khulna

    println(obj)
    println(obj1)
    println(obj2)

}

enum class Division{
    Barishal, Chattogram, Dhaka, Khulna, Rajshahi, Rangpur, Mymensingh, Sylhet
}