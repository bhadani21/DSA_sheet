package Recursion_Problems;

public class subset_sum {
	
	
	private static void subset_s(int i, int sum, int[] arr) {
		if(i==arr.length) {
			System.out.print(sum+" ");
			return;
		}
		sum+=arr[i];
		subset_s(i+1, sum, arr);
		sum-=arr[i];
		subset_s(i+1, sum, arr);
	}
	
	public static void main(String[] args) {
		int arr[]= {3,1,2};
		subset_s(0,0,arr);
	}

	

}
