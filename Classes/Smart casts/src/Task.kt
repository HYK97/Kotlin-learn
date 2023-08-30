fun eval(expr: Expr): Int =
        when (expr) {
            //형변환이 따로 필요없는듯 is 뒤에 타입인 경우에 자동으로 형변환을 해준다.
            is Num -> expr.value
            is Sum -> eval(expr.left) + eval(expr.right)
            else -> throw IllegalArgumentException("Unknown expression")
        }

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr
