fun eval(expr: Expr): Int =
        when (expr) {
            is Num -> expr.value
            is Sum -> eval(expr.right)+ eval(expr.left)
            //is Test -> 0
        }

sealed interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

//아래와 같이 사용할 경우 when절에서 컴파일 오류 발생 이것도 따로 등록해야함
//class Test(val left: Expr, val right: Expr) : Expr
