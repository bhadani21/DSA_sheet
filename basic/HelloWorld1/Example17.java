
public class Example17
{
	public static void main(String[] args)
	{
		String str = " I@am@Ruchi@Bhadani";
		String[] arrOfStr = str.split("@", 5);
		for(String a: arrOfStr)
			System.out.println(a);
				char b=a.charAt(0);
		
	}
}