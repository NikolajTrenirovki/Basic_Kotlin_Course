package Lesson_6

class Car (private var weight: Double,private var size: Int) {

    val isNew: Boolean
    get(){
        return weight > size
    }
    var isNew2: Boolean = false
    set(value) {
        if(value){
            println("Yes")
        }
        field = value
    }
}