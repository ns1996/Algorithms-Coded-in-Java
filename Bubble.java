import java.util.*;
class Bubble
{
	public static void main(String ar[])
	{
		int n,c,d,swap;
		Scanner in=new Scanner(System.in);
		Random r=new Random();
		System.out.println("Input no.of integers to sort");
		n=in.nextInt();
		int array[]=new int[n];
		System.out.println("Unsorted Array:");
		for(int i=0;i<n;i++){
		array[i]=r.nextInt(n)+1;
		
	//System.out.println(array[i]+" ");
	}
	long startTime = System.nanoTime();
			for(c=0;c<(n-1);c++)
			{
				int flag=0;
				for(d=0;d<n-c-1;d++)
				{
					if(array[d]>array[d+1])
					{
						swap=array[d];
						array[d]=array[d+1];
						array[d+1]=swap;
						flag+=1;
					}
				}
				if(flag==0)
				{
					break;
				}
			}
			long endTime   = System.nanoTime();
    		long totalTime = (endTime - startTime)/1000;
			System.out.println("Sorted list of numbers");
		for(c=0;c<n;c++){
		//System.out.println(array[c]);
		}
		System.out.println("Total Execution Time "+totalTime);
	}
}