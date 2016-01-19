package verify_pack

import com.devskiller.calculator.Calculator
import org.specs2.mutable.Specification

class IllegalArgumentsSpec extends Specification{

  "Calculator" should {
    "throw exception when divide by 0" in {
      val a = 2
      val b = 0

      Calculator.divide(a,b) must throwA[RuntimeException]
    }
  }
}
