package prefix_sum;

public class Product_array_puzzle {

	public static void main(String[] args) {
//		Given an array of integers A, find and return the product array of the same size where the ith element of the product array will be equal to the product of all the elements divided by the ith element of the array.
//
//				Note: It is always possible to form the product array with integer (32 bit) values. Solve it without using the division operator.
//
//
//				Input Format
//
//				The only argument given is the integer array A.
//				Output Format
//
//				Return the product array.
//				Constraints
//
//				2 <= length of the array <= 1000
//				1 <= A[i] <= 10
//				For Example
//
//				Input 1:
//				    A = [1, 2, 3, 4, 5]
//				Output 1:
//				    [120, 60, 40, 30, 24]
//
//				Input 2:
//				    A = [5, 1, 10, 1]
//				Output 2:
//				    [10, 50, 5, 50]
		
		int A[] = {1,2,3,4,5};
//		int A[] = {1, 2, 3};
		int ans[]=new int[A.length];
		ans =product_array_except_self(A,ans);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
		

	}

	private static int[] product_array_except_self(int[] a,int[] ans) {
		int prefix_arr[]=new int[a.length];
		int suffix_arr[]=new int[a.length];
		prefix_arr[0]=1;
		suffix_arr[a.length-1]=1;
		for (int i = 1; i < a.length; i++) {
			prefix_arr[i]=prefix_arr[i-1] *a[i-1];
			System.out.println(prefix_arr[i]);
		}
		for (int i = a.length-2; i >=0; i--) {
			suffix_arr[i]=suffix_arr[i+1] * a[i+1];
		}
		for (int i = 0; i < a.length; i++) {
			ans[i]=prefix_arr[i]*suffix_arr[i];
		}
	return ans;
	}

}
