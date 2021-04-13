package lesson_7.animals
import lesson_7.animals.cat.CatA
import lesson_7.animals.cat.CatB
import lesson_7.animals.dog.DogA
import lesson_7.animals.dog.*

fun main() {
    val catA = CatA()
    catA.a1()
    val dogA = DogA()
    dogA.a1()
    val catB = CatB()
    catB.b1()
    superMethod()
    superMethod_2()
}