package linkedList_1;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class Insert_At_Last {
	Node head;
	public void append(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			newNode=head;
			return ;
		}
		Node curr=head;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=newNode;
	}
	public Node insertB(int data) {
		Node newNode=new Node(data);
		//Node curr=head;
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
		Insert_At_Last list =new Insert_At_Last();
		list.insertB(1);
		list.insertB(2);
		list.insertB(3);
		System.out.println("created a linkedList, by inserting at beginnig");
		list.print();
		System.out.println("LinkedList insertion at end");
		list.append(6);
		list.append(5);
		list.append(4);
		list.print();
		

	}

}
