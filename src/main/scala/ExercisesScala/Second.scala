package exercises

object Solution extends App {
  var n = scala.io.StdIn.readInt
  f(n)
  def f(n:Int) : String ={
    if(n==1) "Hello World"
    else "Hello World \n" + f(n-1)
  }
  println(f(n))
}
