package linkedList;

public class MyDoublyLinkedList {
		
	 
	Node head;
	
		
		void add(int data) {
			Node n = new Node(data);
			if(head == null) {
				head = n;
				return;
			}
		 Node temp = head;
			while(temp .next != null) {
				temp = temp.next;
			}
			temp.next = n;
			n.pre = temp;
		}
		
		
		void addAtStart(int data) {
			
			Node n = new Node(data);
			head.pre = n;
			n.next = head;
			head = n;
			
		}
		
		
		public	void addAt(int index,int data1) { //add element at middle of list .
			Node add = new Node(data1);
			if(index ==0) {
				//addAtStart(data1);
				Node n = new Node(data1);
				head.pre = n;
				n.next = head;
				head = n;
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
		void delete(int index) {
			if(index ==0) {
				head = head.next;
		
			}
			else {
			Node temp =head;
			Node temp2;
			for(int i = 0;i<index-1;i++) {
				temp = temp.next;	
			}
			temp2 = temp.next;
			temp2.pre = temp;
			 temp.next=  temp2.next;
		}
			
	}
		
		
		
			void print() {
			Node temp = head;
			while(temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
				
			}
			System.out.println();
			}
		
				void printInReverse() {
					Node temp = head;
					
					while(temp .next!= null) {
						temp =	temp.next;
				}
					while(temp != null) {
						System.out.print(temp.data + " ");
						temp = temp.pre;
						
					}
					System.out.println();
				}
				
				void reverse() {
					Node current = head;
					if(head == null) {
						return;
					}
				
					while(current !=null) {
						 Node temp = current.next;
						current.next = current.pre;
						current.pre = temp;
						head = current;
						current = temp;
						
					}
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
