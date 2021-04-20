package Lesson_9.part_3
import Lesson_9.part_2.Color
import Lesson_9.part_2.Color.*

fun main(args: Array<String>) {

    var a = 2
    var b = 5

    when {
        (a > b) -> println(" $a > $b = true")
        (a < b) -> println(" $a < $b = true")
        (a == b) -> println(" $a == $b = true")
    }
}
