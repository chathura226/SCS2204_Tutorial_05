object q03 extends App{
  def sum(n:Int):Int={
    if(n==0) 0
    else sum(n-1)+n
  }

  println(sum(5))


}