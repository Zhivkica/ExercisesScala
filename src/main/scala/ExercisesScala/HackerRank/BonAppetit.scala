package ExercisesScala.HackerRank

object BonAppetit extends App{

  val arr=Array(3,10,2,9)
  val actual=12

  val k=1

  val par=arr.toList.zipWithIndex
  println(par)

  val p=par.filter(elem=>elem._2!=k)
 println(p)

 val clean=p.map{case (x,y)=>
   x
 }.sum
  println(clean)

  if(clean/2==actual) println("Bon Appetit")
  else println(actual-clean/2)
}
