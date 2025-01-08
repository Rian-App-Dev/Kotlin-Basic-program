package inheritance

fun main(){
    val xsr = Xsr("XSR",155,"White",true)
    xsr.bikeInfo()

    val r15 = R15("R15",155,"Racing Blue",true)
    r15.bikeInfo()

    val mt15 = Mt15("MT15",155,"Black",true)
    mt15.bikeInfo()

    val saluto = Saluto("Saluto",125,"Blue",true)
    saluto.bikeInfo()
}