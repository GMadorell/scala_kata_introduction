package multiples.solution

import com.gmadorell.scala_introduction.multiples.solutions.{FunctionalMultiplesSolver, RefactoredMultiplesSolver, SimpleMultiplesSolver}
import org.scalatest.{Matchers, WordSpec}

final class MultiplesSolverSolutionsTest extends WordSpec with Matchers {
  "A SimpleMultiplesSolver" should {
    "return the correct count" in {
      val solver = new SimpleMultiplesSolver()
      solver.calculateSumOfMultiplesOf3or5Below1000 shouldBe MultiplesSolution.solution
    }
  }

  "A RefactoredMultiplesSolver" should {
    "return the correct count" in {
      val solver = new RefactoredMultiplesSolver()
      solver.calculateSumOfMultiplesOf3or5Below1000 shouldBe MultiplesSolution.solution
    }
  }

  "A FunctionalMultiplesSolver" should {
    "return the correct count" in {
      val solver = new FunctionalMultiplesSolver()
      solver.calculateSumOfMultiplesOf3or5Below1000 shouldBe MultiplesSolution.solution
    }
  }
}
