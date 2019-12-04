package ExercisesScala.HackerRank

object PlusMinus extends App {
  val arr=Array(1,2,3,0,-2,-1)

  val poz:Double=arr.filter(x=>x>0).toList.length
  val neg:Double=arr.filter(x=>x<0).toList.length
  val nul:Double=arr.filter(x=>x==0).toList.length
  //println(poz)

  val n=arr.length

  println(poz/n)

}
