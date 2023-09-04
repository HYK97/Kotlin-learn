class DateRange(val start: MyDate, val end: MyDate){
    operator fun iterator(): Iterator<MyDate> = object : Iterator<MyDate> {
        var current: MyDate = start
        override fun hasNext(): Boolean = current <= end
        //현재날짜가 end 날짜와 같을때 까지
        override fun next(): MyDate {
            val result = current
            current = current.followingDate()
            return result
        }
    }
}


fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}

fun main() {
    val date1 = MyDate(2019, 1, 1)
    val date2 = MyDate(2019, 1, 5)
    iterateOverDateRange(date1, date2) { date ->
        println(date)
    }
}