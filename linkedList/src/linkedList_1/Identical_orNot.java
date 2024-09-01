package linkedList_1;
// Time Complexity: O(m*n)
//auxiliary space: O(1)
class Node {
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		this.next=null;
	}
	
}
public class Identical_orNot {
	Node head;
	
	
	boolean areIdentical(Identical_orNot listb) {
		Node a=this.head;
		Node b=listb.head;
		
		while(a!=null && b!=null) {
			if(a.data!=b.data)
				return false;
			
			a=a.next;
			b=b.next;
		}
		return (a==null && b==null);
//		After the loop, the method checks if both a and b are null. This final check ensures that both lists were of the same length. If one list was longer than the other, one of the pointers (a or b) would not
//		be null, and the method would return false.
	}
	void addFirst(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Identical_orNot list1=new Identical_orNot();
		Identical_orNot list2=new Identical_orNot();
		list1.addFirst(1);
		list1.addFirst(2);
		list1.addFirst(3);
		
		list2.addFirst(1);
		list2.addFirst(2);
		list2.addFirst(3);
		list2.addFirst(4);
		
		if(list1.areIdentical(list2)==true)
			System.out.println("Identical ");
		else
			System.out.println("Not Identical ");

	}

}
