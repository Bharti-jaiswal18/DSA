package linkedList_1;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class Deletion_at_end {
	Node head;
	public void deletion() {
		if(head==null)
			return;
		if(head.next==null) {
			head=null;
			return;
		}
		Node temp=head;
		Node previous=null;
		while(temp.next!=null) {
			previous=temp;
			temp=temp.next;
		}
		previous.next=null;
	}
	public void print() {
		Node curr=head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deletion_at_end list=new Deletion_at_end();
		list.head=new Node(1);
		list.head.next=new Node(2);
		list.head.next.next=new Node(3);
		System.out.println("Original list: ");
		list.print();
		System.out.println("After deletion at end: ");
		list.deletion();
		list.print();

	}

}
