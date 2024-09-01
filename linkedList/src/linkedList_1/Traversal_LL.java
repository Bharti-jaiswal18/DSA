package linkedList_1;
class Node2{
	int data;
	Node2 next;
	Node2(int data){
		this.data=data;
		this.next=null;
	}
}
public class Traversal_LL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create nodes
		Node2 head=new Node2(1);
		Node2 second=new Node2(2);
		Node2 third=new Node2(3);
		
		//connect nodes
		head.next=second;
		second.next=third;
		traversalLinkedList(head);

	}
	public static void traversalLinkedList(Node2 head) {
		Node2 currnode=head;
		while(currnode!=null) {
			System.out.print(currnode.data+" -> ");
			currnode=currnode.next;
		}
		System.out.println();
	}

}
