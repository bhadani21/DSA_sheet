package introduction_to_array;

public class Good_pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		
//		Q2. Good Pair
//		Solved
//		feature icon
//		Using hints is now penalty free
//		Use Hint
//		Problem Description
//		Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.
//
//
//
//		Problem Constraints
//		1 <= A.size() <= 104
//
//		1 <= A[i] <= 109
//
//		1 <= B <= 109
//
//
//
//		Input Format
//		First argument is an integer array A.
//
//		Second argument is an integer B.
//
//
//
//		Output Format
//		Return 1 if good pair exist otherwise return 0.
//
//
//
//		Example Input
//		Input 1:
//
//		A = [1,2,3,4]
//		B = 7
//		Input 2:
//
//		A = [1,2,4]
//		B = 4
//		Input 3:
//
//		A = [1,2,2]
//		B = 4
//
//
//		Example Output
//		Output 1:
//
//		1
//		Output 2:
//
//		0
//		Output 3:
//
//		1
		
		int arr[]= {2,2,1};
		int sum=10;
		int count=Is_Pair_Sum_Exists(arr,sum);
		System.out.println("is pair exists= "+ count);

	}

	// j< i because need to take pair sum so 0 and 1 or 1 and 0 both pair sum is same 
	
	private static int Is_Pair_Sum_Exists(int[] arr, int sum) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]+arr[j]== sum) {
					return 1;
				}
			}
		}
		return 0;
		
	}

}
