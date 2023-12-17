package introduction_to_array;

public class Reverse_array_inplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Problem Description
//		You are given a constant array A.
//
//		You are required to return another array which is the reversed form of the input array.
//
//
//
//		Problem Constraints
//		1 <= A.size() <= 10000
//
//		1 <= A[i] <= 10000
//
//
//
//		Input Format
//		First argument is a constant array A.
//
//
//
//		Output Format
//		Return an integer array.
//
//
//
//		Example Input
//		Input 1:
//
//		A = [1,2,3,2,1]
//		Input 2:
//
//		A = [1,1,10]
//
//
//		Example Output
//		Output 1:
//
//		 [1,2,3,2,1] 
//		Output 2:
//
//		 [10,1,1] 
//
//
//		Example Explanation
//		Explanation 1:
//
//		Reversed form of input array is same as original array
//		Explanation 2:
//
//		Clearly, Reverse of [1,1,10] is [10,1,1]
		
		int arr[]= {1,2,3,4,0};
		arr=reverse_array(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}


	}

	private static int[] reverse_array(int[] arr, int i, int j) {
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	
	return arr;
	}

}
