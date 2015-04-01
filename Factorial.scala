/**
 * Created by seby on 01/04/15.
 */
object Factorial {

  def factorial(n:Int):Int = {
    def loop(n:Int,res:Int):Int = {
      if(n<=0)
        res
      else
        loop(n-1,res*n)
    }
    loop(n,1)
  }

  def main (args: Array[String]):Unit = {
    val msg = "Il fattoriale di %d e' %d!\n"
    println(msg.format(4,factorial(4)))
  }
}
