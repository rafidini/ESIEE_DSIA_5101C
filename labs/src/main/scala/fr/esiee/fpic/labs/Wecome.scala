package fr.esiee.fpic.labs

@main
def welcome(args: String*): Unit =
  val name = if args.length > 1 then args(1) else "Goofy"
  val a: Complex = Complex(3, 2)
  val b: Complex = Complex(4, 1)

  println(s"$name, welcome to Functional Programmign in Scala!")
  println(s"a=$a  b=$b")
  //println(s"!a=${!a}")
  println(s"a+b=${a+b}")
  println(s"a-b=${a-b}")
  println(s"a*b=${a*b}")
  println(s"a/b=${a/b}")
  println(s"a%b=${a%b}")

