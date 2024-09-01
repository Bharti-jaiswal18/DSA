package selection_sort;

public class Selection_Sort_Algo {
	void sort(int arr[]) {
		int n=arr.length;
	   
	    for(int i=0;i<n-1;i++) {
	    	int max=i;
	    	for(int j=i+1;j<n;j++) {
	    		if(arr[j]<arr[max]) {
	    			max=j;
	    		}
	    	}
	    	int temp=arr[max];
	    	arr[max]=arr[i];
	    	arr[i]=temp;
	    }
	    
	}
	public void print(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Selection_Sort_Algo a=new Selection_Sort_Algo();
		int arr[]= {65,25,12,22,11};
		System.out.println("before sorted: ");
		a.print(arr);
		System.out.println("Sorted array: ");
		a.sort(arr);
		a.print(arr);

	}

}
