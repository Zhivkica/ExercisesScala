package ExercisesScala.HackerRank


object Encryption extends App{

  val spoen="feedthedog"


  val gorna = Math.sqrt(spoen.length).toInt+1

  val dolna = if (Math.sqrt(spoen.length).toInt*gorna < spoen.length)
    gorna
  else
    Math.sqrt(spoen.length).toInt



  println(dolna)
  println(gorna)


  val lista=spoen.toList

  val p=lista.grouped(gorna).toList
  println(p)


  val v= for{
    i <- 0 until gorna
    j <- 0 until dolna
  } yield {
    println(j,i)
    p(j).lift(i)

  }
  println(v)
  val almost=v.flatten.mkString("")
  println(almost)

  val zz = almost.foldLeft(("", 1)){ case ((sum,ind),x) =>
    if(ind%3==0)
      (sum+x+" ", ind+1)
    else
      (sum+x, ind+1)
  }
  println(zz._1)



}
