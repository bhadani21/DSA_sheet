package demo;

public class Reverse_string {
	
	public static void main(String[] args) {
		
		String s="welcome to mbrdi";
		int n=s.length();
		char[] arr=s.toCharArray();
		reverse(arr,0,n-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

	}

	private static void reverse(char[] arr, int start, int end) {
		
		if(start>=end) {
			return;
		}
		char ch=arr[start];
		arr[start]=arr[end];
		arr[end]=ch;
		start++;
		end--;
		reverse(arr, start, end);
	}
	

}
