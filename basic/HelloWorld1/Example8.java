import java.util.Scanner;
public class Example8
{
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("Enter a two integer");
			int a=userInput.nextInt();
			int b=userInput.nextInt();
			if(a>b)
			{
				System.out.println("invalid");
			}
			else if(a == 0 || b == 0)
			{
				System.out.println("invalid");
			}
			else
			{
				for(int i=0;i<10;i++)
				{
					a=a+b;
					b=b+10;
				}	
				System.out.println(a + b);
				
			}
	}
}	