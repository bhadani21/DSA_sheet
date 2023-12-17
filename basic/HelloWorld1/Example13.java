import java.io.*;
public class Example13
{
	public static void main(String[] args)
	{
		double ArrayDouble[]= new double[]{10.0,20.0,30.0};
		double Array2Double[]= new double[]{20.0,50.0,30.0,70.0,80.0};
		int n=Array2Double.length;
		double Array3Double[]=new double[n];
		
		for(int i=0;i<n;i++)
			{
			Array3Double[i]=ArrayDouble[i]+Array2Double[i];
			}
		for(int j=0;j<n-1;j++)
		{
			Array3Double[j]=Array3Double[i];
			System.out.println(Array3Double[j]);
		}
	}
}