package part3Udemy

import scala.util.Random

object PatternMatching extends App {
  val random=new Random
  val x=random.nextInt(10)

  val description=x match {
    case 1 => "The One"
    case 2 => "double or nothing"
    case 3 => "third time is the charm"
    case _ => "something else " // _ = WILDCARD (DEFAULT)
  }

  println(x)
  println(description)

  //1. Decompose values
  case class Person(name: String, age:Int)
  val bob=Person("Bob", 20)

  val greeting=bob match{
    case Person(n,a) if(a<21) => s"Hi, my name is $n and I can't drink in the US"
    case Person(n,a) => s"Hi, my name is $n and I am $a years old"
    case _ => "I dont know who I am"
  }

  println(greeting)

  /*
  1.cases are matched in order
  2. what if no cases match? MatchError
  3. type of the PatternMatching expression? unified type of all the types in all the cases

  */

  //1-constants

}
