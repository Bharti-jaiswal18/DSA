package linkedList_1;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class Reverse_LL {
	 static Node head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse_LL list=new Reverse_LL();
		list.head=new Node(85);
		list.head.next=new Node(15);
		list.head.next.next=new Node(4);
		list.head.next.next.next=new Node(20);
		System.out.println("Given linked list ");
		list.printList(head);
		head=list.reverse(head);
		System.out.println();
		list.printList(head);
//		head=list.reverse(head);
//		list.printList();

	}
	public  Node reverse(Node node) {
		Node prev=null;
		Node curr=node;
		Node next=null;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		 node=prev;
		 return node;
	}
//	public void printList( ) {
//		Node curr=head;
//		while(head!=null) {
//			System.out.println(curr.data+" ");
//			curr=curr.next;
//		}
//		return;
//	}
	public void printList(Node n) {
		while(n!=null) {
			System.out.println(n.data+" ");
			n=n.next;
		}
	}

}
