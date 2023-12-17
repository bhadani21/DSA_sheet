package carry_forward;


public class Buy_and_sale_stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Problem Description
//		Say you have an array, A, for which the ith element is the price of a given stock on day i.
//		If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
//
//		Return the maximum possible profit.
//
//
//
//		Problem Constraints
//		0 <= A.size() <= 700000
//		1 <= A[i] <= 107
//
//
//
//		Input Format
//		The first and the only argument is an array of integers, A.
//
//
//		Output Format
//		Return an integer, representing the maximum possible profit.
//
//
//		Example Input
//		Input 1:
//		A = [1, 2]
//		Input 2:
//
//		A = [1, 4, 5, 2, 4]
//
//
//		Example Output
//		Output 1:
//		1
//		Output 2:
//
//		4
		

		int A[] = {4, 4, 5, 2, 1};
		int max_profit=buy_sale_stock(A);
		System.out.print(max_profit);

	}

	private static int buy_sale_stock(int[] a) {
		// TODO Auto-generated method stub
		int max=Integer.MIN_VALUE;
		int max_profit=0;
		for (int i = a.length-1; i >=0 ; i--) {
			if(max<a[i]) max=a[i];
			else if(max>a[i]) {
				max_profit=Math.max(max_profit, max-a[i]);
			}
		}
		return max_profit;
	}

}
