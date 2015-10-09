/**
 * Created by seby on 09/10/15.
 */
object FL_Append {

  def main(args: Array[String]) {
    val l = List(1,2,3)
    val l2 = List(4,5,6)
    val res = append(l,l2)
    println(res)

  }

  def append[A](l:List[A],l2:List[A]):List[A] = {

    l2.foldLeft(l)((x,y)=> x :+ y)

  }

}
