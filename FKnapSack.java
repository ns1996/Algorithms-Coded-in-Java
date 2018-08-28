import java.util.*;
public class FKnapSack
    { 
	    public static float[] fknapcal(int w[],float p[],int W)
		  {
			int n=p.length;
			float x[]=new float[n];
			for(int i=0;i<n;i++)
			{
				x[i]=0;
			}
			int weight=0;
			for(int i=0;i<n;i++)
			{
				if(weight+w[i]<=W)
				{
					x[i]=1;
					weight=weight+w[i];
				}
				else
				{
					x[i]=(float)(W-weight)/w[i];
					weight=W;
					break;
				}
			}
			   return x;
		  }
	    public static void main(String args[])
		   {
		     Scanner in=new Scanner(System.in);
			 System.out.println("Enter the no of items:");
			 int n=in.nextInt();
			 int v[]=new int[n];
			 int w[]=new int[n];
			 System.out.println("Enter the value Array:");
			 for(int i=0;i<v.length;i++)
			   {
			     v[i]=in.nextInt();
			   }
			 System.out.println("Enter weight Array:");
			 for(int i=0;i<v.length;i++)
			   {
			     w[i]=in.nextInt();
			   }
			 System.out.println("Enter total capacity:");
			 int W=in.nextInt();
			 float p[]=new float[n];
			 for(int i=0;i<n;i++)
			    {
				   p[i]=(float)v[i]/w[i];
				}
				
		        SortRatio(p,v,w);
				
				float x[]=new float[n];
				for(int i=0;i<n;i++)
				{
					x=fknapcal(w,p,W);
				}
				for(int i=0;i<n;i++)
					System.out.println(x[i]);
		    }
		
      public static void SortRatio(float p[], int v[], int w[])
	  {
		  float n=p.length;
          float temp=0,flag=0;
           for(int i=0;i<n;i++)
            {
              for(int j=1;j<(n-i);j++)
               {
                 if(p[j-1]<p[j])
                   {
                     temp=p[j-1];
                     p[j-1]=p[j];
                     p[j]=temp;
					 temp=v[j-1];
                     v[j-1]=v[j];
                     v[j]=(int)temp;
					 temp=w[j-1];
                     w[j-1]=w[j];
                     w[j]=(int)temp;
            	     flag++;
                   }
               }
			   if(flag==0)
                  {
                    break;
                  }
            }
      }
	}