package interview_problem_array;

public class special_index {

	public static void main(String[] args) {
//		Problem Description
//		Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.
//
//
//
//		Problem Constraints
//		1 <= n <= 105
//		-105 <= A[i] <= 105
//
//
//		Input Format
//		First argument contains an array A of integers of size N
//
//
//		Output Format
//		Return the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.
//
//
//
//		Example Input
//		Input 1:
//		A=[2, 1, 6, 4]
//		Input 2:
//
//		A=[1, 1, 1]
//
//
//		Example Output
//		Output 1:
//		1
//		Output 2:
//
//		3
		

		int A[] = {1,1,1};
		int count=special_index(A);
		System.out.print("special index count "+count);
	

	}

	private static int special_index(int[] a) {
		int evenPrefix[] = new int[a.length];
		int oddPrefix[] = new int[a.length];
		evenPrefix=create_even_prefix_sum_array(a,evenPrefix);
		oddPrefix=create_odd_prefix_sum_array(a,oddPrefix);
		for (int i = 0; i < oddPrefix.length; i++) {
			System.out.print(oddPrefix[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < evenPrefix.length; i++) {
			System.out.print(evenPrefix[i]+" ");
		}
		int N=a.length;
		int sE=0,sO=0;
		int count=0;
		for (int i = 0; i < N ; i++) {
			if(i==0) {
				sE=oddPrefix[N-1]-oddPrefix[i];
				sO=evenPrefix[N-1]-evenPrefix[i];
			}
			else {
				sE=evenPrefix[i-1]+oddPrefix[N-1]-oddPrefix[i];
				sO=oddPrefix[i-1]+evenPrefix[N-1]-evenPrefix[i];
			}
			if(sE==sO) count++;
			
		}
		return count;
		
	}

	private static int[] create_odd_prefix_sum_array(int[] a, int[] oddPrefix) {
		oddPrefix[0]=0;
		for (int i = 1; i < a.length; i++) {
			if(i%2==0) {
				oddPrefix[i]=oddPrefix[i-1];
			}
			else {
				oddPrefix[i]=oddPrefix[i-1]+a[i];
			}
		}
		return oddPrefix;
	}

	private static int[] create_even_prefix_sum_array(int[] a, int[] evenPrefix) {
		evenPrefix[0]=a[0];
		for (int i = 1; i < a.length; i++) {
			if(i%2!=0) {
				evenPrefix[i]=evenPrefix[i-1];
			}else {
			evenPrefix[i]=evenPrefix[i-1]+a[i];
			}
		}
		return evenPrefix;
	}

}
