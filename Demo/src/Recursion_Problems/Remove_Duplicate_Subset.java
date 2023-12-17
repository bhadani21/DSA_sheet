package Recursion_Problems;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Duplicate_Subset {
	
	public static void main(String[] args) {
		int arr[]= {1,1,1,2,2};
//		Arrays.sort(arr);
		ArrayList<Integer> ds=new ArrayList<Integer>();
		unique_subset(0,arr,ds);
		
	}

	private static void unique_subset(int idx, int[] arr, ArrayList<Integer> ds) {
		System.out.print(ds.toString());
		for(int i=idx;i<arr.length;i++) {
			if(i!=idx && arr[i]==arr[i-1]) continue;
			ds.add(arr[i]);
			unique_subset(i+1, arr,ds);
			ds.remove(ds.size()-1);
		}
		
	}

}
