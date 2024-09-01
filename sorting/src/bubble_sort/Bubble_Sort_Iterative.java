package bubble_sort;

public class Bubble_Sort_Iterative {
	void sort(int arr[]) {
		boolean swapping;
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			swapping=false;
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapping=true;
				}
			}
			if(swapping==false)
				break;
		}
	}
	void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bubble_Sort_Iterative list=new Bubble_Sort_Iterative();
		int arr[]= {64,34,25,12,22,11,90};
		System.out.println("Before sorting: ");
		list.print(arr); 
		System.out.println("After sorting: ");
		list.sort(arr);
		list.print(arr);

	}

}
