package fizzbuzz

import com.gmadorell.scala_introduction.fizzbuzz.{FizzBuzzOutput, FizzBuzzSolverImplementation}
import fizzbuzz.solution.FizzBuzzSolution
import org.scalatest.{Matchers, WordSpec}

final class FizzBuzzSolverTest extends WordSpec with Matchers {
  "A FizzBuzzSolverImplementation" should {
    "return the expected solution" in {
      val fizzBuzzOutput = new FizzBuzzOutput()
      val solver         = new FizzBuzzSolverImplementation()
      solver.solve(fizzBuzzOutput)
      fizzBuzzOutput.outputs shouldBe FizzBuzzSolution.solution
    }
  }
}
