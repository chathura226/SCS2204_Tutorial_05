object q02 extends App{


  def gcd(x:Int,y:Int):Int={
    y match {
      case 0 => x
      case y if(y>x)=> gcd(y,x)
      case _ => gcd(y,x%y)
    }
  }
  def prime(n:Int,x:Int=2):Boolean={
    if(n==x) true
    else if(gcd(n,x)>1) false
    else prime(n,x+1)
  }

  def primeSeq(n:Int):Unit={
    if(n>1) {
      primeSeq(n-1)
      if(prime(n))printf("%d ",n)
    }
  }

  primeSeq(25)
}