package Lesson_9.part_2
import Lesson_9.part_2.Color.*

fun main(args: Array<String>) {

    var color: Color = Color.BLACK

    var result = when (color) {
        BLACK -> "Чёрный"
        WHITE -> "Белый"
        RED -> "Красный"
        GREEN -> "Зелёный"

        else -> "Без цвета"
    }

    println(result)
}