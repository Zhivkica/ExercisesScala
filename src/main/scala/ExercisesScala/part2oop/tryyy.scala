package exercises.part2oop

object tryyy extends App {
  val lista1 = List(1, 2, 3, 4)

  def f(num: Int, arr: List[Int]) = {
    //arr.to
    val lista=arr.map(x => (x.toString() * num))
    lista.map(x => x.toInt)
  }
  println(f(3,lista1))

}