import java.util.Scanner;
public class Example14
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("enter three number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		getmax(a,b,c);
	}
		
		public static void getmax(int a,int b,int c)
		{
		if(a>b && a>c)
			System.out.println("Maximum: " + a);
		if(b>c && b>a)
			System.out.println("Maximum:" + b);
		if(c>a && c>b)
			System.out.println("Maximum: " + c);
		}

	
}