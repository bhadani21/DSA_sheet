import java.util.Scanner;
public class Example9
{
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args)
	{
		//static Scanner userInput = new Scanner(System.in);
		System.out.print("Enter integer" );
			int a = userInput.nextInt();
			int b = userInput.nextInt();
			int c = userInput.nextInt();
			if(a != b && b != c && c != a)
			{
				System.out.println("0");
			}
		    if(a == b && b == c && c == a)
			{
				System.out.println("20");
			}
			if((a == b && b != c && c != a) ||(b == c && c != a && b !=a )||(c == a && b != a &&  c != b ))
			{
				System.out.println("10"); 
			}	
			
	}
}