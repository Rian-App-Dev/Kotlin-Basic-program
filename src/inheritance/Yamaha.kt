package inheritance

open  class Yamaha(modelName:String, enginCc:Int, color:String, availability:Boolean) {
    private val modelNameLcl:String = modelName
    private val enginCcLcl:Int = enginCc
    private val colorLcl:String = color
    private val availabilityLcl:Boolean = availability

    private fun getBikeInfo(){
        println("Model Name: $modelNameLcl\n" +
                "Engin CC: $enginCcLcl\n" +
                "Bike Color: $colorLcl\n" +
                "Bike Availability: $availabilityLcl")
        println()
    }


    fun bikeInfo(){
        getBikeInfo()
    }
}