package linkedList_1;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class Insertion_at_beginnig {
	Node head;
	public Node insert(int data) {
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
		return head;
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
		Insertion_at_beginnig list=new Insertion_at_beginnig();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.print();

	}

}
