package Recursion_Problems;

import java.util.ArrayList;


public class subsequence_number {
	
	
	public static void main(String[] args) {
		int[] arr= {1,2,2,3,4};
		ArrayList<Integer> ds=new ArrayList<Integer>();
		subSequence(0,arr,ds);
	}

	private static void subSequence(int i, int[] arr, ArrayList<Integer> ds) {
		if(i==arr.length) {
			System.out.print(ds.toString());
			return;
		}
		ds.add(arr[i]);
		subSequence(i+1, arr, ds);
		ds.remove(ds.size()-1);
		subSequence(i+1, arr, ds);
	}

}
