package practice_LL;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class prog_1 {
	Node head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		prog_1 list=new prog_1 ();
//		list.addFirst(5);
//		list.addFirst(4);
//		list.addFirst(3);
//		list.traverse(null);
		Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(6);

        // Printing the above list
        System.out.print("Linked List:");
        traverse(head);

	}
	public void addFirst(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	public static void traverse(Node head) {
		Node curr=head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		System.out.println();
	}

}
