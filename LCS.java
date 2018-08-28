import java.util.*;

class LCS  
{
	public static void main(String ar[])
	{   
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of first sequence");
		int n1=sc.nextInt();
		char[] input1=new char[n1];
		System.out.println("Enter Characters of first sequence");
		for(int i=0;i<n1;i++)
		{
			input1[i]=sc.next().charAt(0);
		}
		System.out.println("Enter size of second sequence");
		int n2=sc.nextInt();
		char[] input2=new char[n2];
		System.out.println("Enter Characters of second sequence");
		for(int i=0;i<n2;i++)
		{
			input2[i]=sc.next().charAt(0);
		}
		char[][] b=new char[n1+1][n2+1];
		int[][] c=new int[n1+1][n2+1];
		for(int i=0;i<=n1;i++)
		{
			c[i][0]=0;
		    b[i][0]='0';
		}
		for(int j=0;j<=n2;j++)
		{
			c[0][j]=0;
		    b[0][j]='0';
		}
		for(int i=1;i<=n1;i++)
		{
			for(int j=1;j<=n2;j++)
			{
				if(input1[i-1]==input2[j-1])
				{
					c[i][j]=c[i-1][j-1]+1;
					b[i][j]='\\';
				}
				else if(c[i-1][j]>=c[i][j-1])
				{
					c[i][j]=c[i-1][j];
					b[i][j]='|';
				}
				else if(c[i][j-1]>=c[i-1][j])
				{
					c[i][j]=c[i][j-1];
					b[i][j]='-';
				}
			}
		}
		System.out.println();
		System.out.println("Matrix for calculating size of LCS ==> ");
		for(int i=0;i<=n1;i++)
		{
			for(int j=0;j<=n2;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Path Matrix for calculating LCS ==> ");
		for(int i=0;i<=n1;i++)
		{
			for(int j=0;j<=n2;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
        	System.out.println();
		System.out.print("Longest Common SubSequence is---> ");
      new LCS().printLcs(b,input1,n1,n2);		
	}
	
	public void printLcs(char[][] b,char[] input1,int i,int j)
	{
		if(i==0 || j==0)
		{
			return;
		}
		if(b[i][j]=='\\')
		{
			printLcs(b,input1,i-1,j-1);
			System.out.print(input1[i-1]+" ");
		}
		else if(b[i][j]=='|')
		{
			printLcs(b,input1,i-1,j);
		}
		else 
			printLcs(b,input1,i,j-1);
	}
}











