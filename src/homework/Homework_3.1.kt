package homework

fun main(){
    print("Enter your amount: ")
    val money = readln().toInt()

    if (money in 10000..20000){
        println("You can go cox's Bazar")
        if (money >= 15000){
            println("And you can go saint martin.")
        }
        else{
            println("And come back to home.")
        }
    }

    else if(money > 20000){
        if (money >= 30000){
            println("You can go sajek vally with your girlfriend.")
        }
        else{
            println("You can go sajek vally.")
        }
    }

    else if(money in 3000..9999){
        println("You can go kuakata.")
        if (money >=4000){
            println("And you can buy a saree for yor girlfriend")
        }
        else{
            println("And come back to home.")
        }
    }
    else{
        println("Your budget is too low. You can't go anywhere")
    }
}