package linkedList;

public class CircularDoublyLinkedList {

	Node head,last;
	
	void add(int data) {
		Node n = new Node(data);
		if(head == null) {
			head =last =  n;
			head.next=last.next= n;
			head.pre= last.pre= n;
			return;
		}
	 
	Node temp = last.next;
	last.next = n;
	n.pre= last;
	n.next = temp;
	temp.pre = n; 
	last = last.next;     
	}
	
	void addAtBegin(int data) {
		Node n = new Node(data);
		if(head == null) {
			head =last =  n;
			head.next=last.next= n;
			head.pre= last.pre= n;
			return;
		}
		n.next = head;
		n.pre = last;
		last.next= n;
		head.pre = n;
		head  = head.pre;
	}
	
	public	void addAt(int index,int data1) { //add element at middle of list .
		Node add = new Node(data1);
		if(index ==0) {
			//addAtStart(data1);
			Node temp = head.pre;
			add.pre=temp;
			head.pre = add;
			add.next = head;
			temp.next = add;
			head = add;
			return;
		}
		
		Node temp = head;
		for(int i= 0;i<index-1;i++) {
			temp = temp.next;
		}
		temp.next.pre=add;
		add.next = temp.next;
		temp.next = add;
		add.pre = temp;
	
}
	void length() {
		int count= 1;
		Node temp = head;
		while(temp.next !=head) {
			count++;
			temp = temp.next;
		}
		System.out.println(count);
	}
	
	void print() {
		Node temp = head;
		while(temp.next !=head) {
			System.out.print(temp.data + " " );
			temp = temp.next;
		}
		System.out.print(temp.data);
		System.out.println();
	}
	
	void printInreverse() {
		Node temp = last;
		while(temp.pre !=last) {
			System.out.print(temp.data + " ");
			temp =temp.pre;
		}
		System.out.print(temp.data + " ");
		System.out.println();
	}
	
	void delete(int data) {
		if(head ==null)return;
		
		Node current = head;
		if(current.next==head) {
			head = null;
		}
		while(current.next != head) {
			if(current.data==data && current == head) {
				Node pre1 = current.pre;
				pre1.next= current.next;
			head = head.next;
			head.pre = current.pre;
			return;
			}
			
		
		if(current.next==last && current.next.data == data) {
			Node temp = current.next;
			current.next = temp.next;
			current.next.pre = current;
			last = last.pre;
			return;
			
		}
		if(current.data == data) {
			Node temp = current .next;
			Node temp1 = current.pre;
			temp.pre = temp1;
			temp1.next = temp;
			return;
		}
		
		current = current.next;
	}
		}
	
	void reverse() {
		Node current = head;
		if(head == null) {
			return;
		}
		do {
			 Node temp = current.next;
			current.next = current.pre;
			current.pre = temp;
			
			current = temp;
			
		}while(current !=head);
		head = head.next;
		print();
		
		System.out.println();
	}
	
	static class Node{
		Node pre;
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			next = null;
			pre = null;
		}
		
	}
}
