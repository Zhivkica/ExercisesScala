package ExercisesScala.HackerRank

object TimeConvertor extends App {
    val str:String="07:05:45PM"
    val str1=str.substring(2,8)
    val str2=str.substring(0,8)


    val chas=(str.substring(0,2)).toInt
    val vred=str.substring(8,10)

  val strT: String =(chas, vred) match{
    case (chas,"AM") if(chas>=0 && chas<12) => str2
    case (chas,"PM") if(chas>=0 && chas<12) => s"${((chas+12).toString)}$str1"
    case (chas, "AM") if(chas==12) => s"00${str1}"
    case(chas, "PM") if(chas==12) => s"$str2"
  }
  println(strT)

}
