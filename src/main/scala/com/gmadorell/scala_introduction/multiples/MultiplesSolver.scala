package com.gmadorell.scala_introduction.multiples

final class MultiplesSolverImplementation extends MultiplesSolver {

  /**
    * Evaluate all the natural numbers from 1 to 1000 and sum all of those that are multiple of 3 or 5.
    *
    * For example, if we listed all the natural numbers below 10 that are multiples of 3 or 5,
    * we would get 3, 5, 6 and 9. The sum of those numbers would be 23.
    *
    * This is Project Euler's first exercise: https://projecteuler.net/problem=1
    */
  def calculateSumOfMultiplesOf3or5Below1000: Int = ???
}

trait MultiplesSolver {
  def calculateSumOfMultiplesOf3or5Below1000: Int
}
