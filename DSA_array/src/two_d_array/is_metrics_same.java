package two_d_array;

public class is_metrics_same {

	public static void main(String[] args) {
//		Problem Description
//		You are given two matrices A and B of equal dimensions and you have to check whether two matrices are equal or not.
//
//		NOTE: Both matrices are equal if A[i][j] == B[i][j] for all i and j.
//
//
//		Problem Constraints
//		1 <= A.size(), B.size() <= 1000
//		1 <= A[i].size(), B[i].size() <= 1000
//		1 <= A[i][j], B[i][j] <= 1000
//		A.size() == B.size()
//		A[i].size() == B[i].size()
//
//
//		Input Format
//		First argument is 2-D array of integers representing matrix A.
//
//		Second argument is 2-D array of integers representing matrix B.
//
//
//
//		Output Format
//		Return 1 if both matrices are equal or return 0.
//
//
//
//		Example Input
//		Input 1:
//
//		A = [[1, 2, 3],
//		     [4, 5, 6],
//		     [7, 8, 9]]
//		B = [[1, 2, 3],
//		     [4, 5, 6],
//		     [7, 8, 9]]
//		Input 2:
//
//		A = [[1, 2, 3],
//		     [4, 5, 6],
//		     [7, 8, 9]]
//		B = [[1, 2, 3],
//		     [7, 8, 9],
//		     [4, 5, 6]]
//
//
//		Example Output
//		Output 1:
//
//		1
//		Output 2:
//
//		0
		
		int[][] arr = { {1,2,3}, { 4,5,6} ,{7,8,9}};
		int[][] arr1 = { {1,9,3}, { 4,5,6} ,{7,8,9}};
		
		boolean is_same=is_metrics_same(arr,arr1);
		
		System.out.println(is_same);


	}

	private static boolean is_metrics_same(int[][] arr, int[][] arr1) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if(arr[i][j]!=arr1[i][j]) return false;
			}
		}
		return true;
	}

}
