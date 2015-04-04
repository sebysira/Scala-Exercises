/**
 * Created by seby on 04/04/15.
 */
object Main {
  def main(args: Array[String]) {
    val l = List(1,2,3,4,5)
    val es1 = l match {
      case Cons(x,Cons(2,Cons(4,_))) => x
      case Nil => 42
      //case Cons(x,Cons(y,Cons(3,Cons(4,_)))) => x+y
      case Cons(h,t) => h + List.sum(t)
      case _ => 101

    }
    println(es1)

    val es2 = List.tail(l)
    println(es2)

    val es3 = List.setHead(6,l)
    println(es3)

    val es4 = List.drop(l,1)
    println(es4)

    def p(x:Int):Boolean = {
      if(x<=3)
        true
      else
        false
    }

    val es5 = List.dropWhile(l,p)
    println(es5)

    val es6 = List.init(l)
    println(es6)
  }
}
