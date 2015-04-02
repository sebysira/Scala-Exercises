/**
 * Created by seby on 01/04/15.
 */
object Fibonacci {
  def fib( n : Int) : Int = n match {
    case 0 | 1 => n
    case _ => fib( n-1 ) + fib( n-2 )
  }

  def fibonacci(n:Int):Int = {
    def fib_loop(n:Int,a:Int,b:Int):Int = {
      if(n == 0)
        a
      else {
        if (n == 1)
          b
        else
          fib_loop(n - 1, b, a + b)
      }
    }
    fib_loop(n,0,1)
  }

  def main(args: Array[String]):Unit = {
    val msg = "Il %d numero di fibonacci e' %d!\n"
    println(msg.format(5,fibonacci(5)))
  }

}
