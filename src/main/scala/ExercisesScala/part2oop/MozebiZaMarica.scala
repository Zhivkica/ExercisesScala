package exercises.part2oop

object MozebiZaMarica extends App {
  val x=2
  val niza = List(0,1,2)
  val a=Array(Array(1,2,3),Array(4,5,6), Array(7,8,9))


  val u= for{
    i <- a.indices
    j <- a.indices
    if(i==j)
  } yield {

    a(i)(j)
  }
  println(u.sum)
  val v= for{
    i <- 0 until a.length
    j <- 0 until a.length
    if(i+j==a.length-1)
  } yield {

    a(i)(j)
  }
  println(v.sum)
  println(Math.abs(v.sum+u.sum))



}
