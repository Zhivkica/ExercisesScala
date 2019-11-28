package part3Udemy

object Functions extends App {

  val doubler = new MyFunction[Int, Int] {
    override def apply(element: Int): Int = element * 2
  }
  println(doubler(2)) //acts like a function
  //functions types = Functio1[A,B]

  val stringToIntConvertor=new Function1[String, Int] {
    override def apply(string:String): Int=string.toInt

  }
  val adder:((Int,Int)=>Int)=new Function2[Int, Int, Int] {
    override def apply(a:Int, b:Int):Int = a+b
  }
  //Function types Function2[A,B,R] === (A,B)=>R
  //All scala functions are objects


  println(stringToIntConvertor("3")+4)

  def concatenate(string1:String, string2:String): String  = {
    string1+string2
  }
  /*Ova poinaku napishano bi bilo: Function Types
  def concatenate: (String,String) => String = new Function2[String, String, String] {
  override def apply(a:String, b:String):String=a+b*/

  println(concatenate("Hello ", "World"))

  /*Function which takes an int and returns another function which takes an int and returns an int */

  val superAdder: Function1[Int, Function1[Int,Int]] = new Function1[Int, Function1[Int,Int]] { //pass functions as parameters
    override def apply(x:Int) : Function1[Int,Int]= new Function1[Int,Int] {
      override def apply(y:Int): Int = x + y
    }
  }

  val adder3=superAdder(3)
  println(adder3(4))\
  println(superAdder(3)(4)) //curried function



}

trait MyFunction[A,B] {
  def apply(element: A): B
}