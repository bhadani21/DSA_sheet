package prefix_sum;

public class Even_number_in_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		
//		You are given an array A of length N and Q queries given by the 2D array B of size Q×2.
//
//		Each query consists of two integers B[i][0] and B[i][1].
//
//		For every query, your task is to find the count of even numbers in the range from A[B[i][0]] to A[B[i][1]].
//
//
//
//		Problem Constraints
//		1 <= N <= 105
//		1 <= Q <= 105
//		1 <= A[i] <= 109
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
//		B = [   [0, 2] 
//		        [2, 4]
//		        [1, 4]   ]
//		Input 2:
//		A = [2, 1, 8, 3, 9, 6]
//		B = [   [0, 3]
//		        [3, 5]
//		        [1, 3] 
//		        [2, 4]   ]
//
//
//		Example Output
//		Output 1:
//		[1, 1, 2]
//		Output 2:
//		[2, 1, 1, 1]
		
		int A[] = {1,2,3,4,5};
		int[][] arr = { { 0, 2 }, { 2, 4 } };
		int ans[]=new int[arr.length];
		ans=even_no_count_in_range(A,ans,arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}


	}

	private static int[] even_no_count_in_range(int[] a, int[] ans, int[][] arr) {
		for (int i = 0; i < a.length; i++) {
			a[i]=a[i]%2==0?1:0;
		}
		for (int i = 1; i < a.length; i++) {
			a[i]=a[i-1]+a[i];
		}
		
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			ans[i]=arr[i][0]==0?a[arr[i][1]]:a[arr[i][1]]-a[arr[i][0]-1];
		}
		return ans;
	}

}
