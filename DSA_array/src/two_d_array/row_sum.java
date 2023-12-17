package two_d_array;

public class row_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		Problem Constraints
//		1 <= A.size() <= 103
//
//		1 <= A[i].size() <= 103
//
//		1 <= A[i][j] <= 103
//
//
//
//		Input Format
//		First argument A is a 2D array of integers.(2D matrix).
//
//
//
//		Output Format
//		Return an array containing row-wise sums of original matrix.
//
//
//
//		Example Input
//		Input 1:
//
//		[1,2,3,4]
//		[5,6,7,8]
//		[9,2,3,4]
//
//
//		Example Output
//		Output 1:
//
//		[10,26,18]
//
//
//		Example Explanation
//		Explanation 1
//
//		Row 1 = 1+2+3+4 = 10
//		Row 2 = 5+6+7+8 = 26
//		Row 3 = 9+2+3+4 = 18
		
		
		int[][] arr = { {1,2,3,4 }, {5,6,7,8} ,{9,2,3,4}};
		int ans[]=new int[arr.length];
		ans=row_sum(ans,arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}	
	}

	private static int[] row_sum(int[] ans, int[][] arr) {
		int k=0;
		for (int i = 0; i < arr.length; i++) {
			int sum=0;
			for(int j=0;j<arr[0].length;j++) {
				sum+=arr[i][j];
			}
			ans[k++]=sum;
		}
		return ans;
	}

}
