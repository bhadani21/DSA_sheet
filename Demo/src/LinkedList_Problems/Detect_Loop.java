package LinkedList_Problems;

import java.util.Scanner;

public class Detect_Loop {
	
	Node head,tail;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	
	
	public void insertValue(int[] arr) {
		head=new Node(arr[0]);
		tail=head;
		for(int i=1;i<arr.length;i++) {
			tail.next=new Node(arr[i]);
			tail=tail.next;
		}
	}
	
	private void printValue() {
	    Node curr=head;
	    while(curr!=null) {
	    	System.out.print(curr.data+"->");
	    	curr=curr.next;
	    }
	    System.out.println("null");
		
	}
	
	public void makeLoop(int pos) {
		if(pos==0) return;
		Node curr=head;
		int i=0;
		while(i<pos) {
			curr=curr.next;
			i++;
		}
		tail.next=curr;
	
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of LinkedList: ");
		int num=sc.nextInt();
		int arr[]=new int[num];
		System.out.print("Enter the element of LinkedList: ");
		for(int i=0;i<num;i++) {
			int n=sc.nextInt();
		     arr[i]=n;
		}
		Detect_Loop DL=new Detect_Loop();
		DL.insertValue(arr);
		System.out.print("Print the value of LinkedList: ");
		DL.printValue();
		System.out.print("Enter the position for loop: ");
		int pos=sc.nextInt();
		DL.makeLoop(pos);
//		boolean res=DL.detectLoop();
//		if(res==true) System.out.println("Loop Detected");
//		System.out.println("Loop Not Detected");
			
	}
}
