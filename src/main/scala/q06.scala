object q06 extends App{
  def fibonacci(n:Int):Int={
    n match {
      case 0 => 0
      case 1 => 1
      case _ => fibonacci(n-1)+fibonacci(n-2)
    }
  }

  def printFibonacci(n:Int):Unit={
    if(n>=0){
      printFibonacci(n-1)
      printf("%d ",fibonacci(n))
    }
  }

  printFibonacci(10)
}