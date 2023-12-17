package sub_array_sum;

import java.util.ArrayList;
import java.util.List;

public class maximum_subarray_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Problem Description
//		You are given an integer array C of size A. Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.
//		But the sum must not exceed B.
//
//
//		Problem Constraints
//		1 <= A <= 103
//		1 <= B <= 109
//		1 <= C[i] <= 106
//
//
//		Input Format
//		The first argument is the integer A.
//		The second argument is the integer B.
//		The third argument is the integer array C.
//
//
//		Output Format
//		Return a single integer which denotes the maximum sum.
//
//
//		Example Input
//		Input 1:
//		A = 5
//		B = 12
//		C = [2, 1, 3, 4, 5]
//		Input 2:
//
//		A = 3
//		B = 1
//		C = [2, 2, 2]
//
//
//		Example Output
//		Output 1:
//		12
//		Output 2:
//
//		0
		
		int A[] = {2,1,3,4,5};
		int B=12;
		int c =5;
		int ans=max_subarray_sum(A,B,c);
		System.out.print("Max Sub array sum = ");
		System.out.print(ans + " ");

	}

	private static int max_subarray_sum(int[] a, int b, int c) {
		int ans=0,max=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			int sum=0;
			max=ans;
			for (int j = i; j < a.length; j++) {
					sum+=a[j];
					if(sum>max) max=sum;
					if(max<=b)ans=max;
			}
		}
		return ans!=0?ans:0;
	}

}

