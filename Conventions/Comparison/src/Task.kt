import java.time.LocalDateTime

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    //  또다른답
    /*    override fun compareTo(other: MyDate): Int {
        return LocalDateTime.of(year, month, dayOfMonth, 0, 0).compareTo(LocalDateTime.of(other.year, other.month, other.dayOfMonth, 0, 0))
    }*/
    override fun compareTo(other: MyDate): Int {
        return when {
            year != other.year -> year - other.year
            month != other.month -> month - other.month
            else -> dayOfMonth - other.dayOfMonth
        }
    }
}

fun test(date1: MyDate, date2:  MyDate) {
    // this code should compile:
    println(date1 < date2)
}
fun main(args: Array<String>) {
    test(MyDate(2014, 1, 1), MyDate(2014, 1, 2))
}

