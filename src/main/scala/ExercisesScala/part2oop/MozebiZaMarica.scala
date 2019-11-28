package exercises.part2oop

object MozebiZaMarica extends App {
  val x,y=2
  val a=Array.ofDim[Int](x,y)
  for{
    i <- 0 until x
    j <- 0 until y
  }println(s"($i) ($j) = ${a(i)(j)}")

}
