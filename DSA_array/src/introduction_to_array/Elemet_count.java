package introduction_to_array;

public class Elemet_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Problem Description
//		Given an array A of N integers. 
//		Count the number of elements that have at least 1 elements greater than itself.
//
//
//		Problem Constraints
//		1 <= N <= 105
//		1 <= A[i] <= 109
//
//
//		Input Format
//		First and only argument is an array of integers A.
//
//
//		Output Format
//		Return the count of elements.
//
//
//		Example Input
//		Input 1:
//		A = [3, 1, 2]
//		Input 2:
//		A = [5, 5, 3]
//
//
//		Example Output
//		Output 1:
//		2
//		Output 2:
//		1
//
//
//		Example Explanation
//		Explanation 1:
//		The elements that have at least 1 element greater than itself are 1 and 2
//		Explanation 2:
//		The elements that have at least 1 element greater than itself is 3
		
		
		int arr[]= {3,5,5};
		int len=arr.length;
		int count=count_element(arr,len);
		System.out.println("Element count atleast greater than 1 element= "+ count);

	}
	
	

	private static int count_element(int[] arr, int len) {
		// TODO Auto-generated method stub
		int max=Integer.MIN_VALUE;
		int count=0;
		for(int i=0;i<len;i++) {
			if(arr[i]>max) {
				max=arr[i];
				count=1;
			}
			else if(max==arr[i]){
				count++;
			}
		}
		return len-count;
	}

}
