package exercises.part2oop

object AbstractDataTypes extends App {

  //abstract (zoshto nekogash nekoe pole kje treba da bide prazno

  abstract class Animal{
    val tip:String
    def eat:Unit

  }

  //val animal=new Animal NE MOZE

  class Dog extends Animal {
    override val tip:String="Canine"
    def eat: Unit = println("crunch crunch")
  }

  //TRAITS

  trait Carnivore{
    def eat(animal:Animal):Unit

  }

  trait ColdBlooded
  class Crocodile extends Animal with Carnivore with ColdBlooded {   //moze i povekje od edna
    val tip:String="crock"
    def eat:Unit=println("nomnomnom")
    def eat(animal:Animal):Unit = println(s"I am a crock and i am eating ${animal.tip}")
  }
  val dog=new Dog
  val crock=new Crocodile
  crock.eat(dog)
}
