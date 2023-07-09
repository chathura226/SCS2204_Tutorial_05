object q05 extends App{
  def isEven(n:Int):Boolean={
    if(n==0) true
    else isOdd(n-1)
  }

  def isOdd(n:Int):Boolean= !isEven(n)

  def sumEven(n:Int):Int={
    if(n==0) 0
    else if (isEven(n)) n+sumEven(n-1)
    else sumEven(n-1)
  }

  println(sumEven(10))
  println(sumEven(20))
}