import java.util.*;
class CountingSort
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array->");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter the elements of array->");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.print("Before Sorting --> ");
		for(int i=0;i<n;i++)
		{
			System.out.print(ar[i]+" ");
		}
		  //Finding Maximum in Array
		    int t=ar[0];
    		for(int i=1;i<n;i++)
    		{
    			if(t<ar[i])
    				t=ar[i];
    		}
        int c[]=new int[t+1];
		int b[]=new int[n];
       		
		for(int j=0;j<n;j++)
		{
			c[ar[j]]=c[ar[j]]+1;
		}
		for(int i=1;i<=t;i++)
		{
			c[i]=c[i]+c[i-1];
		}
		for(int j=0;j<n;j++)
		{
			b[c[ar[j]]-1]=ar[j];
			c[ar[j]]=c[ar[j]]-1;
		}
		System.out.println();
		System.out.print("After Sorting --> ");
		for(int i=0;i<n;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
}