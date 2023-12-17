package Recursion_Problems;

import java.util.ArrayList;

public class combination_sum_multiple_pick {


	public static void main(String[] args) {
		int arr[]= {2,3,6,7};
		ArrayList<Integer> ds=new ArrayList<Integer>();
		combination_sum(0,0,arr,7,ds);
		
	}

	private static void combination_sum(int i, int sum, int[] arr, int target,ArrayList<Integer> ds) {
		
		if(sum>target) return;
		if(i==arr.length) {
		if(sum==target) {
			System.out.println(ds.toString());
			return;
		}
		return;
		}
		if(arr[i]<=target) {
		sum+=arr[i];
		ds.add(arr[i]);
		combination_sum(i, sum, arr, target, ds);
		sum-=arr[i];
		ds.remove(ds.size()-1);
		}
		combination_sum(i+1, sum, arr, target, ds);
	}
}
