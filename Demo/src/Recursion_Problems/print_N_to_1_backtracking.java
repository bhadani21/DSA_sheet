package Recursion_Problems;

public class print_N_to_1_backtracking {
	
	
	private void print_N_1(int n,int idx) {
		if(idx>=n) return;
		print_N_1(n, idx+1);
		System.out.println(idx+1);
		
	}

	public static void main(String[] args) {
		print_N_to_1_backtracking pt=new print_N_to_1_backtracking();
		pt.print_N_1(10,0);
	}

	

}
