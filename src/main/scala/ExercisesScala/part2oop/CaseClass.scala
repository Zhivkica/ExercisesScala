package exercises.part2oop

object CaseClass extends App {

  case class Person(name:String, age:Int) {


  }
  //1. Case classes promote all the parametars to fields(get i set)
  val Jim=new Person("Jim", 34)
  println(Jim.name)
  //2.Case classes sensible toString   //println(instance)=println(instance.toString)
  println(Jim) //moze da printa objekt samo zaradi case

  //3.equals
  val Jim2=new Person("Jim", 34)
  println(Jim==Jim2) //da ne beshe case class kje pechateshe false iako se ednakvi

  //4.CCs have handy copy method

  val Jim3=new Person(name="Jim", age=45)
  println(Jim3)

  //5. Nema potreba od new

  val Mary=Person("Mary", 27)
  println(Mary)

  //6.CCs are serializable Akka

  //7. Case Object isto ko case Class samo objekt

  case object UnitedKingdom{
    def name: String = " The Uk"
  }

}