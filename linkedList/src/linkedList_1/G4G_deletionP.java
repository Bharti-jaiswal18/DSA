package linkedList_1;
class Node{
	Node next;
	int data;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class G4G_deletionP {
	Node head;
	Node del(int x) {
		if(head==null)
			return null;
//		if(head.data==x) {
//			head=head.next;
//			return head;
//		}
		Node prev=null;
		Node curr=head;
		int count=1;
		while(curr != null) {
			if(count==x) {
				if(prev==null) {
					return curr=curr.next;
					
				}
				else {
					prev.next=curr.next;
					curr=null;
					return head;
				}
				
			}
			prev=curr;
			curr=curr.next;
			count++;
		}
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
		public Node insert(int value) {
			Node newNode=new Node(value);
			if(head==null) {
				head=newNode;
				return head;
			}
			Node curr=head;
				while(curr.next!=null) {
					curr=curr.next;
				}
				return curr.next=newNode;
				//curr.next=newNode;
			}
			
		

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		G4G_deletionP list=new G4G_deletionP();
		list.insert(5);
		list.insert(8);
		list.insert(10);
		list.insert(8);
		list.insert(7);
		list.insert(1);
		list.insert(6);
		list.insert(9);
		list.insert(9);
		list.insert(9);
		list.insert(7);
		list.del(10);
		list.print();
		

	}

}
