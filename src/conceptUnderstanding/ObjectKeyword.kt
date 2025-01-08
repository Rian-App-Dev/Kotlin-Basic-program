package conceptUnderstanding

fun main(){
    val obj = object {
        val a = 5
        val b = 10
        val sum = calculate()
        fun calculate(): Int {
            return a + b
        }
    }
    val x = obj.sum
    println(x)
}