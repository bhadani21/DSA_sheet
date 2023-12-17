package introduction_to_array;

public class Array_Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Problem Description
//		Given an integer array A of size N and an integer B, you have to return the same array after rotating it B times towards the right.
//
//
//		Problem Constraints
//		1 <= N <= 105
//		1 <= A[i] <=109
//		1 <= B <= 109
//
//
//		Input Format
//		The first argument given is the integer array A.
//		The second argument given is the integer B.
//
//
//		Output Format
//		Return the array A after rotating it B times to the right
//
//
//		Example Input
//		Input 1:
//
//		A = [1, 2, 3, 4]
//		B = 2
//		Input 2:
//
//		A = [2, 5, 6]
//		B = 1
//
//
//		Example Output
//		Output 1:
//
//		[3, 4, 1, 2]
//		Output 2:
//
//		[6, 2, 5]
		
		int arr[]= {2,5,6};
		int b=1;
		int nos_eff_rot = b% arr.length;
		arr=rotate_array(arr,nos_eff_rot);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

	private static int[] rotate_array(int[] arr, int k) {
		reverse_array(arr,0,arr.length-1);
		reverse_array(arr,0,k-1);
		reverse_array(arr,k,arr.length-1);
		return arr;
		
	}

	private static void reverse_array(int[] arr, int i, int j) {
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
	}

}
