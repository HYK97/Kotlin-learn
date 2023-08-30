//이런식으로 레코드 처럼 사용가능
//data -> equals, hashCode, toString, copy 자동 생성 마치 lombok 같은 느낌
data class Person(var name: String, var age: Int) {
}
fun getPeople(): List<Person> {
    return listOf(Person("Alice", 29), Person("Bob", 31))
}

fun comparePeople(): Boolean {
    val p1 = Person("Alice", 29)
    val p2 = Person("Alice", 29)
    return p1 == p2  // should be true
}