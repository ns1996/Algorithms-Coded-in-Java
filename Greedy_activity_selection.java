import java.util.*;
public class Greedy_activity_selection 
{
	static int solve(int ar[][])
	{
		int max=1,lb=ar[0][1];
        for(int i=1;i<ar.length;i++)
		{
			if(lb<ar[i][0])
			{
				max++;lb=ar[i][1];
			} 
		}
        return max;
    }
 public static void main(String args[])
 {
	 System.out.println("Enter No of Activities ");
	 Scanner in=new Scanner(System.in);
     int n=in.nextInt(); int arr[][]=new int[n][2];
     System.out.println("Enter activities lower and upper bound respectively\n");
     for(int i=0;i<n;i++)
	 {
		 arr[i][0]=in.nextInt();
		 arr[i][1]=in.nextInt();
	 }
   System.out.println("We can select maximum "+solve(arr)+" activities"); }}