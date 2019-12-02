package part3Udemy

object MapFlatMapFilterFor extends App {

  val list = List(1,2,3,4)

  println(list.head)
  println(list.tail)


  println(list.map(x=>x+1))  //vrakja lista map-ot
  println(list.map(_ + " is a member"))

  println(list.filter(_ % 2 ==0))  //lista so x, kade x e paren broj

  val toPair= (x:Int) => List(x, x+2)
  println(list.flatMap(toPair))  //flatMap pravi parovi od sekoj element so elementot+2 List(1, 3, 2, 4, 3, 5, 4, 6)


  val numbers=List(1,2,3)
  val chars=List('a', 'b', 'c', 'd')
  val colors=List("black", "white")

  //printing all the combinations between two lists

  val combination = numbers.flatMap(n => chars.map(c=> "" + c + n))
  println(combination)

  //printing all the combinations between 3 list (ITERATING)
  val combination1 = numbers.flatMap(n => chars.flatMap(c => colors.map(color => "" + c + n + color)))
  println(combination1)

  //FOREACH
  list.foreach(println)  // printa vo novi redovi sekoj element

  //printing all the combinations between 3 list with for

  val forche=for {
    n <- numbers  //if n%2==0 e ok
    c <- chars
    color <- colors
  }yield  s"${c}${n}${color} "   //BITNO

   println(forche)
}
