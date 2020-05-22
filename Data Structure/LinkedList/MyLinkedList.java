package linkedList;

public class MyLinkedList<E> {

     public Node<E> head;
	
   
	public void add(E data) {
				Node<E> toAdd = new Node<>(data); // add element at end of list.
					// System.out.prEln(toAdd);
						if(head == null) {
			head = toAdd;
			return;
			}
			Node<E> temp = head;
			while(temp.next != null) {
				
				temp  = temp.next;
				
			}
			temp .next= toAdd;
			
		}
	
	public	void addAt(int index,E data1) { //add element at middle of list .
			Node<E> add = new Node<>(data1);
					if(index ==0) {
						addAtStart(data1);
						return;
					}
			
			Node<E> temp = head;
				for(int i= 0;i<index-1;i++) {
					temp = temp.next;
				}
			
			add.next = temp.next;
			temp.next = add;
		
	}
	
	void addAtStart(E data) {
		
		Node<E> n = new Node<>(data);
		n.next = head;
		head = n;
		
	}
		void delete(int index) {
			if(index ==0) {
				head = head.next;
		
			}
			else {
			Node <E>temp =head;
			Node <E>temp2;
				for(int i = 0;i<index-1;i++) {
					temp = temp.next;	
				}
			temp2 = temp.next;
			// E toRemove = temp2.data;
			 temp.next=  temp2.next;
			// System.out.prEln(toRemove);
		}
			
	}
		
	void print() {
		Node<E> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp  = temp.next;
		}
		System.out.println();
	}
	
	Node<E> printInReverse() {
		Node<E> pre = null;
		Node <E>current = head;
		Node <E>next = null;
		
		while(current != null) {
			next = current.next;
			current.next = pre;
			pre = current;
			current = next;
		}
		head = pre;
		return head;
      //  prE();
	}
	
	int size() {
		int count = 0;
		Node<E> temp = head;
		while(temp !=null) {
			count ++;
			temp= temp.next;
			
		}
		return count;
	}
	
	boolean search( E data) {
		
		Node<E> temp = head;
		while(temp !=null) {
			if(temp.data==data) {
				return true;
			}
			
			temp= temp.next;
			
		}
		return false;
	}
	
	int countTheNumber(E data) {
		int count = 0;
		Node<E> temp = head;
		while(temp !=null) {
			if(temp.data==data) {
			count ++;
			}
			temp= temp.next;
			
		}
		return count;
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
