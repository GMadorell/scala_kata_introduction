package com.gmadorell.scala_introduction.multiples.solutions

import scala.collection.mutable

import com.gmadorell.scala_introduction.multiples.MultiplesSolver

class SimpleMultiplesSolver extends MultiplesSolver {
  def calculateSumOfMultiplesOf3or5Below1000: Int = {
    val multiplesOf3or5Below1000 = mutable.MutableList.empty[Int]
    for (naturalNumber <- 1 until 1000) {
      if (naturalNumber % 3 == 0 || naturalNumber % 5 == 0) {
        multiplesOf3or5Below1000 += naturalNumber
      }
    }

    var sum = 0
    for (multiple <- multiplesOf3or5Below1000) {
      sum += multiple
    }
    sum
  }
}
