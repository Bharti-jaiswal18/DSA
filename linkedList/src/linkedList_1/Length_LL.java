package linkedList_1;
class Node4{
	int data;
	Node4 next;
	Node4(int data){
		this.data=data;
		this.next=null;
	}
}
public class Length_LL {
	Node4 head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Length_LL list=new Length_LL();
//		list.add(1);
//		list.add(5);
//		list.add(8);
//		list.add(9);
//		//System.out.println(list.findLength());
//		//list.findLength();
//		list.addLast(15);
//		list.addLast(16);
//		list.print();
		list.add(1);
		list.addLast(5);
		list.add(3);
		list.addLast(4);
		list.add(2);
		System.out.println(list.findLength());
		list.print();

		

	}
	public int findLength() {
		int length=0;
		Node4 curr=head;
		while(curr!=null) {
			length++;
			curr=curr.next;
		}
		return length;
	}
	public void add(int data) {
		Node4 newNode=new Node4(data);
		if(head==null) {
			head=newNode;return;
			// Exit the method as the new node is now the head of the list
		}
			
		newNode.next=head;
		head=newNode;
	}
	public void addLast(int data) {
		Node4 newN=new Node4(data);
		if(head==null) {
			head=newN;
			return;
			// Exit the method as the new node is now the head of the list
		}
		newN.next=null;
		Node4 last=head;
		while(last.next!=null){
			last=last.next;
		}
	    	last.next=newN;
		    return ;
		
	}
	public void print() {
		Node4 curr=head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		System.out.println();
	}


}
