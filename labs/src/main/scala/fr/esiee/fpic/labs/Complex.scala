package fr.esiee.fpic.labs:

  class Complex(val im: Float, val re: Float):
    def +(other: Complex) = Complex(re + other.re, im + other.im)

    def -(other: Complex) = Complex(re - other.re, im - other.im)

    override def toString: String = s"$re+i$im"
    // Please define:
    // - modulo
    // - multiplication
    // - division
    // - negation (hint: this is a unary op)


