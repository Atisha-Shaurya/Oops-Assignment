package Assignment1

import scala.collection.mutable.ListBuffer
import scala.io.StdIn.readInt


class DoubleQueue(list:ListBuffer[Int]) extends Queue {
  println("\n Enter a value to add after doubling it")
  var num:  Int = readInt()
  num = num*2
  list.addOne(num)
  println("number queued after doubling is :"+num)
}

