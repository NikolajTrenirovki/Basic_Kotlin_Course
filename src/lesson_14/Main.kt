package lesson_14

fun main() {

    var index = 0

    while (index < 10){
        println("Слово")
        index++;
    }
    do {
        println("Слово_2")
        index++;
    }while (index<10)

    var nums = 1..10

    for (value in nums) {
        println("$value")
    }

    for (value in nums step 2) {
        println("$value")
    }

    for (value in 10 downTo 1) {
        println("$value")
    }

    for (value in 10 downTo 5 step 2) {
        println("$value")
    }
}