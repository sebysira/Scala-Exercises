/**
 * Created by seby on 02/04/15.
 */
object IsSorted {

  def isSorted[A](as: Array[A], p: (A, A) => Boolean): Boolean = {

    def loop(n: Int): Boolean = {
      if (n >= as.length - 1)
        true
      else {
        if (p(as(n), as(n + 1)))
          loop(n + 1)
        else
          false
      }
    }
    loop(0)
  }

  def ordInt(a:Int,b:Int):Boolean = {
    if(a<=b)
      true
    else
      false
  }

  def main(args: Array[String]):Unit = {

    val as=Array(1,2,3,4,5,9)
    println("Array is sorted? "+ isSorted(as,ordInt));
  }
}
