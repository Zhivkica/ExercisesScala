package exercises.part2oop

object OOBasics extends App{

  val person=new Person("John", 26)
  println(person.age)
  println(person.x)
  //povik na methodot greet
  person.greet("Daniel")
  person.greet()
}
 //samo dokolku stavam val pred age togash kje mozam gore vo main da pristapam do godinite
 class Person(name: String, val age: Int) {          //constructor
   //body i se shto e tuka moze gore da bide pristapeno
   val x=2

   println(1+3)  //ova prvo se pechati

   //method
   def greet(name:String): Unit = println(s"${this.name} says: I am $name")
   //this pokazuva na klasata

   //overloading
   def greet():Unit=println(s"Hi, I am $name")
   //ne e problem shto e isto ime se dodeka razlichni parametri

 }
