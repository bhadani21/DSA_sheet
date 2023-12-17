package introduction_to_problem_solving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class count_factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Problem Description
//		Given an integer A, you need to find the count of it's factors.
//
//		Factor of a number is the number which divides it perfectly leaving no remainder.
//
//		Example : 1, 2, 3, 6 are factors of 6
//
//
//		Problem Constraints
//		1 <= A <= 109
//
//
//		Input Format
//		First and only argument is an integer A.
//
//
//		Output Format
//		Return the count of factors of A.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num= sc.nextInt();
		int count=count_factor(num);
		System.out.println("Count of factor "+ count);
		
	}
	
//	10= 1,2,5,10 =>10/1= 10=> 2 ,10/2==5 =2+2=>4
	
	
	private static int count_factor(int num) {
		int factorCount=0;
		for(int i =1 ; i*i<=num; i++){
	        if(num%i==0){
	        	factorCount=num/i==i?factorCount+1:factorCount+2;
	        }
	          
	        }
	 return factorCount;
	}

	

}
