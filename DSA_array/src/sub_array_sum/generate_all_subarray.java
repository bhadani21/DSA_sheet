package sub_array_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class generate_all_subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Problem Description
//		You are given an array A of N integers.
//		Return a 2D array consisting of all the subarrays of the array
//
//		Note : The order of the subarrays in the resulting 2D array does not matter.
//
//
//		Problem Constraints
//		1 <= N <= 100
//		1 <= A[i] <= 105
//
//
//		Input Format
//		First argument A is an array of integers.
//
//
//		Output Format
//		Return a 2D array of integers in any order.
//
//
//		Example Input
//		Input 1:
//		A = [1, 2, 3]
//		Input 2:
//		A = [5, 2, 1, 4]
//
//
//		Example Output
//		Output 1:
//		[[1], [1, 2], [1, 2, 3], [2], [2, 3], [3]]
//		Output 2:
//		[[1 ], [1 4 ], [2 ], [2 1 ], [2 1 4 ], [4 ], [5 ], [5 2 ], [5 2 1 ], [5 2 1 4 ] ]
		
		List<Integer> list = new ArrayList<>(Arrays.asList(5,2,1,4));
		List<ArrayList<Integer>> list_data = new ArrayList<>();
		list_data=generate_sub_array(list);
		System.out.print("Generated Sub array = ");
		System.out.print(list_data+ " ");

	}

	private static List<ArrayList<Integer>> generate_sub_array(List<Integer> list) {
		// TODO Auto-generated method stub
		List<ArrayList<Integer>> list_data = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list_data_info;
		for (int i = 0; i < list.size(); i++) {
			for (int j = i; j < list.size(); j++) {
				list_data_info = new ArrayList<Integer>();
				for (int j2 = i; j2 <=j; j2++) {
					list_data_info.add(list.get(j2));
				}
				list_data.add(list_data_info);
				
			}
		}
		return list_data;
	}

}
