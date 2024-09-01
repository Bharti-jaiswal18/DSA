package linkedList_1;
class Node{
	Node next;
	int data;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class Deletion_givenPosition {
	Node head;
	public void deletion(int key) {
		if(head==null)
			return ;
		if(head.data==key) {
			head=head.next;
			//head=null;
			System.out.println("deleted");
		
			return;
		}
		Node prev=null;
		Node curr=head;
		while(curr!=null && curr.data!=key) {
			prev=curr;
			curr=curr.next;
		}
		if(curr==null) {
			System.out.println("key not found in the list: ");
			return;
		}
		prev.next=curr.next;
		curr=null;
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
		Deletion_givenPosition list=new Deletion_givenPosition();
		list.head=new Node(1);
		list.head.next=new Node(2);
		list.head.next.next=new Node(3);
		list.head.next.next.next=new Node(4);
		System.out.println("Original list: ");
		list.print();
		System.out.println("after deletion at specific position: ");
		list.deletion(1);
		list.print();

	}

}
