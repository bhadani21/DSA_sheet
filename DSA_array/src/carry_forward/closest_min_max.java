package carry_forward;


public class closest_min_max {

	public static void main(String[] args) {
	
//		Problem Description
//		Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array
//
//		and at least one occurrence of the minimum value of the array.
//
//
//
//		Problem Constraints
//		1 <= |A| <= 2000
//
//
//
//		Input Format
//		First and only argument is vector A
//
//
//
//		Output Format
//		Return the length of the smallest subarray which has at least one occurrence of minimum and maximum element of the array
//
//
//
//		Example Input
//		Input 1:
//
//		A = [1, 3, 2]
//		Input 2:
//
//		A = [2, 6, 1, 6, 9]
//
//
//		Example Output
//		Output 1:
//
//		 2
//		Output 2:
//
//		 3
		
		int A[] = {16, 17, 4, 3, 5, 2};
		int count=smallest_len_minmax_subarray(A);
		System.out.println(count);

	}

	private static int smallest_len_minmax_subarray(int[] a) {
		int max=findMaxelement(a);
		int min=findMinelement(a);
		System.out.println(max+" "+min);
		int max_ind=-1,min_ind=-1,count=a.length;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==min) {
				if(max_ind!=-1) {
					count=Math.min(count, i-max_ind+1);
				}
			min_ind=i;
			}
			else if(a[i]==max) {
				if(min_ind!=-1) {
					count=Math.min(count, i-min_ind+1);
				}
			max_ind=i;
			}
		}
		return count;
		
	}

	private static int findMaxelement(int[] a) {
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max)
				max=a[i];
		}
		return max;
	}

	private static int findMinelement(int[] a) {
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if(a[i]<min)
				min=a[i];
		}
		return min;
	}

}
