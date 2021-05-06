package lesson_12

import lesson_12.Person as Person

fun main(args: Array<String>) {

    val person = Person(name = "Alex")
    val driver = Driver("Alex")
    println(person)
    println(driver)

    println(person.getAddress())
    println(driver.getAddress())
}