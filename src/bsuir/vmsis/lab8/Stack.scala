package bsuir.vmsis.lab8

class Stack[T] {
  private class Node(val next:Node, val element:T)
  private var head:Node=null
  def front:T={
    if(head==null)
      throw new Exception("Stack is empty")
    head.element
  }
  def push(element: T){
    val headNode=new Node(head,element)
    head=headNode
  }
  def pop:T={
    if(head==null)
      throw new Exception("Stack is empty")
    val headElement:T=head.element
    head=head.next
    headElement
  }
}