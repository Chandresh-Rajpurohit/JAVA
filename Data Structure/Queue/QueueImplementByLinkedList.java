package queue;

public class QueueImplementByLinkedList<E> {
	
	Node<E> head,rear;
	
	public void  enqueue(E e) {
		
		Node<E> toAdd = new Node<E>(e);
		
		if(head==null) {
			head = rear = toAdd;
			return;
		}
		
		rear.next = toAdd;
		rear = rear.next;
		
	}
	
	
	public E dequeue() {
		
		if(head==null) {
			return null;
		}
		
	Node<E> temp = head;
	head = head.next;
	if(head==null) {
		rear=null;
	}
	return temp.data;
	
	}
	
	public E peek() {
		if(head==null) {
			return null;
		}
		
	return head.data;
	
	}
	
	void print() {
		Node<E> temp = head;
		while(temp != null) {
			System.out.print(  temp.data + " ");
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
