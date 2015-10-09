/**
 * Created by seby on 09/10/15.
 */
object DoubleToString {

  def main(args: Array[String]) {

    val l = List(1.0,2.0,3.0,4.0)
    val res = doubleToString(l)
    println(res)


  }

  def doubleToString(l:List[Double]):String = {

    l.foldRight("")((x,xs) => x.toString + xs )

  }

}
