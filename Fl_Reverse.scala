/**
 * Created by seby on 09/10/15.
 */
object Fl_Reverse {

  def main(args: Array[String]) {

    val l = List(1,3,5)
    val res = reverse(l)
    println(res)

  }

  def reverse[A](l:List[A]):List[A] = {
    l.foldLeft(List[A]())((b,a)=> a :: b)
  }


}
