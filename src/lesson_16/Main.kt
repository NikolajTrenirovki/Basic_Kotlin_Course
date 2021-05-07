package lesson_16

fun main() {

    val person = Person("Имя", 10)
    val  person2 = person.copy(age = 17)

    person.age = 20

    println(person)
    println(person2)
}