import java.util.*;
class Knapsack1
{
	public static void KnapSack(int [] v,int[] w,int n,int W)
	{
		int c[][]=new int[n+1][W+1];
		
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=W;j++)
			{
				if(i==0 || j==0)
				{
					c[i][j]=0;
				}
				
				else if(w[i-1]<=j)
				{
					if(v[i-1]+c[i-1][j-w[i-1]]>c[i-1][j])
					{
						c[i][j]=v[i-1]+c[i-1][j-w[i-1]];
					}
					else
					{
						c[i][j]=c[i-1][j];
					}
				}
				else
				{
				c[i][j]=c[i-1][j];
				}
			}
		}

		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=W;j++)
			{
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("The max value that can be put in knapsack capacity of "+W+" is "+c[n][W]);
	}
	
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of items");
		int n=sc.nextInt();
		System.out.println("Enter capacity of knapsack");
		int W=sc.nextInt();
		int v[]=new int[n];
		int w[]=new int[n];
		System.out.println("Enter value array");
		for(int i=0;i<n;i++)
		{
			v[i]=sc.nextInt();
		}
		System.out.println("Enter weight array");
		for(int i=0;i<n;i++)
		{
			w[i]=sc.nextInt();
		}
		
		KnapSack(v,w,n,W);
		
	}
  
	
}