import org.scalatest._

import com.gmadorell.scala_introduction.multiples.MultiplesSolverImplementation
import com.gmadorell.scala_introduction.multiples.solutions.{
  FunctionalMultiplesSolver,
  RefactoredMultiplesSolver,
  SimpleMultiplesSolver
}

private object Solution {
  val solution = 233168
}

final class MultiplesSolverTest extends WordSpec with Matchers {
  "A MultiplesSolver" should {
    "return the correct count" in {
      val solver = new MultiplesSolverImplementation()
      solver.calculateSumOfMultiplesOf3or5Below1000 shouldBe Solution.solution
    }
  }
}

final class SolutionsTest extends WordSpec with Matchers {
  "A SimpleMultiplesSolver" should {
    "return the correct count" in {
      val solver = new SimpleMultiplesSolver()
      solver.calculateSumOfMultiplesOf3or5Below1000 shouldBe Solution.solution
    }
  }

  "A RefactoredMultiplesSolver" should {
    "return the correct count" in {
      val solver = new RefactoredMultiplesSolver()
      solver.calculateSumOfMultiplesOf3or5Below1000 shouldBe Solution.solution
    }
  }

  "A FunctionalMultiplesSolver" should {
    "return the correct count" in {
      val solver = new FunctionalMultiplesSolver()
      solver.calculateSumOfMultiplesOf3or5Below1000 shouldBe Solution.solution
    }
  }
}
