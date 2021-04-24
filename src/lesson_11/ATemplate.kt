package lesson_11

class ATemplate : BaseTemplate() {
    override fun minus() {
        count--
        println("COUNT: $count")
    }
}