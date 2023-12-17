package Recursion_Problems;
import java.util.*;

public class subsequence_sum_equal_k {
	
	
	private static void subsequence_sum_print(int i, int[] arr, int sum, ArrayList<Integer> ds,int k) {
		if(i==arr.length) {
			if(sum==k) {
				ds.stream().forEach(o->System.out.print(o+" "));
				System.out.println();
				return;
			}
			return;
		}
		ds.add(arr[i]);
		sum+=arr[i];
		subsequence_sum_print(i+1,arr,sum,ds,k);
		sum-=arr[i];
		ds.remove(ds.size()-1);
		subsequence_sum_print(i+1, arr,sum, ds, k);
		
	}
	
	public static void main(String[] args) {
		int arr[] = {1,4,3};
		ArrayList<Integer> ds=new ArrayList<Integer>();
		subsequence_sum_print(0,arr,0,ds,4);
	}

	// print only one subsequence whose sum is equal is equal to 4
	
	
	
//	package Recursion_Problems;
//	import java.util.*;
//
//	public class subsequence_sum_equal_k {
//		
//		
//		private static boolean subsequence_sum_print(int i, int[] arr, int sum, ArrayList<Integer> ds,int k) {
//			if(i==arr.length) {
//				if(sum==k) {
//					ds.stream().forEach(o->System.out.print(o+" "));
//					return true;
//				}
//				return false;
//			}
//			ds.add(arr[i]);
//			sum+=arr[i];
//			if(subsequence_sum_print(i+1,arr,sum,ds,k)==true) return true;;
//			sum-=arr[i];
//			ds.remove(ds.size()-1);
//			if(subsequence_sum_print(i+1, arr,sum, ds, k)==true) return true;
//			return false;
//			
//		}
//		
//		public static void main(String[] args) {
//			int arr[] = {1,4,3};
//			ArrayList<Integer> ds=new ArrayList<Integer>();
//			subsequence_sum_print(0,arr,0,ds,4);
//		}
//
//		
//
//	}


}
