package part3Udemy

object Options extends App{
    val myFirstOption: Option[Int]=Some(4)
    val noOption: Option[Int]=None


  println(myFirstOption)

  //options were invented to deal with unsafe APIs

  def unsafeMethod(): String = null
  //val result=Some(null) //WRONG
  val result=Option(unsafeMethod())   //Some or None, celta e da ne koristime null sami tuku metodot da go napravi toa za nas
  println(result)

  def backupMethod(): String = "A valid result"
  val chainedResult= Option(unsafeMethod()).orElse(Option(backupMethod()))

  //functions on Options
  println(myFirstOption.isEmpty)
  println(myFirstOption.get)  //UNSAFE- DO NOT USE THIS!!

  //map, flatMap, filter

  println(myFirstOption.map(_*2)) //Some(8) namesto Some(4)
  println(myFirstOption.filter(x=> x>10)) //NONE
}
