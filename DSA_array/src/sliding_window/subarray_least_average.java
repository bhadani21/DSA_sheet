package sliding_window;

public class subarray_least_average {

	public static void main(String[] args) {
		
//		Problem Description
//		Given an array of size N, find the subarray of size K with the least average.
//
//
//
//		Problem Constraints
//		1<=k<=N<=1e5
//		-1e5<=A[i]<=1e5
//
//
//		Input Format
//		First argument contains an array A of integers of size N.
//		Second argument contains integer k.
//
//
//		Output Format
//		Return the index of the first element of the subarray of size k that has least average.
//		Array indexing starts from 0.
//
//
//		Example Input
//		Input 1:
//		A=[3, 7, 90, 20, 10, 50, 40]
//		B=3
//		Input 2:
//
//		A=[3, 7, 5, 20, -10, 0, 12]
//		B=2
//
//
//		Example Output
//		Output 1:
//		3
//		Output 2:
//
//		4
		int A[] = {3, 7, 5, 20, -10, 0, 12};
		int B=2;
		int ans=subarray_least_average_staring_index(A,B);
		System.out.print("subarray least average staring index ");
		System.out.print(ans + " ");

	}

	private static int subarray_least_average_staring_index(int[] a, int b) {
		int sum=0;
		// if sum is less then average will be also less
		for (int i = 0; i < b; i++) {
			sum+=a[i];
		}
		int l=1,r=b,minSum=sum,ans=0;
		while(r<a.length) {
			sum=sum-a[l-1]+a[r];
			if(sum<minSum) {
				minSum=sum;
				ans=l;
			}
			l++;
			r++;
		}
		return ans;
	}

}
