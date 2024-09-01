package jump_Search;

public class Jump_Search_R {
 static int search(int arr[], int x) {
		int n=arr.length;
		int step=(int)Math.floor(Math.sqrt(n));
		int prev=0;
		for(int minStep=Math.min(step, n); arr[minStep]<x;minStep=Math.min(step, n)) {
			prev=step;
			step+= Math.floor(Math.sqrt(n));
			if(prev>=n)
				return -1;
		}
		while(arr[prev]<x) {
			prev++;
			if(prev==Math.min(step, n))
				return -1;
		}
		if(arr[prev]==x)
			return prev;
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,1,1,2,3,5,8,12,21,34,55,89,144,233,377,610};
		int x=55;
		int index=search(arr,x);
		System.out.println("Present at index: "+index);

	}

}
