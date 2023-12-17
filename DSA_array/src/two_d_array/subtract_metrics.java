package two_d_array;

public class subtract_metrics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Problem Description
//
//		You are given two integer matrices A and B having same size(Both having same number of rows (N) and columns (M). You have to subtract matrix B from A and return the resultant matrix. (i.e. return the matrix A - B).
//
//		If A and B are two matrices of the same order (same dimensions). Then A - B is a matrix of the same order as A and B and its elements are obtained by doing an element wise subtraction of A from B.
//
//
//		Problem Constraints
//
//		1 <= N, M <= 103
//
//		-109 <= A[i][j], B[i][j] <= 109
//
//
//
//		Input Format
//
//		The first argument is the 2D integer array A
//		The second argument is the 2D integer array B
//
//
//		Output Format
//
//		Return a 2D matrix denoting A - B.
//
//
//
//		Example Input
//
//		Input 1:
//
//		A =  [[1, 2, 3], 
//		      [4, 5, 6], 
//		      [7, 8, 9]]
//
//		B =  [[9, 8, 7], 
//		      [6, 5, 4], 
//		      [3, 2, 1]]
//		Input 2:
//
//		A = [[1, 1]]
//		 
//		B = [[2, 3]] 
//
//
//		Example Output
//
//		Output 1:
//
//		 [[-8, -6, -4],
//		  [-2, 0, 2],
//		  [4, 6, 8]]
//		Output 2:
//
//		 [[-1, -2]]
		
		int[][] arr = { {1,2,3}, { 4,5,6} ,{7,8,9}};
		int[][] arr1 = { {1,9,3}, { 4,3,6} ,{7,8,9}};
		
		arr=metric_subtract(arr,arr1);
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		
		}


	}

	private static int[][] metric_subtract(int[][] arr, int[][] arr1) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j]-=arr1[i][j];
			}
		}
		return arr;
	}

		
}
