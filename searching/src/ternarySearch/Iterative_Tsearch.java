package ternarySearch;

public class Iterative_Tsearch {
	static int search(int arr[],int x, int l, int r) {
		while(r>=l) {
		   int mid1=l+(r-l)/3;
		   int mid2=r-(r-l)/3;
		   if(arr[mid1]==x) {
			   return mid1;
		   }
		   if(arr[mid2]==x) {
			   return mid2;
		   }
		    if(arr[mid1]>x) {
			   r=mid1-1;
		   }
		   else if(arr[mid2]<x) {
			   l=mid2+1;
		   }
		   else {
			   r=mid2-1;
			   l=mid1+1;
		   }
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2,3,4,4,5,8,9,17,22}; int l=0;
		int r=arr.length-1;
		int x=4;
		int result=search(arr,x,l,r);
		if(result==-1) {
			System.out.println("Not Found ");
		}
		else {
			System.out.println("Present at index: "+result);
		}

	}

}
