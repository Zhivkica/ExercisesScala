package exercises.part2oop

object MethodNotations extends App{
  class Person(val name:String, favouriteMovie:String){
    def likes(movie: String) : Boolean= {
      movie == favouriteMovie
    }
      def +(nadimak: String): Person = new Person(s"$name ($nadimak)", favouriteMovie)

    def +(person:Person): String = s"${this.name} is hanging out with ${person.name}"
    def printaj(): Unit ={
      println(s"${name} ${favouriteMovie}")
    }
     def apply(num:Int)=s"${name} watched ${favouriteMovie} ${num} times." //important!!!!
    /*def learns(thing:String)=s"${name} is learning ${thing}"
    def learnsScala=this learns "Scala"*/
  }
  val mary=new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") //isti se ovie dva metodi
  //infix notation =operator notation
  // "operators" in Scala
  val Tom=new Person("Tom", "Fight Club")
  println(mary + Tom) //i vaka se povikuva metod i plus-ot ne e rezerviran karakter da ne moze da se koristi kako ime na f-cija
  (mary + "The rockstar").printaj()
  println(mary.apply(10)) //important!!!



}
