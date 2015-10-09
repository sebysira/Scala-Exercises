/**
 * Created by seby on 09/10/15.
 */
object FL_Sum_Prod {

  def main(args: Array[String]) {

    val l = List(1,2,3)
    val l2 = List(1.0,2.0,3.0,4.0)
    val res = sum(l)
    val res2 = prod(l2)
    val res3 = length(l2)
    println(res,res2,res3)

  }

  def foldLeft[A,B](l:List[A], n:B)(f:(A,B)=>B):B = l match {

    case Nil => n
    case x :: xs => foldLeft(xs,f(x,n))(f)
  }

  def sum(l: List[Int]):Int = {

    foldLeft(l,0)((x,y)=> x + y)
  }

  def prod(l:List[Double]):Double = {

    foldLeft(l,1.0)((x,y)=> x * y)
  }

  def length[A](l:List[A]):Int = {
    foldLeft(l,0)((x,y)=>y+1)
  }

}
