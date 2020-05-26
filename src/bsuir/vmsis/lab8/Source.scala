package bsuir.vmsis.lab8

object Source {
  def main(args: Array[String]){
    val stack=new Stack[Int]
    stack.push(12)
    stack.push(34)
    stack.push(0)
    println(stack.front)
    println(stack.pop)
    println(stack.pop)
    println(stack.front)
  }
}