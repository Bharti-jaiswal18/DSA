package binary_search;

public class Binary_search {
	public static int binarySearch(int arr[], int low, int high, int x) {
		if(high>=low) {
			int mid=low+(high-low)/2;	
			 if(arr[mid]==x) {
				 return mid;
			 }
			 if(arr[mid]>x) {
				 return binarySearch(arr,low,mid-1,x);
			 }
			 else
				 return binarySearch(arr,mid+1,high,x);
			}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,8,12,16}; int low=0;
		int high=arr.length-1;
		int x=15;
		int result=binarySearch(arr,low,high,x);
		if(result==-1) {
			System.out.println("Element not found ");
		}
		else
			System.out.println("Element present at index: "+result);

	}

}
