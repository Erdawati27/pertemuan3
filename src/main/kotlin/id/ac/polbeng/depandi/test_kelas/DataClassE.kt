package id.ac.polbeng.depandi.test_kelas

fun main() {
    val meri = Student("Erdawati", 21)
    // Destructuring Declaration
    val (name, age) = meri
    println("Name = $name")
    println("Age = $age")
}