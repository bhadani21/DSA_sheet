package two_d_array;

public class matrix_transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Problem Constraints
//		1 <= A.size() <= 1000
//
//		1 <= A[i].size() <= 1000
//
//		1 <= A[i][j] <= 1000
//
//
//
//		Input Format
//		First argument is a 2D matrix of integers.
//
//
//
//		Output Format
//		You have to return the Transpose of this 2D matrix.
//
//
//
//		Example Input
//		Input 1:
//
//		A = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
//		Input 2:
//
//		A = [[1, 2],[1, 2],[1, 2]]
//
//
//		Example Output
//		Output 1:
//
//		[[1, 4, 7], [2, 5, 8], [3, 6, 9]]
//		Output 2:
//
//		[[1, 1, 1], [2, 2, 2]]


		int[][] arr = { {1,2,3}, { 4,5,6} ,{7,8,9}};
		arr=matrix_transpose(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		
		}
		
	}

	private static int[][] matrix_transpose(int[][] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j <=i; j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		return arr;
	}

//	private static void  swap(int i, int j) {
//		// TODO Auto-generated method stub
//		int temp=i;
//		i=j;
//		j=temp;
//	}

}
