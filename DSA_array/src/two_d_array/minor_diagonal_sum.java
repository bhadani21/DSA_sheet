package two_d_array;

public class minor_diagonal_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Problem Description
//		You are given a N X N integer matrix. You have to find the sum of all the minor diagonal elements of A.
//
//		Minor diagonal of a M X M matrix A is a collection of elements A[i, j] such that i + j = M + 1 (where i, j are 1-based).
//
//
//
//		Problem Constraints
//		1 <= N <= 103
//
//		-1000 <= A[i][j] <= 1000
//
//
//
//		Input Format
//		First and only argument is a 2D integer matrix A.
//
//
//
//		Output Format
//		Return an integer denoting the sum of minor diagonal elements.
//
//
//
//		Example Input
//		Input 1:
//
//		 A = [[1, -2, -3],
//		      [-4, 5, -6],
//		      [-7, -8, 9]]
//		Input 2:
//
//		 A = [[3, 2],
//		      [2, 3]]
//
//
//		Example Output
//		Output 1:
//
//		 -5 
//		Output 2:
//        
//		 4 

		int[][] arr = {{1,-2,-3}, {-4,5,-6},{-7,-8,9}};
		int sum=minor_diagonal_sum(arr);
		System.out.print(sum);
		
	}

	private static int minor_diagonal_sum(int[][] arr) {
		int sum=0;
		int i=0 ,j=arr[0].length-1;
		while(i<arr.length && j>=0) {
			sum+=arr[i][j];
			i++;
			j--;
		}
		return sum;
	}

}
