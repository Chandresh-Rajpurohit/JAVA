package stack;

public class StackImplementByArrayList {
	
	int stack[] = new int[5];
	int top = 0;
	
	void push(int data) throws Exception {
		if(top==stack.length) {
		throw new Exception("Cannot push into array");	
		}
		stack[top]= data;
		top++;
		
	}
	int pop() throws Exception {
		int data;
		if(top==0) {
			throw new Exception("Cannot pop from empty array");	
		}
		data = stack[top-1];
		stack[top-1]  = 0 ;
		return data;
		
	}
	
	int peek() throws Exception {
		int data;
		top--;
		if(top==0) {
			throw new Exception("Cannot peek from empty array");	
		}
		data = stack[top-1];
		return data;
	}
	void show() {	
	for(int a:stack) {
		System.out.print(a+ " ");
	}
	}	
}