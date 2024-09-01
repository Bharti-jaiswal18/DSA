package fibonacci_Search;

public class Fibonacci_Search {
	static int search(int arr[], int x, int n) {
		int fib2=0;
		int fib1=1;
		int fib=fib1+fib2;
		
		while(fib<n) {
			fib2=fib1;
			fib1=fib;
			fib=fib1+fib2;
		}
		int offset=0;
		while(fib>1) {
			int i=Math.min(offset+fib2, n);
			
			if(arr[i]<x) {
				fib=fib1;
				fib1=fib2;
				fib2=fib-fib1;
				offset=i;
			}
			else if(arr[i]>x) {
				fib=fib2;
				fib1=fib1-fib2;
				fib2=fib-fib1;
				
			}
			else 
				return i;
		}
		if(fib1==1 && arr[n-1]==x)
			return n;
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,22,35,40,45,50,80,82,85,90,100,235};
		int x=22;
		int n=arr.length;
		int index=search(arr,x,n);
		System.out.println("Present at index: "+index);
		System.out.println(n);

	}

}
