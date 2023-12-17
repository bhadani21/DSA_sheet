package Recursion_Problems;

public class fibanacci {
	
	
	
	public static void main(String[] args) {
		fibanacci fb=new fibanacci();
		System.out.println(fb.findfibanacci(5));
		
	}

	private int findfibanacci(int i) {
		if(i<=1) return i;
		return findfibanacci(i-1)+findfibanacci(i-2);
	}

}
