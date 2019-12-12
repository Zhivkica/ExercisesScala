package ExercisesScala.HackerRank

object MissingElements extends App{

  val brr=Array(7,2,3,5,5,3)
  val arr=Array(7,2,5,4,6,3,5,3)

   val lista1=arr.toList.groupBy(x=>x)
   val lista2=brr.toList.groupBy(x=>x)

  val frekfencii1=lista1.map(x=>(x._1, x._2.length)).toSeq

  val frekfencii2=lista2.map(x=>(x._1, x._2.length)).toSeq

  println(frekfencii1)
  println(frekfencii2)



  val b=if(frekfencii1.length<frekfencii2.length) frekfencii2.diff(frekfencii1).toList
  else frekfencii1.diff(frekfencii2).toList



  println((b.map{case (x,y) => x}).toArray.sorted)










}
