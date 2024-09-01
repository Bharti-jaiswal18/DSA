package ternarySearch;

public class recursive_ternerySearch {
	int Tsearch(int arr[], int left, int right, int x) {
		if(right>=left) {
			int mid1=left+(right-left)/3;
			int mid2= right-(right-left)/3;
			if(arr[mid1]==x) {
				return mid1;
			}
			if(arr[mid2]==x) {
				return mid2;
			}
			if(arr[mid1]>x) {
				return Tsearch(arr,left,mid1-1,x);
			}
			else if(arr[mid2]<x){
				return Tsearch(arr,mid2+1,right,x);
			}
			else
				return Tsearch(arr,mid1+1,mid2-1,x);
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recursive_ternerySearch o=new recursive_ternerySearch();
		int arr[]= {1,5,9,12,15,19};
		int x=12;
		int left=0;
		int right=arr.length-1;
		int result=o.Tsearch(arr,left,right,x);
		if(result==-1) {
			System.out.println("Element not found ");
		}
		else
			System.out.println("Present at index: "+result);
		
		int x2=19;
		int result2=o.Tsearch(arr,left,right,x2);
		if(result==-1) {
			System.out.println("Element not found ");
		}
		else
			System.out.println("Present at index: "+result2);
		

	}

}
