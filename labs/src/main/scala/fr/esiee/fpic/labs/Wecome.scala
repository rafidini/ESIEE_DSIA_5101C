package fr.esiee.fpic.labs

@main
def welcome(args: String*): Unit =
  val name = if args.length > 1 then args(1) else "Goofy"
  println(s"$name, welcome to Functional Programmign in Scala!")

