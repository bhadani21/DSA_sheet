package Recursion_Problems;

import java.util.ArrayList;

public class subsequence_count {

	
	private int subseqCount(int i, int[] arr, int sum,int k) {
		if(arr.length==i) {
			if(sum==k) {
				return 1;
			}
			return 0;
		}
		sum+=arr[i];
		int left=subseqCount(i+1, arr, sum, k);
		sum-=arr[i];
		int right=subseqCount(i+1, arr, sum, k);
		return left+right;
	}
	
	public static void main(String[] args) {
		int arr[]= {2,5,3,5};
		subsequence_count sc=new subsequence_count();
		ArrayList<Integer> ds=new ArrayList<Integer>();
		System.out.println(sc.subseqCount(0,arr,0,5));
	}

	
}
