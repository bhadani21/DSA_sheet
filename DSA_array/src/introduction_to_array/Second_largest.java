package introduction_to_array;

public class Second_largest {

	public static void main(String[] args) {
		
		
		int arr[]= {2};
		int largest= largest_element(arr, -1);
		int sec_largest = largest_element(arr,largest);
		System.out.println(sec_largest);
	}

	

	private static int largest_element(int[] arr,int current_max) {
		int largest =-1;
		for (int i = 0; i < arr.length; i++) {
				if(arr[i] > largest && current_max != arr[i]  ) 
					largest=arr[i];	
		}
	return largest;
	}

}
