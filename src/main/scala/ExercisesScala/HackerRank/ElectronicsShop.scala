package ExercisesScala.HackerRank

object ElectronicsShop extends App {

  val keybords=Array(3,1)
  val drives=Array(5,2,8)
  val b=10

  val test=keybords.toList.map { x =>
    drives.toList.map { y =>
      (x,y)
    }
  }
  println(test)
  val najgolemi=test.flatten
  println(najgolemi)

   val f=najgolemi.filter{ case (x,y) =>
     (x+y) <= b
   }

  val konechno=f.map(x=>x._1+x._2)


   if (konechno.nonEmpty) println(konechno.max)
   else println(-1)



}
