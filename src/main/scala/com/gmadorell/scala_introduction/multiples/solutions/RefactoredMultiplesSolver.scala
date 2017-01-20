package com.gmadorell.scala_introduction.multiples.solutions

import com.gmadorell.scala_introduction.multiples.MultiplesSolver

final class RefactoredMultiplesSolver extends MultiplesSolver {
  override def calculateSumOfMultiplesOf3or5Below1000: Int = {
    var sum = 0
    for (naturalNumber <- 1 until 1000) {
      if (isMultipleOf3Or5(naturalNumber)) {
        sum += naturalNumber
      }
    }
    sum
  }

  def isMultipleOf3Or5(test: Int): Boolean             = isMultipleOf3(test) || isMultipleOf5(test)
  def isMultipleOf3(test: Int): Boolean                = isMultipleOf(test, 3)
  def isMultipleOf5(test: Int): Boolean                = isMultipleOf(test, 5)
  def isMultipleOf(test: Int, dividable: Int): Boolean = test % dividable == 0
}
