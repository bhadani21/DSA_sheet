package Recursion_Problems;

public class string_pallindrome {
	
	
	public static void main(String[] args) {
		String str="MADAM";
		string_pallindrome pall=new string_pallindrome();
		int n=str.length()-1;
		boolean ans=pall.pallin(str,0,n);
		System.out.println(ans);
	}

	private boolean pallin(String str, int i, int n) {
	if(i>=n/2) return true;
	if(str.charAt(i)!=str.charAt(n)) return false;
	return pallin(str, i+1, n-1);	
	}

}
