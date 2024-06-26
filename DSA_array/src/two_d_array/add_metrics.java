package two_d_array;

public class add_metrics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Problem Description
//
//		You are given two matrices A & B of same size, you have to return another matrix which is the sum of A and B.
//		Note: Matrices are of same size means the number of rows and number of columns of both matrices are equal.
//
//		The Following will give you an idea of matrix addition:
//
//
//
//		Problem Constraints
//
//		1 <= A.size(), B.size() <= 1000 1 <= A[i].size(), B[i].size() <= 1000 1 <= A[i][j], B[i][j] <= 1000
//		Input Format
//
//		The first argument is the 2D integer array A The second argument is the 2D integer array B
//		Output Format
//
//		You have to return a vector of vector of integers after doing required operations.
//		Example Input
//
//		Input 1:
//		A = [[1, 2, 3],   
//		     [4, 5, 6],   
//		     [7, 8, 9]]  
//
//		B = [[9, 8, 7],   
//		     [6, 5, 4],   
//		     [3, 2, 1]]
//		 
//		Input 2:
//		A = [[1, 2, 3],   
//		     [4, 1, 2],   
//		     [7, 8, 9]]  
//
//		B = [[9, 9, 7],   
//		     [1, 2, 4],   
//		     [4, 6, 3]]
//		 
//		Example Output
//
//		Output 1:
//		[[10, 10, 10],   
//		 [10, 10, 10],   
//		 [10, 10, 10]]
//		Output 2:
//		[[10, 11, 10],   
//		 [5,   3,  6],   
//		 [11, 14, 12]]
		
		

		int[][] arr = { {1,2,3}, { 4,5,6} ,{7,8,9}};
		int[][] arr1 = { {1,9,3}, { 4,5,6} ,{7,8,9}};
		
		arr=metric_sum(arr,arr1);
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		
		}


	}

	private static int[][] metric_sum(int[][] arr, int[][] arr1) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j]+=arr1[i][j];
			}
		}
		return arr;
	}
}
