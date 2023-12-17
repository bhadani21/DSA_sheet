import java.util.Arrays;
public class Example12
{
	public static void main(String[] args)
	{
		int ArrayInt[]= new int[]{1,2,3,4,5};
		int Res=0;
		for(int i=0;i<ArrayInt.length;i++)
		{
			Res=Res+ArrayInt[i];
		}
		System.out.println("SUM OF ELEMENT "+Res);
	}
}