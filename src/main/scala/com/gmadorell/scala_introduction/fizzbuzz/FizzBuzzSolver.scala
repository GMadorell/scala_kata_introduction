package com.gmadorell.scala_introduction.fizzbuzz

final class FizzBuzzSolverImplementation extends FizzBuzzSolver {

  /**
    * Write a program that prints the numbers from 1 to 100.
    * But for multiples of three print “Fizz” instead of the
    * number and for the multiples of five print “Buzz”. For
    * numbers which are multiples of both three and five
    * print “FizzBuzz”.
    *
    * Use the given FizzBuzzOutput as your printer.
    */
  override def solve(printer: FizzBuzzOutput): Unit = ???
}

trait FizzBuzzSolver {
  def solve(printer: FizzBuzzOutput): Unit
}

