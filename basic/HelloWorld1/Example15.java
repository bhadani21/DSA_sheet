import java.util.Scanner;
public class Example15
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("Enter the digit");
		int a=sc.nextInt();
		int rev=0,rem;
		while(a!=0)
		{
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		System.out.println("REVERSED: " + rev);
		
	}
	
}