package introduction_to_problem_solving;

import java.util.Scanner;

public class perfect_number {

	public static void main(String[] args) {
//		Problem Description
//		You are given an integer A. You have to tell whether it is a perfect number or not.
//
//		Perfect number is a positive integer which is equal to the sum of its proper positive divisors.
//
//		A proper divisor of a natural number is the divisor that is strictly less than the number.
//
//
//
//		Problem Constraints
//		1 <= A <= 106
//
//
//
//		Input Format
//		First and only argument contains a single positive integer A.
//
//
//
//		Output Format
//		Return 1 if A is a perfect number and 0 otherwise.
//
//
//
//		Example Input
//		Input 1:
//
//		A = 4
//		Input 2:
//
//		A = 6
//
//
//		Example Output
//		Output 1:
//
//		0 
//		Output 2:
//
//		1 
//
//
//		Example Explanation
//		Explanation 1:
//
//		For A = 4, the sum of its proper divisors = 1 + 2 = 3, is not equal to 4.
//		Explanation 2:
//
//		For A = 6, the sum of its proper divisors = 1 + 2 + 3 = 6, is equal to 6. 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num= sc.nextInt();
		int isPerfectNumber=isPerfectNumber(num);
		System.out.println("is "+num +" isPerfectNumber?\n"+ isPerfectNumber);

	}

	private static int isPerfectNumber(int num) {
//		for(int i=1; i*i<=A;i++){
//            if(A%i==0){
//                if(A/i==i){
//                    sumFactors = sumFactors + i;
//                }else{
//                    sumFactors = sumFactors + i + A/i;
//                }
//            }
//        }
		// perfect square is not perfect number
		if(num==1) return 0;
		int sum=1;
		for(int i=2;i*i<num;i++) {
			if(num%i==0) {
				sum+=i+num/i;
			}
		}
		if(sum==num)return 1;
		return 0;
	}

}
