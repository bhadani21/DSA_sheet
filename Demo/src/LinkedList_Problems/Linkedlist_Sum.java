package LinkedList_Problems;

public class Linkedlist_Sum {
	
	Node head1;
	Node head2;

	public static void main(String[] args) {
		//first List
		Node head1=new Node(3);
		Node n2=new Node(5);
		Node n3=new Node(7);
		head1.next=n2;
		n2.next=n3;
		n3.next=null;
		System.out.println("First Linked list");
		printList(head1);
		//second list
		Node head2=new Node(5);
		Node n5=new Node(2);
		Node n6=new Node(4);
		head2.next=n5;
		n5.next=n6;
		n6.next=null;
		//
		System.out.println("Second Linked list");
		printList(head2);
//		//
//		System.out.println("Reversed First Linked list");
//		head1=reversed(head1);
//		printList(head1);
//		System.out.println("Reversed Second Linked list");
//		head2=reversed(head2);
//		printList(head2);
//		
		Node ans=addition(head1,head2);
		System.out.println("Addition of two Linked list");
		printList(ans);
		ans=reversed (ans);
		System.out.print("Addition of two Linked list:");
		printList(ans);
	}

	private static Node addition(Node head1, Node head2) {
		Node dummy=new Node(0);
		Node ans=dummy;
		int carry=0;
		while(head1!=null || head2!=null || carry==1) {
			int sum=0;
			if(head1!=null) {
				sum+=head1.data;
				head1=head1.next;
			}
			if(head2!=null) {
				sum+=head2.data;
				head2=head2.next;
			}
			sum+=carry;
			carry=sum/10;
			Node temp=new Node(sum%10);
			dummy.next=temp;
			dummy=dummy.next;
		}
		return ans.next;
	}

	// reverse Linked List
	private static Node reversed(Node head) {
		Node curr=head; Node prev=null; Node nex=head;
		while(curr!=null) {
			nex=curr.next;
			curr.next=prev;
			prev=curr;
			curr=nex;	
		}
		head=prev;
		return head;
	}

	private static void printList(Node head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
		
	}

	

}

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
	}
	
}
