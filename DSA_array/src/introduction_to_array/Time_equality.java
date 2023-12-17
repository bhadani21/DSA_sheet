package introduction_to_array;

public class Time_equality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Problem Description
//		Given an integer array A of size N. In one second, you can increase the value of one element by 1.
//
//		Find the minimum time in seconds to make all elements of the array equal.
//
//
//		Problem Constraints
//		1 <= N <= 1000000
//		1 <= A[i] <= 1000
//
//
//		Input Format
//		First argument is an integer array A.
//
//
//		Output Format
//		Return an integer denoting the minimum time to make all elements equal.
//
//
//		Example Input
//		A = [2, 4, 1, 3, 2]
//
//
//		Example Output
//		8
//
//
//		Example Explanation
//		We can change the array A = [4, 4, 4, 4, 4]. The time required will be 8 seconds.

		int arr[]= {1,2,3,4,5};
		int min_time= minimum_time(arr);
		System.out.println(min_time);
		

	}

	private static int minimum_time(int[] arr) {
		int max=find_max_element(arr);
		int min_time=0;
		for (int i = 0; i < arr.length; i++) {
			min_time +=max-arr[i]; 
		}
		return min_time;
	}

	private static int find_max_element(int[] arr) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
	}
	return max;
}
}
