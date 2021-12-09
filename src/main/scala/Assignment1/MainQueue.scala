package Assignment1
import scala.collection.mutable.ListBuffer

object MainQueue extends App{

  val list =  ListBuffer(1,2)
  println("Queue : ")
  for(i <- list.indices)
    {
      println(list(i)+" ")
    }

    var doubleList = new DoubleQueue(list)
    println("\n Double Queue:")
  for(i <- list.indices)
    {
      println(list(i)+" ")
    }
var squareQueue = new SquareQueue(list)
println("\nSquareQueue: ")
  for(i <- list.indices)
    {
      println(list(i)+" ")

    }
    squareQueue.dequeue(list)
  println("\nDequeue: ")
  for(i <- list.indices)
    {
      println(list(i)+" ")

    }
  squareQueue.enqueue(list)
  println("\nEnqueue: ")
  for(i <- list.indices) {
    println(list(i) + " ")

  }
  }

