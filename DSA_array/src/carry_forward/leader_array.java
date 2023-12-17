package carry_forward;

import java.util.ArrayList;
import java.util.List;

public class leader_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Problem Description
//		Given an integer array A containing N distinct integers, you have to find all the leaders in array A. An element is a leader if it is strictly greater than all the elements to its right side.
//
//		NOTE: The rightmost element is always a leader.
//
//
//		Problem Constraints
//		1 <= N <= 105
//		1 <= A[i] <= 108
//
//
//		Input Format
//		There is a single input argument which a integer array A
//
//
//		Output Format
//		Return an integer array denoting all the leader elements of the array.
//
//
//		Example Input
//		Input 1:
//		 A = [16, 17, 4, 3, 5, 2]
//		Input 2:
//		 A = [5, 4]
//
//
//		Example Output
//		Output 1:
//		[17, 2, 5]
//		Output 2:
//		[5, 4]
//
		
		int A[] = {16, 17, 4, 3, 5, 2};
		List<Integer> ans=new ArrayList<Integer>();
		ans=find_leader_element(A,ans);
		System.out.print("Leader element = ");
		System.out.print(ans + " ");
	

	}

	private static List<Integer> find_leader_element(int[] A ,List<Integer> ans) {
		ans.add(A[A.length-1]);
		int max=ans.get(0);
		for (int i = A.length-2; i>=0; i--) {
			if(max<A[i]) {
				ans.add(A[i]);
				max=A[i];
			}
		}
		return ans;
	}

}
