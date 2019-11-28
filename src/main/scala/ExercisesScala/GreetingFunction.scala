package exercises

object GreetingFunction extends App {
  def function(aName:String, aAge:Int): Unit={
    println("Hi, my name is "+ aName + " and I am " + aAge+ " years old")
  }
   function("Nikola", 17)
}

/*
  def function(aName:String, aAge:Int): String={
    "Hi, my name is "+ aName + " and I am " + aAge+ " years old."
    println(greetingForKids("David", 12))
  }

  DR NACHIN
 */