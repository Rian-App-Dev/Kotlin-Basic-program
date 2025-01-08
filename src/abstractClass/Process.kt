package abstractClass

open class Process(a : Int, b: Int, c:Int? = null): ProcessAbstract() {

    val A = a
    val B = b
    val C = c


    override fun sum(a: Int, b: Int) {
        println("The summation is = ${a + b}")
    }

    override fun sub(a: Int, b: Int) {
        println("The substractuon is = ${a - b}")
    }

    override fun multi(a: Int, b: Int, c: Int?) {
        println("The multiplecation is = ${a * b * c!!}")
    }

    override fun divi(a: Int, b: Int) {
        println("The division is = ${a / b}")
    }
}