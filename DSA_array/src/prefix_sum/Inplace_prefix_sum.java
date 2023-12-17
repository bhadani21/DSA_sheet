package prefix_sum;

public class Inplace_prefix_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
//		
//		Problem Description
//		Given an array A of N integers. Construct prefix sum of the array in the given array itself.
//
//
//		Problem Constraints
//		1 <= N <= 105
//		1 <= A[i] <= 103
//
//
//		Input Format
//		Only argument A is an array of integers.
//
//
//		Output Format
//		Return an array of integers denoting the prefix sum of the given array.
//
//
//		Example Input
//		Input 1:
//
//		A = [1, 2, 3, 4, 5]
//		Input 2:
//
//		A = [4, 3, 2]
//
//
//		Example Output
//		Output 1:
//
//		[1, 3, 6, 10, 15]
//		Output 2:
//
//		[4, 7, 9]
		
		

		int A[] = {0,2,3,4,5};
		A= prefix_sum_inplace(A);
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]+" ");
		}
		
		
	}

	private static int[] prefix_sum_inplace(int[] a) {
		// TODO Auto-generated method stub
		for (int i = 1; i < a.length; i++) {
			a[i]=a[i-1]+a[i];
		}
		return a;
	}

}
