import java.util.*;

class BucketSort
{
	
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array->");
		int n=sc.nextInt();
		double ar[]=new double[n];
		System.out.println("Enter "+n+" elements to be sort");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextDouble();
		}
	}
}
//Not Completed