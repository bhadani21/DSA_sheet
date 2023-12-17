package Recursion_Problems;

public class factorial {



	private int findfac(int i) {
		if(i==0) return 1;
		return i*findfac(i-1);
		
	}
	
	public static void main(String[] args) {
		factorial fac=new factorial();
		System.out.println(fac.findfac(10));
		

	}
	

}
