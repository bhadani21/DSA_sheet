package Recursion_Problems;

public class first_N_sum {
	
	//parameterised recursion
//	private int first_n_sum(int idx,int sum) {
//		if(idx<1) return sum;
//		return first_n_sum(idx-1,sum+idx);
//		
//	}

	public static void main(String[] args) {
		first_N_sum pt=new first_N_sum();
		//System.out.println(pt.first_n_sum(10,0));
		System.out.println(pt.first_n_sum(10));
	}

	
	
	//functional recursion
	

	private int first_n_sum(int i) {
		if(i==0) return 0;
		return i+first_n_sum(i-1);
		
	}
	

}
