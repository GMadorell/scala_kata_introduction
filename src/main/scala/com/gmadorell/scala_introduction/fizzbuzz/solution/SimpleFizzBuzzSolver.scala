package com.gmadorell.scala_introduction.fizzbuzz.solution

import com.gmadorell.scala_introduction.fizzbuzz.{FizzBuzzOutput, FizzBuzzSolver}

final class SimpleFizzBuzzSolver extends FizzBuzzSolver {
  override def solve(printer: FizzBuzzOutput): Unit = {
    for (number <- 1 to 100) {
      if (number % 5 == 0 && number % 3 == 0) {
        printer.record("FizzBuzz")
      } else if (number % 3 == 0) {
        printer.record("Fizz")
      } else if (number % 5 == 0) {
        printer.record("Buzz")
      } else {
        printer.record(number.toString)
      }
    }
  }
}
