package introduction_to_array;

public class Sum_Max_Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Problem Description
//		Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.
//
//
//		Problem Constraints
//		1 <= N <= 105
//		-109 <= A[i] <= 109
//
//
//		Input Format
//		First argument A is an integer array.
//
//
//		Output Format
//		Return the sum of maximum and minimum element of the array
//
//
//		Example Input
//		Input 1:
//
//		A = [-2, 1, -4, 5, 3]
//		Input 2:
//
//		A = [1, 3, 4, 1]
//
//
//		Example Output
//		Output 1:
//
//		1
//		Output 2:
//
//		5

	
		int arr[]= {1, 3, 4, 1};
		int sum= sum_min_max(arr);
		System.out.print("Sum of max and min element "+ sum);

}

	private static int sum_min_max(int[] arr) {
		int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		return max+min;
	}
	
}
