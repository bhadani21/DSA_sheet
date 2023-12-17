package Recursion_Problems;

public class reverse_array {
	
	

	private static void reverseArray(int[] arr, int i, int n) {
		if(i>=n/2) return;
		int temp=arr[i];
		arr[i]=arr[n];
		arr[n]=temp;
		reverseArray(arr, i+1, n-1);
	}
	

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int length=arr.length-1;
		reverseArray(arr,0,length);
		for(int i=0;i<=length;i++)System.out.print(arr[i]+" ");
		
	}

}
