package verify_pack

import com.devskiller.calculator.Calculator
import org.specs2.mutable.Specification

import scala.util.Random

class RandomNumbersSpec extends Specification {

  "Calculator" should {
    "sum arguments" in {
      // given
      val a = Random.nextInt(100)
      val b = Random.nextInt(100)

      // when
      val pairs = Calculator.add(a,b)

      // then
      pairs must equalTo(a+b)
    }
  }
  "Calculator" should {
    "subtract arguments" in {
      // given
      val a = Random.nextInt(100)
      val b = Random.nextInt(100)

      // when
      val pairs = Calculator.subtract(a,b)

      // then
      pairs must equalTo(a-b)
    }
  }
  "Calculator" should {
    "multiply arguments" in {
      // given
      val a = Random.nextInt(100)
      val b = Random.nextInt(100)

      // when
      val pairs = Calculator.multiply(a,b)

      // then
      pairs must equalTo(a*b)
    }
  }
  "Calculator" should {
    "divide arguments" in {
      // given
      val a = Random.nextInt(100)
      val b = Random.nextInt(10)+1

      // when
      val pairs = Calculator.divide(a,b)

      // then
      pairs must equalTo(a/b)
    }
  }

}
