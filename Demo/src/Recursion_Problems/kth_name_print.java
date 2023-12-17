package Recursion_Problems;

public class kth_name_print {
	
	
	public void print_name(String name,int k,int idx) {
		//base case
		if(idx>=k) return;
		if(idx<k) System.out.println(idx+1+"="+name);
		print_name(name, k,idx+1);	
	}

	public static void main(String[] args) {
		kth_name_print kt=new kth_name_print();
		kt.print_name("Ruchi",5,0);
	}

}
