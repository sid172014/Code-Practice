/*****************************************************************************************************************
* QUESTION
* Write a program that capitalizes all letters after the last u symbol in a word and prints the resulting string.
*****************************************************************************************************************/

// SOLUTION
fun main() {
    val string = readln()
    println(string.substringBeforeLast('u') + 'u' + string.substringAfterLast('u').uppercase())
}