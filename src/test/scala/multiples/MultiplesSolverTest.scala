package multiples

import com.gmadorell.scala_introduction.multiples.MultiplesSolverImplementation
import multiples.solution.MultiplesSolution
import org.scalatest._

final class MultiplesSolverTest extends WordSpec with Matchers {
  "A MultiplesSolver" should {
    "return the correct count" in {
      val solver = new MultiplesSolverImplementation()
      solver.calculateSumOfMultiplesOf3or5Below1000 shouldBe MultiplesSolution.solution
    }
  }
}
