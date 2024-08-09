/*
 * internal - a visibilty modifier, keeps data/references visiable only within program module level
 * const - compile time constant( never change value throughout program execution)
 *
 */
internal const val ERROR_MESSAGE = "An error has occured."

//private - recommended visibilty modifier, keeps data visibilty only within defined class level.
private const val ADD = "+"

/*
 * val Keyword: Ensures the reference is immutable (cannot be reassigned), 
 * but does not guarantee that the object it points to is immutable.
 */

//read-only reference (Only address value(reference) is read only not the  actual object )
val heightInCm: Double = 180.0
val userName: String = "Ram"

//arguments in funtion are val by default
fun doSomething(arg: String) {
   
    arg = "Hello" //'val' cannot be reassigned.
)
}



fun main(){
doSomething("hello")
}

