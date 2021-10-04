package fr.esiee.fpic.labs:

  import scala.annotation.tailrec
  @tailrec
  def loop(n: Int)(body: => Any): Unit =
    if n > 0 then
      val _ = body
      loop(n-1)(body)

  def sum(xs: List[Int]): Int = xs match
    case y::ys => y+sum(ys)
    // Nil is the same as List(), but more idiomatic
    case Nil => 0


  def mul(xs: List[Int]): Int = xs match
    case y::ys => y*mul(ys)
    case Nil => 1


  def reverse(xs: List[Int]): List[Int] = xs match
    case Nil => Nil
    case y::ys => reverse(ys) ::: List(y)
