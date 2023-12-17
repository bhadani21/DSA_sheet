package prefix_sum;

public class Prefix_sum_formula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Problem Description
//		You are given an integer array A of length N.
//		You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
//		For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
//		More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
//
//
//
//		Problem Constraints
//		1 <= N, M <= 105
//		1 <= A[i] <= 109
//		0 <= L <= R < N
//
//
//		Input Format
//		The first argument is the integer array A.
//		The second argument is the 2D integer array B.
//
//
//		Output Format
//		Return an integer array of length M where ith element is the answer for ith query in B.
//
//
//		Example Input
//		Input 1:
//		A = [1, 2, 3, 4, 5]
//		B = [[0, 3], [1, 2]]
//		Input 2:
//
//		A = [2, 2, 2]
//		B = [[0, 0], [1, 2]]
//
//
//		Example Output
//		Output 1:
//		[10, 5]
//		Output 2:
//
//		[2, 4]

		
		int A[] = {1,2,3,4,5};
		int[][] arr = { { 0, 3 }, { 1, 2 } };
		int ans[]=new int[arr.length];
		ans=range_sum_query_using_prefix_sum(A,ans,arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}

	}

	private static int[] range_sum_query_using_prefix_sum(int[] a, int[] ans, int[][] arr) {
		//creating prefix sum array
		int prefix_sum[]=new int[a.length];
		prefix_sum[0]=a[0];
		for (int i = 1; i < a.length; i++) {
			prefix_sum[i]= prefix_sum[i-1]+a[i];
		}
		// calculate range sum[L,R]=prefix_sum[R]-prefix_sum[L-1]
		for (int i = 0; i < arr.length; i++) {
			ans[i]= arr[i][0]==0?prefix_sum[arr[i][1]]:prefix_sum[arr[i][1]]-prefix_sum[arr[i][0]-1];
		}
		return ans;
	}

}
