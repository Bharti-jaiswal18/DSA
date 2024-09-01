package linkedList_1;
class Node3{
	int data;
	Node3 next;
	Node3(int data){
		this.data=data;
		this.next=null;
	}
}
public class Searching_LL {
    Node3 head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Searching_LL list=new Searching_LL ();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list.searchLinkedList(2));
		
		

	}
	public  boolean searchLinkedList( int target) {
		Node3 curr=head;
		while(curr!=null) {
			if(curr.data==target) {
				return true;
			}
			curr=curr.next;
		}
		return false;
	}
	public void add(int data) {
		Node3 newNode=new Node3(data);
		if(head==null) {
			head=newNode;
		}
		newNode.next=head;
		head=newNode;
	}

}
