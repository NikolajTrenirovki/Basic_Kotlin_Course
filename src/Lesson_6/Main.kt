package Lesson_6

fun main() {

    val person = Person("Nike","Semenov",23)

    println(person.firstName)
    println(person.lastName)
    println(person.age)

    val car = Car(20.5, 10)

    println(car.isNew)

    car.isNew2 = true
}