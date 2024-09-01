package binary_search;

public class Iterative_BinarySearch {
	int binarySearch(int arr[], int x) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]==x) {
				return mid;
			}
			if(arr[mid]<x) {
			 low=mid+1;
			}
			else
				high=mid-1;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iterative_BinarySearch o=new Iterative_BinarySearch ();
		int arr[]= {2,5,6,8,9};
		int x=6;
		int result=o.binarySearch(arr,x);
		if(result==-1) {
			System.out.println("Element not found");
		}
		else
			System.out.println("Element is present at index "+result);

	}

}
