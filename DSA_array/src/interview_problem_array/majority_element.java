package interview_problem_array;

public class majority_element {

	public static void main(String[] args) {
		
//		Problem Description
//		Given an array of size N, find the majority element. The majority element is the element that appears more than floor(n/2) times.
//		You may assume that the array is non-empty and the majority element always exists in the array.
//
//
//
//		Problem Constraints
//		1 <= N <= 5*105
//		1 <= num[i] <= 109
//
//
//		Input Format
//		Only argument is an integer array.
//
//
//		Output Format
//		Return an integer.
//
//
//		Example Input
//		Input 1:
//		[2, 1, 2]
//		Input 2:
//		[1, 1, 1]
		
//		Example Output
//		Input 1:
//		2
//		Input 2:
//		1

		
		int A[] = {2, 1, 2,4,3};
		int ele=find_majority_element(A);
		System.out.print(ele);
		
	}

	private static int find_majority_element(int[] a) {
		int maj_ele =-1,fre=0;
		for (int i = 0; i < a.length; i++) {
			if(fre==0) {
				maj_ele=a[i];
			}
			else {
				if(maj_ele==a[i]) {
					fre++;
				}
				else {
					fre--;
				}
			}
		
		}
		return maj_ele;
}
}

