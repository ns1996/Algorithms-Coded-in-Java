import java.util.*;
class SelectionSort
{
	void sort(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
				if(arr[j]<arr[min])
					min=j;
				
				int temp=arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
		}
	}
	void print(int arr[])
	{   
	    int n=arr.length;
		for(int i=0;i<n;++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	public static void main(String ar[])
	{
		
		SelectionSort ob=new SelectionSort();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=(int) (Math.random()*100);
		}
		//System.out.println("Before Sorting =>");
		for(int c=0;c<n;c++)
		{
			//System.out.print(arr[c]+" ");
		}
		System.out.println();
		System.out.println("After Sorting=>");
        long startTime = System.nanoTime();		
		ob.sort(arr);
		long endTime   = System.nanoTime();
    	long totalTime = (endTime - startTime)/1000;
		//ob.print(arr);			
		System.out.println("Total Execution Time "+totalTime);
	}
}