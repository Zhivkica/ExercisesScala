package part3Udemy

object AnonymosObject extends App {

      val doubler=new Function1[Int,Int]{
        override def apply(x:Int)=x*2
        //in Scala this above like this  val doubler =(x:Int)=>x*2
        //and this is anonymous function (LAMBDA)
         }

      val superAdd=(x:Int) => (y:Int)=>x+y   //anonymous function
      println(superAdd(3)(5))


}