package com.devskiller.calculator

import org.specs2.mutable.Specification

class CalculatorSpec extends Specification {

  "Calculator" should {
    "sum arguments" in {
      // given
      val a = 2
      val b = 3

      // when
      val pairs = Calculator.add(a,b)

      // then
      pairs must equalTo(5)
    }
  }
  "Calculator" should {
    "subtract arguments" in {
      // given
      val a = 5
      val b = 3

      // when
      val pairs = Calculator.subtract(a,b)

      // then
      pairs must equalTo(2)
    }
  }
  "Calculator" should {
    "multiply arguments" in {
      // given
      val a = 2
      val b = 3

      // when
      val pairs = Calculator.multiply(a,b)

      // then
      pairs must equalTo(6)
    }
  }
  "Calculator" should {
    "divide arguments" in {
      // given
      val a = 10
      val b = 5

      // when
      val pairs = Calculator.divide(a,b)

      // then
      pairs must equalTo(2)
    }
  }

}
