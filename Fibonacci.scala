/**
 * Created by seby on 01/04/15.
 */
object Fibonacci {
  def fib( n : Int) : Int = n match {
    case 0 | 1 => n
    case _ => fib( n-1 ) + fib( n-2 )
  }

  def main(args: Array[String]):Unit = {
    val msg = "Il %d numero di fibonacci e' %d!\n"
    println(msg.format(6,fib(6)))
  }

}
