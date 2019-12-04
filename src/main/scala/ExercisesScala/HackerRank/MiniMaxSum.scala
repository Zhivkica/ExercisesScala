package ExercisesScala.HackerRank

object MiniMaxSum extends App {
 val arr = Array(5, 3, 2, 4, 1)
  /*val arb=arr.toList.sorted
  val bb=arb.toArray
  val sum1 = arr.foldLeft(0L)(_ + _) - bb(0)
  val sum2 = arr.foldLeft(0L)(_ + _) - bb(4)
  println(sum1 + "  " + sum2)
*/  //case class sumCont(suma:Long, mini:Long, maxi:Long)
  val uu= arr.foldLeft((0L,Long.MaxValue,Long.MinValue)){ case ((suma, min, max),i) =>
    (suma + i, Math.min(min, i), Math.max(max,i))
  }

  print((uu._1 - uu._2) + " " + (uu._1 - uu._3))

  /*case class sumCont(suma:Long, mini:Long, maxi:Long)
        arr.foldLeft((0L,Long.MaxValue,Long.MinValue)){ case ((suma, min, max),i) => VRAKJA TUPLE(0l, MAX, MIN)
            (
                suma + i,
                Math.min(min, i),
                Math.max(max,i)
            )
        } match { case (suma, min, max) =>   OVA E PREVEDENO VO KODOT GORE
        //println(suma)
        print((suma - max) + " " + (suma - min))
        }*/    //RESHENIETO NA ZARKO


}