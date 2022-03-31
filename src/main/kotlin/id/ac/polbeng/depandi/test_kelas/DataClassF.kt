package id.ac.polbeng.depandi.test_kelas

fun main() {
    val meri = Student("Erdawati", 21)
    // Destructuring Declaration with componentN() method
    val name = meri.component1()
    val age = meri.component2()
    println("Name = $name")
    println("Age = $age")
}
