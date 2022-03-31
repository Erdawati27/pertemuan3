package id.ac.polbeng.depandi.test_kelas

class PersonC (var firstName: String, var lastName: String, var age: Int) {}
fun main(){
    val erda = PersonC("Erda", "Wati", 21)
    println("Name : ${erda.firstName} ${erda.lastName}")
    println("Age : ${erda.age}")
}