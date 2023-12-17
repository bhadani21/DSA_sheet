package Recursion_Problems;

public class print_1_to_N {
	
	
	private void print_1_N(int n,int idx) {
		if(idx>=n) return;
		if(idx<n) System.out.println(idx+1);
		print_1_N(n, idx+1);
		
	}

	public static void main(String[] args) {
		print_1_to_N pt=new print_1_to_N();
		pt.print_1_N(10,0);
	}

	

}
