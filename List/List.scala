/**
 * Created by seby on 04/04/15.
 */
sealed trait List[+A]
case object Nil extends List[Nothing]
case class Cons[+A] (head:A,tail:List[A]) extends List[A]

object List {

  def sum(x:List[Int]):Int = x match {
    case Nil => 0
    case Cons(x,xs) => x + sum(xs)
  }

  def prod(x:List[Int]):Double = x match {
    case Nil => 1.0
    case Cons(0,_) => 0.0
    case Cons(x,xs) => x * prod(xs)
  }
  def tail[A](l:List[A]):List[A] = l match {
    case Nil => Nil
    case Cons(x,xs) => xs
  }
  def setHead[A](e:A,l:List[A]):List[A] = l match{
    case Nil => Cons(e,Nil)
    case Cons(x,xs) => Cons(e,xs)

  }

  def drop[A](l:List[A],n:Int):List[A] = {
    def loop(n:Int,l:List[A]):List[A] = l match {
      case Nil => Nil
      case Cons(x,xs) => if(n==0) xs else loop(n-1,xs)
    }
    loop(n,l)
  }
  def dropWhile[A](l:List[A],p:A => Boolean):List[A] = l match {
    case Nil => Nil
    case Cons(x,xs) => if(p(x)) dropWhile(xs,p) else Cons(x,dropWhile(xs,p))
  }

  def init[A](l:List[A]):List[A] = l match {
    case Cons(x,Nil) => Nil
    case Cons(x,xs) => Cons(x,init(xs))
  }

  def apply[A](as:A*):List[A] = {
    if (as.isEmpty) Nil
    else
      Cons(as.head, apply(as.tail: _*))
  }
}



