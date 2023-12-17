package sub_array_sum;

import java.util.ArrayList;
import java.util.List;

public class subarray_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Problem Description
//		Given an array A of length N, return the subarray from B to C.
//
//
//		Problem Constraints
//		1 <= N <= 105
//
//		1 <= A[i] <= 109
//
//		0 <= B <= C < N
//
//
//
//		Input Format
//		The first argument A is an array of integers
//
//		The remaining argument B and C are integers.
//
//
//
//		Output Format
//		Return a subarray
//
//
//		Example Input
//		Input 1:
//		A = [4, 3, 2, 6]
//		B = 1
//		C = 3
//		Input 2:
//
//		A = [4, 2, 2]
//		B = 0
//		C = 1
//
//
//		Example Output
//		Output 1:
//		[3, 2, 6]
//		Output 2:
//
//		[4, 2]

		
		int A[] = {4,3,2,6};
		int start=1;
		int end =3;
		List<Integer> ans=new ArrayList<Integer>();
		ans=sub_array_range(A,ans,start,end);
		System.out.print("Sub array range = ");
		System.out.print(ans + " ");

	}

	private static List<Integer> sub_array_range(int[] a, List<Integer> ans, int start, int end) {
		// TODO Auto-generated method stub
		for (int i = start; i <= end; i++) {
				ans.add(a[i]);
		}
		return ans;
	}

}
