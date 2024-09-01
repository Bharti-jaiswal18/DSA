package selection_sort;

public class Selection_Sort_g4g {
	int select(int arr[], int i) {
		for(i=0;i<arr.length;i++) {
			//System.out.print(arr[i]+" ");
			return arr[i];
		}
		return -1;
	}
	void sort(int arr[], int n) {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {65,22,12,25,11};
		Selection_Sort_g4g  a=new Selection_Sort_g4g ();
		a.sort(arr, 5);
		System.out.println(a.select(arr, 0));

	}

}
