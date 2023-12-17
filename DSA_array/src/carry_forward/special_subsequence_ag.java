package carry_forward;

public class special_subsequence_ag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Problem Description
//		You have given a string A having Uppercase English letters.
//
//		You have to find how many times subsequence "AG" is there in the given string.
//
//		NOTE: Return the answer modulo 109 + 7 as the answer can be very large.
//
//
//
//		Problem Constraints
//		1 <= length(A) <= 105
//
//
//
//		Input Format
//		First and only argument is a string A.
//
//
//
//		Output Format
//		Return an integer denoting the answer.
//
//
//
//		Example Input
//		Input 1:
//
//		 A = "ABCGAG"
//		Input 2:
//
//		 A = "GAB"
//
//
//		Example Output
//		Output 1:
//
//		 3
//		Output 2:
//
//		 0
		String inp="AXAAXGXGAAX";
		char[] array=inp.toCharArray();
		int count=count_subsequence_array(array);
		System.out.println(count);

	}

//	private static int count_subsequence_array(char[] array) {
//			int count_g=0,n=array.length;
//			int subseq=0;
//			for (int i = n-1; i>=0; i--) {
//				if(array[i]=='G' )count_g++;
//				else if(array[i]=='A'&& count_g!=0) subseq+=count_g;
//			}
//			return  subseq;
//	}
	
//	pGpEusuCSWEaPOJmamlFAnIBgAJGtcJaMPFTLfUfkQKXeymydQsdWCTyEFjFgbSmknAmKYFHopWceEyCSumTyAFwhrLqQXbWnXSn
	
	private static int count_subsequence_array(char[] array) {
		int count_g=0,n=array.length;
		int subseq_xg=0;
		int subseq_axg=0;
		for (int i = n-1; i>=0; i--) {
			if(array[i]=='G' )count_g++;
			else if(array[i]=='X'&& count_g!=0) subseq_xg+=count_g;
			else if(array[i]=='A'&& subseq_xg!=0) subseq_axg+=subseq_xg;
		}
		return  subseq_axg;
}

}
