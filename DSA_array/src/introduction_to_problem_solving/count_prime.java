package introduction_to_problem_solving;

import java.util.Scanner;

public class count_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Problem Description
//		You will be given an integer n. You need to return the count of prime numbers less than or equal to n.
//
//
//		Problem Constraints
//		0 <= n <= 10^3
//
//
//		Input Format
//		Single input parameter n in function.
//
//
//		Output Format
//		Return the count of prime numbers less than or equal to n.
//
//
//		Example Input
//		Input 1:
//		19
//		Input 2:
//		1
//
//
//		Example Output
//		Output 1:
//		8
//		Output 2:
//		0

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num= sc.nextInt();
		int count=count_prime(num);
		System.out.println("Count of prime number="+ count);

	}

	private static int count_prime(int num) {
		int count=0;
		for(int i=2;i<=num;i++) {
			if(isPrime(i)) {
				count++;
			}
		}
		return count;
	}

	private static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		for(int i=2;i*i<=num;i++) {
			if(num%i==0) return false;
		}
		return true;
	}

}
