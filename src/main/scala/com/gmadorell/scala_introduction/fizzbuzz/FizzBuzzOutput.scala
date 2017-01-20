package com.gmadorell.scala_introduction.fizzbuzz

class FizzBuzzOutput() {
  private var _outputs             = Seq.empty[String]
  def outputs: Seq[String]         = _outputs
  def record(output: String): Unit = _outputs :+= output
}
