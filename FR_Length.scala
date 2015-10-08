/**
 * Created by seby on 08/10/15.
 */
object FR_Length {

  def main(args: Array[String]) {
    val l = List(1,2,3)
    val res = length2(l)
    println(res)

  }

  def foldRigth[A,B](l:List[A],n:B)(f: B=>B):B = l match {

    case Nil => n
    case x :: xs => f(foldRigth(xs,n)(f))

  }

  def length2[A](l:List[A]) = {

    foldRigth(l,0)(x => x + 1)
  }

}
