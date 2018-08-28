import java.util.*;
class MaxSubArray
{
	public static SubArray maxSubArray(int[] arr,int low,int high)
	{
		if (high==low)
		{
			return new SubArray(low,high,arr[low]);
		}
		else
		{
			int mid=(int) (low+high)/2;
			SubArray leftSubArray=maxSubArray(arr,low,mid);
			SubArray rightSubArray=maxSubArray(arr,mid+1,high);
			SubArray crossSubArray=maxCrossSubArray(arr,low,mid,high);
            if(leftSubArray.getSum()>=rightSubArray.getSum() && leftSubArray.getSum()>=crossSubArray.getSum())
				return leftSubArray;
            if(rightSubArray.getSum()>=leftSubArray.getSum() && rightSubArray.getSum()>=crossSubArray.getSum())		  
				return rightSubArray;
		    else
				return crossSubArray;
			
		}
	}
	public static SubArray maxCrossSubArray(int[] arr,int low,int mid,int high)
	{
		int leftSum=Integer.MIN_VALUE;
		int sum=0;
		int maxLeft=low;
		int maxRight=high;
		for(int i=mid;i>=low;i--)
		{
		    sum=sum+arr[i];
		    if(sum>leftSum)
            {
				leftSum=sum;
				maxLeft=i;
		    } 
		}
		int rightSum=Integer.MIN_VALUE;
		sum=0;
		for(int j=mid+1;j<=high;j++)
		{
			sum=sum+arr[j];
			if(sum>rightSum)
			{
				rightSum=sum;
			    maxRight=j;
			}
		}
		return new SubArray(maxLeft,maxRight,(leftSum+rightSum));
	}
	
	static class SubArray
	{
	   int start;
       int end;
	   int sum;
	   SubArray(){}
	   public SubArray(int start,int end,int sum)
	   {
		   super();
		   this.start=start;
		   this.end=end;
		   this.sum=sum;
	   }
	   public int getStart(){ return start; }
	   public void setStart(int start){ this.start=start; } 
	   public int getEnd(){ return end; }
	   public void setEnd(int end){ this.end=end; }
	   public int getSum(){ return sum; }
	   public void setSum(int sum){ this.sum=sum; }
	   
	   public String toString()
	   {
		   return "SubArray [Start=" +start+ ",end=" +end+ ",Sum=" +sum+ "]" ;
	   }
      /*  void print()
		{
			int ar[]=new int[(start-end)+1];
		   for(int i=start;i<=end;i++)
		   System.out.print(ar[i]+" ");
		}		
		*/   
	}
	
	
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Array");
	   	  int n=sc.nextInt();
    	 
    	  int arr[]=new int[n];
    	  
    	  System.out.println("Enter the array elements");
    	  
    	  
    	  for(int i=0;i<n;i++)
    	  {
    	  	arr[i]=sc.nextInt();
    	  }
		  System.out.println("Maximum SubArray for array "+ Arrays.toString(arr)+": "+ maxSubArray(arr,0,n-1));
		  //SubArray ob=new SubArray();
          //ob.print();
	}
}