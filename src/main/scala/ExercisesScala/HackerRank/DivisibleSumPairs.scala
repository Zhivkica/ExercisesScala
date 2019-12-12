package ExercisesScala.HackerRank

object DivisibleSumPairs extends App{
  //val arr=Array(1,3,2,6,1,2)
 val arr=Array(2)

  val k=3

  val test=arr.toList
  /*val kombinacii=test.combinations(2).toList
  println(kombinacii)
  val suma=kombinacii.map(x=>x(0)+x(1))
  val delivi=suma.filter(x=>(x%k==0))


  println(delivi.length)
  */

   //val p=test.flatMap(y=>test.map(x=>x+","+y)) so ova pravam kombinacii na sekoj element so sekoj map vo map

  val p=test.flatMap(y=>test.map( x =>if (x<y) x+y else "Nostring"))
  println(p)
  //println(p.filter(_ % 2 == 0))
  val f =p.filter{
   case x : Int => true
   case _ => false
  }
    println((f.filter(_.toString.toInt %2==0)).length)

//  val a=f.filter(_.toString.toInt %2==0)
  ////  println(a)





  //
//
//  val d=f.asInstanceOf[String].toInt
//
//  //val p=f.map(x=>x.toInt)
//
//
//
//  println(d)
  //println(d.filter(_%2==0))




}
