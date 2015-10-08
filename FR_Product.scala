/**
 * Created by seby on 08/10/15.
 */
object FR_Product {

  def main(args: Array[String]) {

    val l = List(1.0,3.0,5.0,7.0,9.0,2.0)
    val res = prod2(l)
    println(res)

  }

  def foldRigt[A,B](l:List[A],n :B)(f : (A,B)=>B):B = l match{
    case Nil => n
    case x :: xs => f(x ,foldRigt(xs,n)(f))

  }

  def prod2(l:List[Double]) = {
    foldRigt(l,1.0)((x,y) => x * y)
  }

}
