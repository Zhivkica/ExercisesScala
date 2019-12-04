package part3Udemy

object HOFsandCurries extends App{

  // def compose[A,B,T](f:A=>B, g:T=>A):T=>B=  moze i vaka
    def compose(f: Int => Int, g: Int=> Int):Int => Int=
    x=>f(g(x))

  //def andThen[A,B,C](f: A => B, g: B => C): A => C =  moze i vaka
    def andThen(f: Int => Int, g: Int => Int): Int => Int=
    x=>g(f(x))

  val add2=(x:Int) => x+2
  val times3= (x:Int) => x*3

  val composed=compose(add2,times3)
  val ordered=andThen(add2,times3)

  println(composed(4))
  print(ordered(4))


}
