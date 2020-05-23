package stack;

public class StackListImplementByLinkedList <E>{

	Node<E> head;
	

	public void push(E data) {
		Node<E> toAdd = new Node<E>(data);
		Node<E> temp = head;
		
		if(temp == null) {
		head = toAdd;
		return;
		}
		
		while(temp.next != null) {
			
			temp  = temp.next;
			
		}
		temp .next= toAdd;
		
	}
	
	
	
	public E pop() throws Exception {
    	Node<E> temp =  head;
		if(temp == null) {
			throw new Exception(" Pooping From Empty Stack is not allowed");
		}
		if(temp.next==null) {
			Node<E> ToRemove = temp;
	        head=null;
	     return ToRemove.data;
		}
		
		while(temp.next.next !=null) {
			temp = temp.next;
		}
		Node<E> ToRemove = temp.next;
		temp.next = null;
		return ToRemove.data;
	}
	
	E peek()throws Exception{
		Node<E> temp =  head;
		if(temp == null) {
			throw new Exception(" Peeking From Empty Stack is not allowed");
		}
		while(temp.next !=null) {
			temp = temp.next;
		}
		return temp.data;
	
	}
	
	
	void print() {
		Node<E> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp  = temp.next;
		}
		System.out.println();
	}
		
	
	 boolean isEmpty() {
		return head==null;
	}
	
	static class Node<E>{
		E data;
		Node<E> next;
		
		public Node(E data) {
			this.data = data;
			next = null;
		}
		
	}
}
