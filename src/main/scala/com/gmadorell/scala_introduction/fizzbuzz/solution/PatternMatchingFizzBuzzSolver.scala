package com.gmadorell.scala_introduction.fizzbuzz.solution

import com.gmadorell.scala_introduction.fizzbuzz.{FizzBuzzOutput, FizzBuzzSolver}

final class PatternMatchingFizzBuzzSolver extends FizzBuzzSolver {
  override def solve(printer: FizzBuzzOutput): Unit = {
    (1 to 100).map(fizzBuzz).foreach(printer.record)
  }

  def fizzBuzz(number: Int): String = (isMultipleOf3(number), isMultipleOf5(number)) match {
    case (true, true) => "FizzBuzz"
    case (true, _)    => "Fizz"
    case (_, true)    => "Buzz"
    case _            => number.toString
  }

  def isMultipleOf3(test: Int): Boolean                = isMultipleOf(test, 3)
  def isMultipleOf5(test: Int): Boolean                = isMultipleOf(test, 5)
  def isMultipleOf(test: Int, dividable: Int): Boolean = test % dividable == 0
}
