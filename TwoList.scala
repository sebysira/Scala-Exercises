/**
 * sum element of two different list
 */
object TwoList {

  def main (args: Array[String]){

    val l1 =List(1,2,3)
    val l2 = List(1,2,3)




  }

  def twolist(l1:List[Int],l2:List[Int]):List[Int] = {

    l1.zip(l2).map(t => t._1 + t._2)
  }

}
