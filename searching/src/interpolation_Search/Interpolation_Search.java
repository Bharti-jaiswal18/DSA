package interpolation_Search;

public class Interpolation_Search {
	int search(int arr[],int x, int lo, int hi) {
	   if(lo<=hi && arr[lo]<=x && arr[hi]>x) {
		   int pos=lo+ (x-arr[lo])* ((hi-lo)/(arr[hi]-arr[lo]));
//		int   pos = lo
//	                  + (((hi - lo) / (arr[hi] - arr[lo]))
//	                     * (x - arr[lo]));
		   if(arr[pos]==x) {
			   return pos;
		   }
		   else if(arr[pos]>x) {
			   return search(arr, x, lo, pos-1);
		   }
		   else
			   return search(arr,x, pos+1, hi);
	   }
	   return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interpolation_Search o=new Interpolation_Search();
		int arr[]= {0,1,1,2,4,5,8,12,14,17};
		int x=14;
		int lo=0;
		int hi=arr.length-1;
		int index=o.search(arr,x,lo,hi);
		System.out.println("Present at index: "+index);

	}

}
