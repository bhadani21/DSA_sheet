package introduction_to_problem_solving;

import java.util.Scanner;

public class square_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Problem Description
//
//		Given a number A. Return square root of the number if it is perfect square otherwise return -1.
//
//		Note: A number is a perfect square if its square root is an integer.
//
//		Problem Constraints
//
//		1 <= A <= 108
//		Input Format
//
//		First and the only argument is an integer A.
//		Output Format
//
//		Return an integer which is the square root of A if A is perfect square otherwise return -1.
//		Example Input
//
//		Input 1:
//		A = 4
//		Input 2:
//
//		A = 1001
//		Example Output
//
//		Output 1:
//		2
//		Output 2:
//
//		-1
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num= sc.nextInt();
		int sqrt_number= square_root(num);
		System.out.println("perfect square of "+num+"="+ sqrt_number);
		
	}

	private static int square_root(int num) {
		// TODO Auto-generated method stub
		
		for(int i=1;i*i<=num;i++) {
			if(i*i==num) return i;
		}
		return -1;
	}

}
