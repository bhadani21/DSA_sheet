package introduction_to_array;

public class Reverse_in_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		
//		Problem Description INplace
//		Given an array A of N integers and also given two integers B and C. Reverse the elements of the array A within the given inclusive range [B, C].
//
//
//		Problem Constraints
//		1 <= N <= 105
//		1 <= A[i] <= 109
//		0 <= B <= C <= N - 1
//
//
//		Input Format
//		The first argument A is an array of integer.
//		The second and third arguments are integers B and C
//
//
//		Output Format
//		Return the array A after reversing in the given range.
//
//
//		Example Input
//		Input 1:
//
//		A = [1, 2, 3, 4]
//		B = 2
//		C = 3
//		Input 2:
//
//		A = [2, 5, 6]
//		B = 0
//		C = 2
//
//
//		Example Output
//		Output 1:
//
//		[1, 2, 4, 3]
//		Output 2:
//
//		[6, 5, 2]
//
//
//		Example Explanation
//		Explanation 1:
//
//		We reverse the subarray [3, 4].
//		Explanation 2:
//
//		We reverse the entire array [2, 5, 6].
		
		int arr[]= {1,2,3,4};
		int start_ind=0;
		int end_ind = 2;
		arr=reverse_range(arr,start_ind,end_ind);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}

	}

	private static int[] reverse_range(int arr[], int start_ind, int end_ind) {
		while(start_ind < end_ind) {
			swap(arr,start_ind,end_ind);
			start_ind++;
			end_ind--;
		}
		return arr;
	}

	private static void swap(int[] arr, int start_ind, int end_ind) {
		int temp=arr[start_ind];
		arr[start_ind]=arr[end_ind];
		arr[end_ind]=temp;
	}

}
