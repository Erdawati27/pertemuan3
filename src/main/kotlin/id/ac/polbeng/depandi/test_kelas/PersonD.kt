package id.ac.polbeng.depandi.test_kelas

class PersonD {
    var firstName: String
    var lastName: String
    var age: Int
    constructor(_firstName: String, _lastName: String, _age: Int){
        firstName = _firstName
        lastName = _lastName
        age = _age
    }

}
fun main(){
    val erda = PersonD("Erda", "Wati", 21)
    println("Name : ${erda.firstName} ${erda.lastName}")
    println("Age : ${erda.age}")
}