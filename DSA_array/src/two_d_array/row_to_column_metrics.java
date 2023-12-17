package two_d_array;

public class row_to_column_metrics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Problem Description
//		You are given a 2D integer matrix A, make all the elements in a row or column zero if the A[i][j] = 0. Specifically, make entire ith row and jth column zero.
//
//
//
//		Problem Constraints
//		1 <= A.size() <= 103
//
//		1 <= A[i].size() <= 103
//
//		0 <= A[i][j] <= 103
//
//
//
//		Input Format
//		First argument is a 2D integer matrix A.
//
//
//
//		Output Format
//		Return a 2D matrix after doing required operations.
//
//
//
//		Example Input
//		Input 1:
//
//		[1,2,3,4]
//		[5,6,7,0]
//		[9,2,0,4]
//
//
//		Example Output
//		Output 1:
//
//		[1,2,0,0]
//		[0,0,0,0]
//		[0,0,0,0]


		int[][] arr = { {1,2,3,4}, {5,6,7,0} ,{9,2,0,4}};
		arr=row_colummn_metrics(arr);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		
		}
		
		
	}

	private static int[][] row_colummn_metrics(int[][] arr) {
		int I=0,J=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if(arr[i][j]==0) {
					I=i;
					J=0;
					while(J<arr[0].length) {
						arr[I][J++]=-1;
					}
					I=0;
					J=j;
					while(I<arr.length) {
					 arr[I++][J]=-1;
						
					}
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if(arr[i][j]==-1) {
					arr[i][j]=0;
				}
			}
		}
		return arr;
	}

}
