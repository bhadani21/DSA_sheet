package Recursion_Problems;

public class print_N_to_1 {
	
	
	private void print_1_N(int n,int idx) {
		if(idx>=n) return;
		if(idx<n) System.out.println(n);
		print_1_N(n-1, idx);
		
	}

	public static void main(String[] args) {
		print_N_to_1 pt=new print_N_to_1();
		pt.print_1_N(10,0);
	}

	

}
