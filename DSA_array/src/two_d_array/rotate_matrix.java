package two_d_array;

public class rotate_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Problem Description
//		You are given a n x n 2D matrix A representing an image.
//
//		Rotate the image by 90 degrees (clockwise).
//
//		You need to do this in place.
//
//		Note: If you end up using an additional array, you will only receive partial score.
//
//
//
//		Problem Constraints
//		1 <= n <= 1000
//
//
//
//		Input Format
//		First argument is a 2D matrix A of integers
//
//
//
//		Output Format
//		Return the 2D rotated matrix.
//
//
//
//		Example Input
//		Input 1:
//
//		 [
//		    [1, 2],
//		    [3, 4]
//		 ]
//		Input 2:
//
//		 [
//		    [1, 2, 3],
//		    [4, 5, 6],
//		    [7, 8, 9]
//		 ]
//
//
//		Example Output
//		Output 1:
//
//		 [
//		    [3, 1],
//		    [4, 2]
//		 ]
//		Output 2:
//
//		 [
//		    [7, 4, 1],
//		    [8, 5, 2],
//		    [9, 6, 3]
//		 ]
		

		int[][] arr = { {1,2,3}, { 4,5,6} ,{7,8,9}};
		arr=rotate_matrix(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		
		}
		
	}
	
	// first transpose matrix and reverse matrix 

	private static int[][] rotate_matrix(int[][] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j <=i; j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			int j=0,k=arr[0].length-1;
			while(j<k) {
				int temp=arr[i][j];
				arr[i][j]=arr[i][k];
				arr[i][k]=temp;
				j++;
				k--;
			}
		}
		return arr;
	}
	
}


