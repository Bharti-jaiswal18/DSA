package linkedList_1;
//class Node{
//	int data;
//	Node next;
//	Node(int x){
//		data=x;
//		next=null;
//	}
//}
public class Middle_ofLL {
	//private Node head;
	static  void pushNode(Node[] head_ref,int data) {
		Node newNode=new Node(data);
//		if(head==null) {
//			head=newNode;
//		}
		newNode.next=head_ref[0];
		head_ref[0]=newNode;
	}
static int getMiddle(Node head) {
	Node s=head;
	Node f=head;
	while(f!=null && f.next!=null) {
		f=f.next.next;
		s=s.next;
	}
	return s.data;
}
	 
	 
	 		
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Middle_ofLL list=new Middle_ofLL();
//		list.pushNode(5);
//		list.pushNode(4);
//		list.pushNode(3);
//		list.pushNode(2);
//		list.pushNode(1);
//		list.getMiddle(head[1]);
		
		Node head[]=new Node[1];
		for(int i=5;i>0;i--) {
			pushNode(head,i);
		}
		System.out.println("Middle value of LinkedList : "+getMiddle(head[0]));
		

	}

}
