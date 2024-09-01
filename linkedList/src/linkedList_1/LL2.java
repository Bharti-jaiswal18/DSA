package linkedList_1;
import java.util.LinkedList;

public class LL2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>list=new LinkedList<String>();
		list.addFirst("a");
		list.addFirst("is");
		System.out.println(list);
		
		list.addFirst("this");
		list.addLast("list");//bydefault last
		System.out.println(list);
		
		System.out.println(list.size());
		 for(int i=0;i<list.size();i++) {
			 System.out.print(list.get(i)+" -> ");
		 }
		 System.out.println("null");
		 
		 list.remove(); //bydefault first
		 System.out.println(list);
		 list.removeLast();
		 System.out.println(list);
		 list.remove(1);
		 System.out.println(list);

	}

}
