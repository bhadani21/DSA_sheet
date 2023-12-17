package Recursion_Problems;

import java.util.ArrayList;
import java.util.Arrays;

public class combination_sum_one_pick {
	
	
	public static void main(String[] args) {
		int arr[]= {1,1,1,2,2};
		Arrays.sort(arr);
		ArrayList<Integer> ds=new ArrayList<Integer>();
		combination_sum(0,0,ds,arr,4);
		
	}

	private static void combination_sum(int idx, int sum, ArrayList<Integer> ds, int[] arr, int target) {
		if(sum==target) { System.out.println(ds.toString());}
		for(int i=idx;i<arr.length;i++) {
			if(i!=idx && arr[i]==arr[i-1]) continue;
			if(arr[i]<=target) {
			ds.add(arr[i]);
			sum+=arr[i];
			combination_sum(i+1, sum, ds, arr, target);
			sum-=arr[i];
			ds.remove(ds.size()-1);
			}
		}
		
	}

}
