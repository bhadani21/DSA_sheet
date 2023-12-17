package sub_array_sum;

import java.util.ArrayList;
import java.util.List;

public class sum_sub_array_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Problem Description
//		You are given an integer array A of length N.
//		You have to find the sum of all subarray sums of A.
//		More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
//		A subarray sum denotes the sum of all the elements of that subarray.
//
//		Note : Be careful of integer overflow issues while calculations. Use appropriate datatypes.
//
//
//
//		Problem Constraints
//		1 <= N <= 105
//		1 <= Ai <= 10 4
//
//
//		Input Format
//		The first argument is the integer array A.
//
//
//		Output Format
//		Return a single integer denoting the sum of all subarray sums of the given array.
//
//
//		Example Input
//		Input 1:
//		A = [1, 2, 3]
//		Input 2:
//
//		A = [2, 1, 3]
//
//
//		Example Output
//		Output 1:
//		20
//		Output 2:
//
//		19
		

		int A[] = {2,1,3};
		int ans=sub_array_sum_sum(A);
		System.out.print("Sub array sum = ");
		System.out.print(ans + " ");


	}
		// for ith element left side contribution is i+1 and right side n-i (n-1-i+1) 
	private static int sub_array_sum_sum(int[] a) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=(a.length-i)*(i+1)*a[i]; //contribution technique
		}
		return sum;
	}

}
