package sliding_window;

public class minimum_swaps {

	public static void main(String[] args) {
//		Problem Description
//
//		Given an array of integers A and an integer B, find and return the minimum number of swaps required to bring all the numbers less than or equal to B together.
//
//		Note: It is possible to swap any two elements, not necessarily consecutive.
//
//
//
//		Problem Constraints
//
//		1 <= length of the array <= 100000
//		-109 <= A[i], B <= 109
//
//
//
//		Input Format
//
//		The first argument given is the integer array A.
//		The second argument given is the integer B.
//
//
//
//		Output Format
//
//		Return the minimum number of swaps.
//
//
//
//		Example Input
//
//		Input 1:
//
//		 A = [1, 12, 10, 3, 14, 10, 5]
//		 B = 8
//		Input 2:
//
//		 A = [5, 17, 100, 11]
//		 B = 20
//
//
//		Example Output
//
//		Output 1:
//
//		 2
//		Output 2:
//
//		 1
		
		int A[] = {5,17,100,11};
		int B=20;
		int ans=minimum_swaps(A,B);
		System.out.print("minimum swaps ");
		System.out.print(ans + " ");

	}

	private static int minimum_swaps(int[] a, int b) {
		int k=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]<=b) k++;
		}
		int count=0;
		for (int i = 0; i < k; i++) {
			if(a[i]>b) count++;
		}
		int ans=count;
		int l=1,r=k;
		while(r<a.length) {
			if(a[l-1]>b) count--;
			if(a[r]>b) count++;
			ans=Math.min(ans,count);
			l++;r++;
		}
		return ans;
	}

}
