/*
 * var Keyword: Allows reassigning the reference, potentially affecting which object is being pointed to and its state.
 * This is known as Shared Mutable state - This can create chaos in Concurrency Programming
 */

var playerPostionAtX: Int = 0
var playerPostionAtY: Int = 0

fun changePlayerPosition(moveX:Int, moveY:Int) {
    playerPostionAtX += moveX
    playerPostionAtY += moveY
    println("$playerPostionAtX,$playerPostionAtY")
}

fun main() {
    changePlayerPosition(1,1)
    changePlayerPosition(2,1)
    changePlayerPosition(3,1)

}
