package ExercisesScala.HackerRank

object BirthdayCake extends App {
  val arr=Array(4,4,3,1)
 /* val groups=arr.toList.groupBy(i=>i) //mi vrakja hash mapa
  println(groups)
  val sizes=groups.values
  val test=sizes.map(x=>x.length)
  println(test.max)*/

  val groups=arr.toList.groupBy(i=>i).values.map(x=>x.size).max
  println(groups)

  //val max=arr.max
  // arr.count(_ == ar.max) ova gi broi site x od nizata kade x e ednakov na max(kolku x kako maks ima na broj) REALNOTO RESHENIE

}
