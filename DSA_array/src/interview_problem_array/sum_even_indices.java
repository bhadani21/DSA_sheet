package interview_problem_array;

public class sum_even_indices {

	public static void main(String[] args) {
//		
//		Problem Description
//		You are given an array A of length N and Q queries given by the 2D array B of size Q*2. Each query consists of two integers B[i][0] and B[i][1].
//		For every query, the task is to calculate the sum of all even indices in the range A[B[i][0]…B[i][1]].
//
//		Note : Use 0-based indexing
//
//
//		Problem Constraints
//		1 <= N <= 105
//		1 <= Q <= 105
//		1 <= A[i] <= 100
//		0 <= B[i][0] <= B[i][1] < N
//
//
//		Input Format
//		First argument A is an array of integers.
//		Second argument B is a 2D array of integers.
//
//
//		Output Format
//		Return an array of integers.
//
//
//		Example Input
//		Input 1:
//		A = [1, 2, 3, 4, 5]
//		B = [   [0,2] 
//		        [1,4]   ]
//		Input 2:
//		A = [2, 1, 8, 3, 9]
//		B = [   [0,3] 
//		        [2,4]   ]
//
//
//		Example Output
//		Output 1:
//		[4, 8]
//		Output 2:
//		[10, 17]
		
		int A[] = {2, 1, 8, 3, 9};
		int[][] arr = { { 0, 3 }, { 2, 4 } };
		int ans[]=new int[arr.length];
		ans=sum_even_indices(A,ans,arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+ " ");
		}



	}

	private static int[] sum_even_indices(int[] a, int[] ans, int[][] arr) {
		a=create_prefix_sum_even_array(a);
		for (int i = 0; i < arr.length; i++) {
			if(i==0) ans[i]= a[arr[i][1]];
			else ans[i]=a[arr[i][1]]-a[arr[i][0]-1];
		}
		return ans;
	}

	private static int[] create_prefix_sum_even_array(int[] a) {
		// 
		for (int i = 1; i < a.length; i++) {
			if(i%2!=0) {
				a[i]=0;
			}
			a[i]+=a[i-1];
		}
		return a;
	}

}
