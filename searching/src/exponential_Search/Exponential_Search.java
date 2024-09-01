package exponential_Search;

import java.util.Arrays;

public class Exponential_Search {
	static int search(int arr[],int n, int x) {
		if(n==0)
			return -1;
		if(arr[0]==x)
			return 0;
		int i=1;
		while(i<n && arr[i]<=x) {
			i*=2;
		}
		return Arrays.binarySearch(arr,i/2,Math.min(i, n-1),x);
//		int left=i/2;
//		int right=Math.min(i,n-1);
//		while(left<=right) {
//			int mid=(left+right)/2;
//			if(arr[mid]==x)
//				return mid;
//			else if(arr[mid]>x)
//				right=mid-1;
//			else
//				left=mid+1;
//		}
//		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {21,27,32,41,52,68,71,89,95};
		int n=arr.length;
		int x=71;
		int index=search(arr, n, x);
		if(index==-1) {
			System.out.println("NOT FOUND");
		}
		else
			System.out.println("Present at index: "+index);

	}

}
