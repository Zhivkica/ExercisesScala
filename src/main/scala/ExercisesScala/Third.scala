package exercises

object Third extends App {

  def Recursive(aString: String, n: Int): String ={
  if(n==1) aString
  else aString + Recursive(aString, n-1)
  }
  println(Recursive("Hello ",4))
}
