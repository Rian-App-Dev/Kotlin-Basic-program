package enumClass

fun main(){
    println(uiState(AppState.Playing))
}

enum class AppState{
    Playing, Pause, Stop
}
fun uiState(state:AppState): String {
    return when(state){
        AppState.Playing -> "Show playing"
        AppState.Pause ->"Show pause"
        AppState.Stop -> "Show stop"
    }
}