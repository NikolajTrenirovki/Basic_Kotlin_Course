package Lesson_9.part_2
import Lesson_9.part_2.Color.*

fun main(args: Array<String>) {

    println(getFavoriteColor(BLACK))
}

fun getFavoriteColor (color: Color) = when (color) {
    BLACK -> "Чёрный"
    WHITE -> "Белый"
    RED -> "Красный"
    GREEN -> "Зелёный"

    else -> "Без цвета"
}