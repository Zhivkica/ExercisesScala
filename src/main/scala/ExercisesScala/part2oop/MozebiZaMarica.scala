package exercises.part2oop

object MozebiZaMarica extends App {
  val x=2
  val niza = List(0,1,2)
  val a=Array(Array(1,2,3),Array(4,5,6), Array(7,8,9))


  val u= for{
    i <- niza
    j <- niza
    if(i==j)
  } yield {

    a(i)(j)
  }
  println(u)


}
