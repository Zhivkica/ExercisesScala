package exercises

object Factoriel extends App {

  def factor(n:Int):Int= {
    if(n==1) 1
    else n* factor(n-1)
  }
  println(factor(5))
}




































