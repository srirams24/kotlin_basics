/*
 * Computational logic:
 * 	- involves performing calculations or processing data according to defined algorithms and formulas. 
 * 	- It is the "how" of data manipulation and involves arithmetic operations, data transformations, 
 * 	  and other forms of processing.
 * 	- Make use of inbuilt function for computation Logic ( Don't reinvent the Wheel!)
 *  - Break complex complex computations down in to small functions that solve a single problem
 *  - Try to make these functions as pure function as possible
 */

/*
 * A pure function is characterized by two main properties:
 * 	1. Deterministic Output: : For a given set of inputs, a pure function will always produce the same output.
 * 	2. No Side Effects: It does not modify any external state or variables, and it does not perform actions like
 *  	writing to files, changing global variables, or interacting with I/O
 */

 /* This function accepts a string and returns:
 * - an Int if the string is a valid integer: e.g. "1"
 * - null if the string is not a valid integer: e.g. "Hello"
 * 
 * The question mark (nullable operator) after the data type tells the data can either null or defined data type
 */
 
// Example for don't reinvent the wheel as the same functionality can be acheived by inbuilt functon .toIntOrNull()
fun safeConvertStringToInt(s: String): Int? {
    return when(s) {
        "0" -> 0
        "1" -> 1
        "2" -> 2
        "3" -> 3
        "4" -> 4
        "5" -> 5
        "6" -> 6
        "7" -> 7
        "8" -> 8
        "9" -> 9
        
        else -> null
    }
}

fun main(args: Array<String>) {
    if (args[0].length == 1) {
        val string = args[0]
        	println(safeConvertStringToInt(string))
    }
    // Builtin Function to acheive similar computaion as safeConvertStringToInt() does
	//println(args[0].toIntOrNull()) 
    
}