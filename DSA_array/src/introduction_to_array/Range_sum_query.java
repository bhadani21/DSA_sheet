package introduction_to_array;

public class Range_sum_query {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Problem Description
//		 You are given an integer array A of length N.
//		 You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
//		 For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
//		 More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
//
//
//		Problem Constraints
//		 1 <= N, M <= 103
//		 1 <= A[i] <= 105
//		 0 <= L <= R < N
//
//
//		Input Format
//		The first argument is the integer array A.
//		The second argument is the 2D integer array B.
//
//
//		Output Format
//		 Return an integer array of length M where ith element is the answer for ith query in B.
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
//
//
//		Example Explanation
//		Explanation 1:
//		The sum of all elements of A[0 ... 3] = 1 + 2 + 3 + 4 = 10.
//		The sum of all elements of A[1 ... 2] = 2 + 3 = 5.
//		Explanation 2:
//
//		The sum of all elements of A[0 ... 0] = 2 = 2.
//		The sum of all elements of A[1 ... 2] = 2 + 2 = 4.
		
		int A[] = {2,2,2};
		int[][] arr = { { 0, 0 }, { 1, 2 } };
		int ans[]=new int[arr.length];
		ans=range_sum_query(A,ans,arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
	}

	private static int[] range_sum_query(int[] a, int[] ans, int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			  ans[i]=find_sum(a,arr[i][0],arr[i][1]);
		}
		return ans;
	}

	private static int find_sum(int a[],int i, int j) {
		// TODO Auto-generated method stub
		int sum=0;
		for (int j2 = i; j2 <= j; j2++) {
			sum+= a[j2];
		}
		return sum;
	}

}
