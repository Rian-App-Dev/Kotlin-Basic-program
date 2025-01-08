package conceptUnderstanding

fun main(){
    val m = MobileDetails("hello", "hello", -6, 10000)
    println(m.ramLcl)
}
class MobileDetails(name:String, model:String, ram:Int, price:Int){
    val nameLcl: String
    val modelLcl: String
    var ramLcl:Int? = null
        set(value) {
            field = if (value !!< 0){
                0
            }
            else{
                value
            }
        }
    val priceLcl:Int
    init {
        nameLcl = name
        modelLcl = model
        ramLcl = ram
        priceLcl = price
    }
    fun printInfo(){
        println(ramLcl)
        val x = 100
    }
}