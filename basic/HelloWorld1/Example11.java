import java.util.Scanner;
public class Example11
{
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args)
	{
		int n= userInput.nextInt();
		int i,j,k;
		 for (i=1;i<=n;i++)
		 {
			 for(k=n;k>=i;k--)
			 {
				  System.out.print(" ");
			}
			 for(j=0;j<=2*i-1;j++)
			 {
	
			 if(j%2==0)
				 System.out.print(i);
			 else 
				 System.out.print(" ");		 
			 }
			 System.out.print("\n");
		}
	}
}