package LinkedList_Problems;

public class LinkedList_Implementation {
	
	Node head;
	private int size=0;
	
	public class Node{
		String data;
		Node next;
		Node(String data){
			this.data=data;
			size++;
		}
	}
	
	public void addFirst(String data) {
		Node n1=new Node(data);
		if(head==null) {
			head=n1;
		}
		else {
			n1.next=head;
			head=n1;
		}
	}
	
	public void addLast(String data) {
		Node n1=new Node(data);
		Node curr=head;
		if(head==null) {
			head=n1;
		}
		else {
			while(curr.next!=null) {
				curr=curr.next;
			}
			curr.next=n1;
			
		}
	}
	
	public void removeFirst() {
		if(head==null) {
			System.out.println("Empty Linked List");
		}
		size--;
		head=head.next;
	}
	
	public void removeLast() {
		Node next=head.next;
		Node curr=head;
		size--;
		if(head==null) {
			System.out.println("Empty Linked List");
		}
		else {
			while(next.next!=null) {
				next=next.next;
				curr=curr.next;
			}
			curr.next=null;
		}
	}
	public int getSize() {
		return  size;
	}
	
	public static void main(String[] args) {
		LinkedList_Implementation LL=new LinkedList_Implementation();
		LL.addFirst("is");
		LL.printList();
		LL.addFirst("this");
		LL.printList();
		LL.addLast("a");
		LL.printList();
		LL.removeFirst();
		LL.printList();
		LL.removeFirst();
		LL.printList();
		LL.addLast("girl");
		LL.printList();
		LL.removeLast();
		LL.printList();
		System.out.println(LL.getSize());
		
	}

	private void printList() {
		Node curr=head;
		while(curr!=null) {
			System.out.print(curr.data+"->");
			curr=curr.next;
		}
		System.out.println("null");
		
	}

}
