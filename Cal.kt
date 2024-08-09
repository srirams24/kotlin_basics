/*

 * 

 * Program name: Simple calculator

 * 

 * Problem Statement : 

 * This program only accepts below strings(math operators) as input for calculation

 * "+", "-", "*", "/"

 * 

 * If the first argument of the program matches any one of the above math operator strings[1a], then execute 

 * the appropriate math operator functions[2a]. Display the result in console [3a].

 * 

 * If it doesn't match any one of the above math operator strings[1b], then display 

 * an error message in console[2b].

 * 

 */



/*

 * let's make four variables to hold values of each math operators as String value(collection of characters/letters) 

 * and give each one of them name to refer it

 * 

 */



val ADD: String = "+"

val SUBTRACT: String = "-"

val MULTIPLY: String ="*"

val DIVIDE: String = "/"



val ERROR_MESSAGE = "An error occured!"	//Default error message 



/*

 * let's make two Operands variables with double type

 */

val firstOperand: Double = 5.0

val secondOperand = 5.0 // variable can infer value type (type inference)





/*

 *main function is the entry point of program execution, defined with argument(input for function)

 *named args which execpts Array of Strings( collection of strings) as input

 */

fun main(args: Array<String>) {

  val mathOperator = args[0]  // Stores user input value in mathOperator

   

  start(mathOperator)	// Calling start function with mathOperator as argument

}



/*

 * Defined start function with parameter named (placeholder for arguement which holds arguements value being passed on 

 * during function call

 * 

 * start function excepts String value (+ or - or * or /) as input arguments

 * 

 * start function body includes codes to check arguements and compute math operations

 * 

 * displays result if valid operator provided as input, else displays error message in console

 * 

 */

 

 fun start(mathOperator: String) {

   

   

   if(checkArguments(mathOperator)) { //Checks for valid mathOperator

   	

     displayResult(

       calculate(firstOperand,secondOperand, mathOperator)

     )

   }

   else {

     displayResult(

     ERROR_MESSAGE

		 )

   }

   

   

 }

 

 /*

 * This function checks the input value for valid math operator with when statement as expression 

 * This function excepts string value as input and function return type is boolean value(true/false)

 * Default function return type is Unit, when not defined

 * 

 * 

 */

 fun checkArguments(value: String): Boolean {

  

   return when(value){

     // when 'value' equals any of the below one then execute respective statements

     ADD -> true

     SUBTRACT -> true

     MULTIPLY -> true

     DIVIDE -> true

     

     //otherwise

     else -> false // when expression requires else statement, In when statement, it is optional.

   }

 }



 /*

 * This function expect string value as input and prints the same in console

 * if the function body contains single line, we can define it is using single expression syntax

 */

  

 fun displayResult(result: String) = System.out.println(result)

 

 /*

 * This function evalutes the operands with operator and returns resultsas String value

 * 

 */

  

 fun calculate(operandOne: Double, operandTwo: Double, mathOperator: String): String {

   return when (mathOperator) {

     

    ADD -> (operandOne + operandTwo).toString()

    SUBTRACT -> (operandOne - operandTwo).toString()

    MULTIPLY -> (operandOne * operandTwo).toString()

    DIVIDE -> (operandOne / operandTwo).toString()

     

    else -> ERROR_MESSAGE

  

   }

 }
