package Lesson_9.part_1

fun main(args: Array<String>) {

    var N = 2
    var result = when (N) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        5 -> "Five"
        6 -> "Six"
        else -> "None"
    }

    println(result)
}