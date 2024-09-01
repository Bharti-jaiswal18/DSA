package linear_search;

public class Basic_example {
	
	public int search(int arr[], int n, int x) {
		for(int i=0;i<n;i++) {
			if(arr[i]==x)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Basic_example o=new Basic_example();
		int arr[]= {20,50,40,30,70,15};
		int x=5;
	    int result=o.search(arr,arr.length,x);
	    if (result==-1) {
	    	System.out.println("Element not found");
	    }
	    else
	         System.out.println(result);
	    

	}

}
