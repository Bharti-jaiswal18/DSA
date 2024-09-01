package selection_sort;

public class Selection_recursive {
	static int minindex(int arr[],int i, int j) {
		if(i==j)
			return i;
		int k=minindex(arr,i+1,j);
		return (arr[i]<arr[k])?i:k;
	}
	static void recSelection(int arr[], int n, int index) {
		if(index==n)
			return;
		int k=minindex(arr, index,n-1);
		if(k!=index) {
			int temp=arr[k];
			arr[k]=arr[index];
			arr[index]=temp;
		}
		recSelection(arr,n,index+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,1,5,2,7,0};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
//It starts by finding the minimum element in the subarray from the current index to the end of the array.
//It swaps the minimum element with the element at the current index.
//It then recursively calls itself to sort the remaining part of the array, excluding the already sorted part.