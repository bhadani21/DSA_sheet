package two_d_array;

public class anti_diagonals {

	public static void main(String[] args) {
//		Problem Description
//		Give a N * N square matrix A, return an array of its anti-diagonals. Look at the example for more details.
//
//
//		Problem Constraints
//		1<= N <= 1000
//		1<= A[i][j] <= 1e9
//
//
//		Input Format
//		Only argument is a 2D array A of size N * N.
//
//
//		Output Format
//		Return a 2D integer array of size (2 * N-1) * N, representing the anti-diagonals of input array A.
//		The vacant spaces in the grid should be assigned to 0.
//
//
//		Example Input
//		Input 1:
//		1 2 3
//		4 5 6
//		7 8 9
//		Input 2:
//
//		1 2
//		3 4
//
		
//
//		Example Output
//		Output 1:
//		1 0 0
//		2 4 0
//		3 5 7
//		6 8 0
//		9 0 0
//		Output 2:
//
//		1 0
//		2 3
//		4 0
		
		int[][] arr = { {1,2,3}, { 4,5,6} ,{7,8,9}};
		int ans[][]=new int[(2 *arr.length-1)][arr.length];
		ans=anti_diagonal(ans,arr);
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[i].length; j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		
		}

	}

	private static int[][] anti_diagonal(int[][] ans, int[][] arr) {
		// TODO Auto-generated method stub
		int I=0,J=0,k=0,l=0;
		int col=arr[0].length;
		int row=arr.length;
		for (int j = 0; j < col ; j++) {
			J=j;I=0;
			while(I<row && J>=0) {
				ans[k][l++]=arr[I++][J--];
			}
			k++;l=0;
		}
		for (int i = 1; i < row ; i++) {
			J=col-1;I=i;
			while(I<row && J>=0) {
				ans[k][l++]=arr[I++][J--];
			}
			k++;l=0;
		}
		return ans;
	}

}
