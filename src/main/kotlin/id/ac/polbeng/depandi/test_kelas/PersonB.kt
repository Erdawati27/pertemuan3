package id.ac.polbeng.depandi.test_kelas

class PersonB (_firstName: String, _lastName: String, _age: Int) {

    var firstName:String = _firstName
    var lastName:String = _lastName
    var age: Int = _age
}
fun main(){
    val erda = PersonB("Erda", "Wati", 21)
    println("Name : ${erda.firstName} ${erda.lastName}")
    println("Age : ${erda.age}")
}