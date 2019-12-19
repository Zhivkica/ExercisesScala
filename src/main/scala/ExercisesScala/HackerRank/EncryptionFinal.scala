package ExercisesScala.HackerRank

object EncryptionFinal extends App{
  val spoen="feedthedog"

  println(spoen.length)


  val gorna = Math.ceil(Math.sqrt(spoen.length)).toInt
  println(Math.ceil(Math.sqrt(spoen.length)))

  val prvUslov = (Math.floor(Math.sqrt(spoen.length)).toInt * Math.ceil(Math.sqrt(spoen.length)).toInt < spoen.length)
  val vtorUslov = Math.floor(Math.sqrt(spoen.length)).toInt == Math.sqrt(spoen.length)


  val dolna = if (prvUslov || vtorUslov) gorna else Math.sqrt(spoen.length).toInt



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


  val almost=v.toList.grouped(dolna).toList
  println(almost)

  val neshto=almost.map{x => x.flatten.mkString("")
  }
  println(neshto.mkString(" "))




}
