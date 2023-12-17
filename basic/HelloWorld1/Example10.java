import java.util.Scanner;
public class Example10
{
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("Enter the integer");
		int n1 = userInput.nextInt();
		int c;
		c= count(n1);
		System.out.println(c);
	}
	public static int count(int n1)
	{
		int c=0;
		while(n1!=0)
		{
			n1=n1/10;
			c++;
		}
		return c;
			
	}
	
}