package conceptUnderstanding

fun main(){
    for(i in 1..10){
        print("$i ")
    }
    println()
    for (i in 10 downTo 1){
        print("$i ")
    }
    println()
    for (i in 10..20 step 2){
        print("$i ")
    }
    println()
    for (i in 30 downTo 10 step 3){
        print("$i ")
    }
    println()

    var i = 0
    while (i <= 10){
        print("$i ")
        i ++
    }
    println()

    var j = 10
    while (j >= 0){
        print("$j ")
        j --
    }
    println()

    var k = 0
    while (k <= 30){
        print("$k ")
        k += 3
    }
    println()

    var l = 30
    while (l >= 0){
        print("$l ")
        l -= 3
    }
}