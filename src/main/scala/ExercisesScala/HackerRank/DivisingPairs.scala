package ExercisesScala.HackerRank

object DivisingPairs extends App{

  val arr = Array(1,2,3,4,5,6)
  val k=5
  val test=arr.toList
  val p=arr.zipWithIndex.toList
  println(p)
  val combination = p.flatMap { case (element, index) =>
    p.map { case (element2, index2) =>
     ((element, index), (element2, index2)) //flatMap kje mi vrati element i index i pak kje pominam ushte ednash za da gi napraam kombinaciite
    }
  }

  val rez=combination.filter{ case((element1, index1), (element2, index2)) =>
    (index1 < index2) && (element1 + element2) % k == 0
  } //mora case-ot da mi se poklopuva kako shto e listata
  println(rez)

  val rez3=rez.map{ case((element1, index1), (element2, index2)) =>
    (element1,element2)
  } // samo elementite gi zimam od tuple

  println(rez3)




}
