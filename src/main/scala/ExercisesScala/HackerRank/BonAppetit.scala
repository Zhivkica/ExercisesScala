package ExercisesScala.HackerRank

object BonAppetit extends App{


  val arr=Array(3,4,5,10,2,9)
  val actual=12

  val k=3

  val par=arr.toList.zipWithIndex
  println(par)

  val p=par.filter(elem=>elem._2!=k)
 println(p)

 val clean=p.map{case (x,y)=>
   x
 }.sum
  println(clean)

  if(clean/2==actual) println("Bon Appetit")
  else println(actual-clean/2)


  //so patch se pravi zamena na element na pozicija k, 1 element so prazna niza da se dodade na toa mesto, a mozeme i cela druga sequenca da staime
  val test=arr.patch(k,Seq.empty,1)
  println(test.toList)



  //SO POMOSH NA TAKE I DROP MOZAM DA PODELAM LISTA NA DVE LISTI SO DADEN KONKRETEN ELEMENT
  val levo=arr.take(k)
  println(levo.toList)
  val desno=arr.drop(k+1)
  println(desno.toList)
  //SPOJUVANJE NA DVE LISTI VO EDNA SO POMOSH NA ++ A MOZE I ::
  println((levo ++ desno).toList)

}
