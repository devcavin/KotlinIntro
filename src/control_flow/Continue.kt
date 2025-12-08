package control_flow

fun main() {
    var result = ""
    for (i in "hello world") {
        if (i == 'o') continue
        result += i
    }
    println(result)
}