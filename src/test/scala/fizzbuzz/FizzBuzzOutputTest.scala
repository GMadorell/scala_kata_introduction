package fizzbuzz

import scala.util.Random

import com.gmadorell.scala_introduction.fizzbuzz.FizzBuzzOutput
import org.scalatest.{Matchers, WordSpec}

final class FizzBuzzOutputTest extends WordSpec with Matchers {
  "A FizzBuzzOutput" should {
    "record input" in {
      val fizzBuzzOutput = new FizzBuzzOutput()
      val randomInput    = (1 to Random.nextInt(100)).map(_ => Random.alphanumeric.toString())
      randomInput.foreach(fizzBuzzOutput.record)
      fizzBuzzOutput.outputs shouldBe randomInput
    }
  }
}
