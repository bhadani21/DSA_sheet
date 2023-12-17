package Recursion_Problems;

public class print_1_to_N_backtracking {
	
	
	private void print_1_N(int n,int idx) {
		if(idx>=n) return;
		print_1_N(n-1, idx);
		System.out.println(n);
		
	}

	public static void main(String[] args) {
		print_1_to_N_backtracking pt=new print_1_to_N_backtracking();
		pt.print_1_N(10,0);
	}

	

}
