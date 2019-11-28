package exercises.part2oop

abstract class MyList {

  def head: Int
  def tail: MyList
  def isEmpty: Boolean
  def add(element :Int): MyList  //zatoa shto e immutable nema new

}
object Empty extends MyList{

  def head: Int = throw new NoSuchElementException
  def tail: MyList = throw new NoSuchElementException
  def isEmpty: Boolean = true
  def add(element :Int): MyList = new Cons(element,  Empty)

}
class Cons(h:Int, t:MyList) extends MyList{
  def head: Int = h
  def tail: MyList = t
  def isEmpty: Boolean = false //at least one element
  def add(element :Int): MyList = new Cons(element, this)

}

object ListTest extends App{
  //val list =new Cons(1,Empty)
  val list = new Cons(1,new Cons(2, new Cons(3, Empty)))
  println(list.tail.head)
  println(list.add(4).head)
}