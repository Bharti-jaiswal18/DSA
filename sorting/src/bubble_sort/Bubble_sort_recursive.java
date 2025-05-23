package bubble_sort;

import java.util.Arrays;

public class Bubble_sort_recursive {
	static void bubbleSort(int arr[],int n) {
		//Base case
		if(n==1)
			return;
		int count=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i]>arr[i+1]) {
				int temp=arr[i+1];
				arr[i+1]=arr[i];
				arr[i]=temp;
				count+=1;
			}
		}
		if(count==0)
			return ;
		bubbleSort(arr,n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {64,34,25,12,22,11,90};
		bubbleSort(arr,arr.length);
		System.out.println("Sorted array: ");
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
		
		System.out.println(Arrays.toString(arr));

	}

}
