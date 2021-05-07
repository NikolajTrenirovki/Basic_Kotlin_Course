package lesson_15

fun main() {

    var nums = 1..10
    var value = 5
    println(value in nums)

    val characters = 'a'..'z'

    println(isChar('i', characters))

}

fun isChar(char: Char, charaters: CharRange) = char in charaters