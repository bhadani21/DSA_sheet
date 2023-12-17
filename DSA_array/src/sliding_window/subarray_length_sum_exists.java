package sliding_window;

public class subarray_length_sum_exists {

	public static void main(String[] args) {
//		Problem Description
//		Given an array A of length N. Also given are integers B and C.
//
//		Return 1 if there exists a subarray with length B having sum C and 0 otherwise
//
//
//
//		Problem Constraints
//		1 <= N <= 105
//
//		1 <= A[i] <= 104
//
//		1 <= B <= N
//
//		1 <= C <= 109
//
//
//
//		Input Format
//		First argument A is an array of integers.
//
//		The remaining arguments B and C are integers
//
//
//
//		Output Format
//		Return 1 if such a subarray exist and 0 otherwise
//
//
//		Example Input
//		Input 1:
//		A = [4, 3, 2, 6, 1]
//		B = 3
//		C = 11
//		Input 2:
//
//		A = [4, 2, 2, 5, 1]
//		B = 4
//		C = 6
//
//
//		Example Output
//		Output 1:
//		1
//		Output 2:
//
//		0
		
		
		int A[] = {4,3,2,6,1};
		int B=3;
		int C =11;
		int ans=subarray_length_sum_exists(A,B,C);
		System.out.print("subarray length sum exists ");
		System.out.print(ans + " ");

	}

	private static int subarray_length_sum_exists(int[] a, int b, int c) {
		int sum=0;
		for (int i = 0; i < b; i++) {
			sum+=a[i];
		}
		int l=1,r=b;
		while(r<a.length) {
			if(sum==c) return 1;
			sum=sum-a[l-1]+a[r];
			l++;
			r++;
		}
		return 0;
	}

}
