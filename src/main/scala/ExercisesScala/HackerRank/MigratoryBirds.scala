package ExercisesScala.HackerRank

import scala.collection.immutable.ListMap

object MigratoryBirds extends App {
  val arr = Array(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)
  val mapa = arr.toList.groupBy(i => i)
  println(mapa.map(x=>(x._1,x._2.length)))
  val mapa1=mapa.map{case (tip, frek)=>(tip,frek.length)}  //unpack za da e podeskriptivno
  val najgolem=mapa1.filter{case (key, value) =>  value==mapa1.values.max} //gi filtriram site onie kade value-to e maximalno
  val najmalOdNajgol=najgolem.keys.min
  println(najmalOdNajgol)



  //val maksi=mapaKonechno.values.max

/*

 val u = mapaKonechno.filter{case (prv,vtor) =>  vtor == maksi}.toMap
  val mini=u.keys.min
  val p=u.filter{case(prv, vtor) => prv==mini}
  println(p.keys.head)
*/

/*
val i=List((1,2), (3,4), (5,6))
  println(i.map(x=> (x._1,x._2+1) ))

  val j=Map((1->2), (3->4), (5->6))
  println(i.map(x=>(x._1, x._2+1)).toMap)
*/


}




