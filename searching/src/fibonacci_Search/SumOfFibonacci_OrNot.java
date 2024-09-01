package fibonacci_Search;

import java.util.HashSet;

//Check if sum of Fibonacci elements in an Array is a Fibonacci number or not
public class SumOfFibonacci_OrNot {
 	static int max=100005;
static 	HashSet<Integer> fib=new HashSet<Integer>();
	static void createHash() {
		int prev=0,curr=1;
		fib.add(prev);
		fib.add(curr);
		
		while(curr<=max) {
			int temp=curr+prev;
			fib.add(temp);
			prev=curr;
			curr=temp;
		}
		
	}
	
	static boolean checkArray(int arr[], int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			if(fib.contains(arr[i]))
				sum+=arr[i];
		}
		 if(fib.contains(sum))
			 return true;
		 
		 return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,4,8,2};
		int n=arr.length;
		createHash();
		if(checkArray(arr,n))
			System.out.println("yes");
		else
			System.out.println("NO");

	}

}
