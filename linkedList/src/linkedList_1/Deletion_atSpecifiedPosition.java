package linkedList_1;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

public class Deletion_atSpecifiedPosition {
   Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deletion_atSpecifiedPosition list=new Deletion_atSpecifiedPosition();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.print();
		list.deletion_specifiedPostion(2);
		list.print();

	}
	public void add(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;return;
			// Exit the method as the new node is now the head of the list
		}
			
		newNode.next=head;
		head=newNode;
	}
	public void print() {
		Node curr=head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		System.out.println();
	}
	public void deletion_specifiedPostion(int position) {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		if(position==0) {
			Node temp=head;
			head=head.next;
			temp=null; return;
		}
		// Traverse to the node just before the specified position
		Node curr=head;
		for(int i=1;i<position && curr.next!=null;i++) {
			curr=curr.next;
		}
		if(curr.next==null) {
			System.out.println("Position is beyond the end of list ");
		}else {
			Node temp=curr.next;
			curr.next=curr.next.next;
			temp=null;
		}
		
	}

}
