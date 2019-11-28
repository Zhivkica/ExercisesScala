package exercises.part2oop

import java.nio.BufferOverflowException

object PocketCalcExcep extends App {

  class OverflowException extends RuntimeException
  class UnderflowException extends RuntimeException
  class MathCalculationException extends RuntimeException("Divide by 0:/")

  object PoceketCalc{
    def add(x:Int, y:Int) = {
      val result= x+y
      if(x>0 && y>0 && result<0) throw new OverflowException
      else if(x<0 && y<0 && result>0) throw new UnderflowException
      else result
    }

    def substract(x:Int, y:Int)={
      val result=x-y

      if(x>0 && y<0 && result <0) throw new OverflowException
      else if(x<0 && y>0 && result>0) throw new UnderflowException
      else result

    }

    def multiply(x:Int, y:Int)={
      val result=x*y
      if(x>0 && y>0 && result <0) throw new OverflowException
      else if(x<0 && y<0 && result<0) throw new OverflowException
      else if(x>0 && y<0 && result>0) throw new UnderflowException
      else if(x<0 && y<0 && result>0) throw new UnderflowException
      else result
    }

    def divide(x:Int, y:Int)={
      if(y==0) throw new MathCalculationException
      else x/y
    }

  }

  println(PoceketCalc.divide(2,0)) //kje frli greshka radi delenje so 0 i poraka

}
