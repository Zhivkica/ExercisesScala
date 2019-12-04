package ExercisesScala.HackerRank

object TheHurdleRace extends App{

  val k=4
  val arr=Array(1,6,3,5,2)
  val maxi=arr.max
  (k,maxi) match{
    case(k,maxi) if(k>maxi) => println(0)
    case(k,maxi) if(k<maxi) => println(maxi-k)
  }


}
