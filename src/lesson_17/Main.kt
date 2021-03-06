package lesson_17

fun main() {
    val e1 = Expr.Const(1.2)
    val e2 = Expr.Const(2.2)

    val sum = Expr.Sum(e1, e2)

    println(eval(e1))
}

fun eval (expr: Expr): Double = when(expr) {
    is Expr.Const -> expr.number
    is Expr.Sum -> eval(expr.e1) + eval(expr.e2)

    Expr.NotANumber -> Double.NaN
}