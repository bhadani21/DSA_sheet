import java.util.Scanner;
public class Example16
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("Enter the digit");
		int n=sc.nextInt();
		int c=0,i;
		for(i=2;i<=n;i++)
		{
			if(n%i==0)
			{
			c++;
			}
		}
		if(c>=2)
			System.out.println("false");
		else
			System.out.println("true");
	}
	
}