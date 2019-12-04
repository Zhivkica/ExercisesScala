package part3Udemy

object Staircase extends App{

  val N=6

  for(i <- Range(0,N))
    {
      var output1 = ""
      var output2 = ""

    output1 = " "*((N-1) - i)
    output2 = "#"*(i+1)

    println(output1 + output2)
  }

}
