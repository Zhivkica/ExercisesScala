package ExercisesScala.HackerRank

object DivisibleZarko extends App{
  val ar=Array(1,2,3,4,5,6)
  val k=5
  val aro = ar.zipWithIndex
  println(aro.toList)
  (for {
    (a,i) <- aro
    (b,j) <- aro if (i<j) && ((a + b) % k == 0)
  } yield {
    (a,b)
  }).length


}
