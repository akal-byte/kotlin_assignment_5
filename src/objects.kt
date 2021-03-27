fun main() {
var human=Human(name = "Akal",age=21,weight = 56.89)
    println(human.eat(foodWeight = 24,weight =56.89 ))
   println( human.speak(speech = "I love coding"))
    println(human.birthday(age = 21))
    var user=User(firstName = "Sarah",lastName="Akal",email = "akalerupe@gmail.com",phoneNumber="0741999678" ,password="teddy")
    println(user.email)
    println(user.password)
}
class Human(name:String,age:Int,weight:Double){
     fun eat(foodWeight:Int,weight: Double):Double{
         println("I am eating $foodWeight kgs of food ")
      var  weight=weight +foodWeight
         return weight
     }
    fun speak(speech:String):String{
        return speech
    }
    fun birthday(age: Int):Int{
        var newAge=age+ 1
        return newAge
    }


}
data class User(var firstName:String, val lastName:String,val email:String,val phoneNumber:String,val password:String){

}