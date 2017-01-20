package fizzbuzz.solution

import com.gmadorell.scala_introduction.fizzbuzz.FizzBuzzOutput
import com.gmadorell.scala_introduction.fizzbuzz.solution.{
  PatternMatchingFizzBuzzSolver,
  RefactorFizzBuzzSolver,
  SimpleFizzBuzzSolver
}
import org.scalatest.{Matchers, WordSpec}

final class FizzBuzzSolutionsTest extends WordSpec with Matchers {
  "A SimpleFizzBuzzSolver" should {
    "output the correct solution" in {
      val printer = new FizzBuzzOutput()
      val solver  = new SimpleFizzBuzzSolver()
      solver.solve(printer)
      printer.outputs shouldBe FizzBuzzSolution.solution
    }
  }

  "A RefactorFizzBuzzSolver" should {
    "output the correct solution" in {
      val printer = new FizzBuzzOutput()
      val solver  = new RefactorFizzBuzzSolver()
      solver.solve(printer)
      printer.outputs shouldBe FizzBuzzSolution.solution
    }
  }

  "A PatternMatchingFizzBuzzSolver" should {
    "output the correct solution" in {
      val printer = new FizzBuzzOutput()
      val solver  = new PatternMatchingFizzBuzzSolver()
      solver.solve(printer)
      printer.outputs shouldBe FizzBuzzSolution.solution
    }
  }
}
