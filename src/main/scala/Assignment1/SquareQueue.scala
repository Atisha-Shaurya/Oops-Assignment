package Assignment1

import scala.collection.mutable.ListBuffer
import scala.io.StdIn.readInt

class SquareQueue(list: ListBuffer[Int]) extends Queue {
  println("\n Enter a value to add after squaring it")
  var num:  Int = readInt()
  num = num*num
  list.addOne(num)
  println("number queued after squaring is :"+num)
}
