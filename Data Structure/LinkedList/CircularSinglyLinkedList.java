package linkedList;

public class CircularSinglyLinkedList {

	Node head,last;
	
	void add(int data) {
		Node toAdd = new Node(data);
		if(head==null) {
			head= toAdd;
			last = toAdd;
			toAdd.next = last;
			return;
		}
		
		
		toAdd.next= last.next;
		last.next=toAdd;
		last = toAdd;
	}
	
	void addAtBegin(int data) {
		Node Add = new Node(data);
		if(last==null) {
			head= Add;
			last = Add;
			Add.next = last;
			return;
		}
		
		Add.next = head;
		last.next =  Add;
		head= Add;
	}
		
	void delete(int data) {//delete the element by providing the data to be deleted;
		Node delete = head;
		
		while(delete.next != head) {
			if(delete.data == data && delete == head) {
				Node temp = head;
				while(temp.next !=head) {
					temp = temp.next;

				}
				
			temp.next= delete.next;
				head = head.next;
				return;
				}
			
			if(delete.next.data == data ) {
				Node temp = delete.next;
			delete.next = temp.next;
				return;
			}
			if(delete.next.next == head && delete.next.data == data) {
				delete.next = head;
				
				return;
			}
			
			delete = delete.next;
			
		}
		
		
	}
	
	
	void deleteByIndex(int index) { 	//delete the element by providing the index no. of that element;
		if(index==0) {
			head =head.next;
			return;
		}
		Node temp = head;
		for(int i= 0; i<index-1;i++){
			temp = temp.next;
		}
		Node temp2 = temp.next;
		temp.next= temp2.next;
	
	}
	
	
	void print() {
		Node temp = head;
//		do {
//			System.out.print(temp.data + " ");
//			temp = temp.next;
//		}while(temp!=head);
		
		while(temp.next!=head) {
			System.out.print(temp.data + " ");
				temp = temp.next;
	}
		System.out.print(temp.data + " ");
		System.out.println();
	}
	
	void printInReverse() {
		Node pre = null;
		Node current = head;
		Node next = null;
		
		do {
			next = current.next;
			current.next = pre;
			pre = current;
			current = next;
		}while(current != head);
		next.next = pre;
		head = pre;
		print();
	}
	
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			next= null;
		}
	
	}
}
