package id.ac.polbeng.depandi.test_kelas

fun main() {
    val greeter = Greeter()
    greeter.greet()
    greeter.text = "Hi"
    greeter.greet("Erda")
    greeter.greet("Wati")
    greeter.text = "Hello programmer"
    println(greeter.with_ret_val("Icha"))
}