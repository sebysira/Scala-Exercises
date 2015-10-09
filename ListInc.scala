/**
 * Created by seby on 09/10/15.
 */
object ListInc {

  def main(args: Array[String]) {
    val l = List(1,2,3)
    val res = list_inc(l)
    println(res)

  }

  def list_inc(l:List[Int]):List[Int] = {

    l.foldRight(List[Int]())((x,xs) => x + 1 :: xs )
  }

}
