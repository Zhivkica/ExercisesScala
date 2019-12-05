package ExercisesScala.HackerRank

object GradingStudents extends App{
  val arr=Array(73,67,38,33)
  var broj=33

  for(i <- 0 until arr.length){
    println(proverka(arr(i)))
  }yield

  println((arr.map(proverka).toList)) //skratena forma od x=> proverka(x)

  def proverka(broj:Int):Int= {
      broj match {
      case broj if(broj<38) => broj
      case broj if(broj%5<=2) => broj
      case broj if(broj%5>2) => broj+(broj%5-1)
    }
  }


}
