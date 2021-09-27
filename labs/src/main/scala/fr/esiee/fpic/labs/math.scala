package fr.esiee.fpic.labs:

    def factorial(n: BigInt): BigInt = 
        if n == 0 then 1
        else n*factorial(n-1)

    def gcd(a: Int, b: Int): Int =
        val (c, d) = if a > b then (a, b) else (b, a)
        val r = c % d
        if r == 0 then d 
        else gcd(d, r)        

    def max(xs: List[Int]): Option[Int] =
        xs match 
            case Nil => None
            case n::Nil => Some(n)
            case n::ns => max(ns).flatMap(x => Some(scala.math.max(x, n)))
