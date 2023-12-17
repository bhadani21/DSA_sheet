package introduction_to_problem_solving;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
//		Problem Description
//		Given a number A. Return 1 if A is prime and return 0 if not. 
//
//		Note : 
//		The value of A can cross the range of Integer.
//
//
//		Problem Constraints
//		1 <= A <= 109
//
//
//		Input Format
//		The first argument is a single integer A.
//
//
//		Output Format
//		Return 1 if A is prime else return 0.
//
//
//		Example Input
//		Input 1:
//		A = 5
//		Input 2:
//
//		A = 10
//
//
//		Example Output
//		Output 1:
//		1
//		Output 2:
//
//		0

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num= sc.nextInt();
		boolean isPrime=isPrime(num);
		System.out.println("is "+num +" isPrime?\n"+ isPrime);
		
		
		
	}

	// prime number=if number divide 1 or itself
	private static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		if(num==1) return false;
		for(int i=2;i*i<=num;i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}

}
