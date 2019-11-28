package exercises


object NOVO  extends App {

  val arr=Array(2, 0)
  def compareTriplets(a: Array[Int], b: Array[Int]): Array[Int] = {
    val arr=Array(0, 0)
    for ( i <- 0 until a.length)
     yield {
       if (a(i)>b(i)) arr(0)=arr(0)+1
       else if (a(i) < b(i)) arr(1)=arr(1)+1
      }

    arr
  }
  val arr1=Array(5,6,15)
  val arr2=Array(3,6,10)
  val u: Array[Int] = compareTriplets(arr1,arr2)
  println(u.toList)
}
