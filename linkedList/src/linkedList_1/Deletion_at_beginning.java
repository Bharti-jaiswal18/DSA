package linkedList_1;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class Deletion_at_beginning {
	Node head;
	public  void deletion_B() {
		if(head==null)
			return;
		Node temp=head;
		head=head.next;
		temp=null;//helps in garbage collection
		
	}
	public  void print() {
		//Node curr=new Node());
		Node curr=head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deletion_at_beginning list=new Deletion_at_beginning();
		//creating a LL with nodes
		list.head=new Node(1);
		list.head.next=new Node(2);
		list.head.next.next=new Node(3);
		System.out.println("Original list: ");
		list.print();
		System.out.println("After deleting the head node: ");
		list.deletion_B();
		list.print();
		
		

	}

}
