package LinkedList_Problems;

public class LinkedList_usingStack {
	
	class Stack{
		int data;
		Stack next;
		Stack(int data){
			this.data=data;
		}
	}
	Stack top;
	
	public void push(int data) {
		Stack st=new Stack(data);
		if(top==null) {
			top=st;
		}
		else {
			st.next=top;
			top=st;
		}
	}
	
	public void printStack() {
		Stack curr=top;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		System.out.println();
	}
	
	public void pop() {
		if(top==null) {
			System.out.println("Stack is empty");
		}
		else {
			//System.out.println(top.data);
			top=top.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedList_usingStack LL=new LinkedList_usingStack();
		LL.push(2);
		LL.push(3);
		LL.printStack();
		LL.pop();
		System.out.print("After deletion of top element: ");
		LL.printStack();
	}

}
