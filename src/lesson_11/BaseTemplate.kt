package lesson_11

open abstract class BaseTemplate {

    var count = 0

    fun a() {
        count++
        println("COUNT: $count")
    }

    abstract fun minus()

}