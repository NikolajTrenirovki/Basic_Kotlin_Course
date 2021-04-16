package lesson_8

enum class Color(val colorHex: String, val opacity: Double? = 1.0) {
    WHITE("#FFFFF"),
    BLACK("#00000"),
    RED("#22RR33",0.5),
    GREEN("#QWERTY");

    fun some() {
        print("my logic")
    }
}
