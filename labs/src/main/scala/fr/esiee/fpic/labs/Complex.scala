package fr.esiee.fpic.labs:

  class Complex(val re: Float, val im: Float):
    def +(other: Complex): Complex = Complex(re + other.re, im + other.im)

    def -(other: Complex): Complex = Complex(re - other.re, im - other.im)

    override def toString: String = s"$re+i$im"

    def *(other: Complex): Complex = Complex(re * other.re - im * other.im, re * other.im + other.re * im)

    def /(other: Complex): Complex =
      val den: Float = other.re * other.re + other.im * other.im
      val re_num: Float = re * other.re + im * other.im
      val im_num: Float = im * other.re - re * other.im
      Complex(re_num/den, im_num/den)

    def !(): Complex = Complex(-re, -im)

    def %(other: Complex): Double = scala.math.sqrt(scala.math.pow(re, 2) + scala.math.pow(im, 2))

