package exercises.part2oop

object Inheritance extends App {

  class Animal{
    def eat=println("nomnom") //ako beshe private Cat klasata nemashe da moze da pristapi do toj metod
    val creatureType="wild"  //vo drugite klasi ako napravam override na ovaa promenliva nema da bide tipot Wild tuku soodvetno shto e vo dr klasa
  }

  class Cat extends Animal { //nasleduvanje
    def crunch={
      eat// a tuka protected moze da pomine!!!!
      println("crunch crunch")
    }
  }

  val cat=new Cat
  //cat.eat ova ne moze da pomine zatoa shto e protected!!!
  cat.crunch

  //CONSTRUCTORS

  class Person(name:String, age:Int){
    def this(name:String) = this(name,0)  //konstruktor so predefinirana vrednost za age ako ne e dadena
  }

  class Adult(name:String, age:Int, idCard:String) extends Person(name) //tuka kaj person kje projde zoshto vo klasata Person imame konstruktor i za samo eden parametar

  //OVERRIDING

  class Dog(override val creatureType: String) extends Animal{
   // override val creatureType: String = "friendly"  //oveeridnata e val od Animal zatoa nema wild da printa
    override def eat= {
      super.eat  //super kje go povika eat method-ot od animal!!!
      println("crunch, crunch")
    }
  }
  val dog= new Dog("K9")  //dog e objekt od Dog
  dog.eat // sega eat kje moze da bide pristapena iako gore e protected
  println(dog.creatureType)


  //POLYMORPHISM
  val unknownAnimal:Animal=new Dog("helper")
  unknownAnimal.eat


}
