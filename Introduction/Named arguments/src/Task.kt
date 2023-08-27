fun joinOptions(options: Collection<String>) =
        options.joinToString(prefix = "[", postfix = "]", separator = ", ")

fun main(args: Array<String>) {
    println(joinOptions(listOf("yes", "no", "may","be")))
}
