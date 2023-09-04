data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        if (year != other.year) return year - other.year
        if (month != other.month) return month - other.month
        return dayOfMonth - other.dayOfMonth
    }
}

fun main() {
    val mydate = MyDate(2015, 10, 1)
    val first = MyDate(2014, 1, 1)
    val last = MyDate(2014, 12, 31)
    val checkInRange = checkInRange(mydate, first, last)
    // 사이날짜가 맞는지?
    println(checkInRange)
}