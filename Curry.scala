/**
 * Created by seby on 03/04/15.
 */
object Curry {

  def curry[A,B,C](f: (A,B) => C): A => (B => C) ={
    (a : A) => (b: B) => f(a,b)
  }

  def uncurry[A,B,C](f: A => B => C): (A,B) => C = {
    (a:A,b:B) => f(a)(b)

  }

  def compose[A,B,C](f: B => C, g: A => B ): A => C = {
    (a:A) => f(g(a))
  }
  def sum(x: Int,y:Int):Int = x+y

  def str2int(c:Char):Int = {
    c.toInt
  }
  def int2str(x:Int):Char = {
    x.toChar
  }


  def main(args: Array[String]) {
    val x = 5
    val y = 6
    println(curry(sum)(x)(y))
    println(uncurry(curry(sum))(x,y))
    println(compose(str2int,int2str)(x))
  }
}