package prefix_sum;

public class Equilibrium_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Problem Description
//		You are given an array A of integers of size N.
//
//		Your task is to find the equilibrium index of the given array
//
//		The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
//
//		If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is considered as 0.
//
//		Note:
//
//		Array indexing starts from 0.
//		If there is no equilibrium index then return -1.
//		If there are more than one equilibrium indexes then return the minimum index.
//
//
//		Problem Constraints
//		1 <= N <= 105
//		-105 <= A[i] <= 105
//
//
//		Input Format
//		First arugment is an array A .
//
//
//		Output Format
//		Return the equilibrium index of the given array. If no such index is found then return -1.
//
//
//		Example Input
//		Input 1:
//		A = [-7, 1, 5, 2, -4, 3, 0]
//		Input 2:
//
//		A = [1, 2, 3]
//
//
//		Example Output
//		Output 1:
//		3
//		Output 2:
//
//		-1
//		
		int A[] = {-7, 1, 5, 2, -4, 3, 0};
//		int A[] = {1, 2, 3};
		int count=equilibrium_index(A);
		System.out.println("Equilibrium index = "+ count);
		


	}

	private static int equilibrium_index(int[] a) {
		// prefix sum with same array
		
		System.out.println(a[0]);
		for (int i = 1; i < a.length; i++) {
			a[i]= a[i-1]+a[i];
			System.out.print(a[i]+" ");
		}
		int index=-1;
		// equilibrium index uses prefix sum formula i.e sL(0,i-1)=ps(i-1) & sR(i+1,N-1)=ps(N-1)-ps(i+1-1)
		for (int i = 0; i < a.length; i++) {
			int sum_left=0,sum_right=0;
			sum_left=i==0?0:a[i-1];
			sum_right=a[a.length-1] - a[i];
			if(sum_left == sum_right) {
				index=i; 
				break;
			}
			
		}
		return index;
	}

}
