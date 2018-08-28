import java.util.*;
class Strassen
{   
    public  static int[][] multiply(int a[][],int b[][])
    {
		int n=a.length;
		int ans[][]=new int[n][n];
		if(n==1)
		{
			ans[0][0]=a[0][0]*b[0][0];
		}
		else{
			int a11[][]=new int[n/2][n/2];
		    int a12[][]=new int[n/2][n/2];
			int a21[][]=new int[n/2][n/2];
		    int a22[][]=new int[n/2][n/2];
			int b11[][]=new int[n/2][n/2];
		    int b12[][]=new int[n/2][n/2];
			int b21[][]=new int[n/2][n/2];
		    int b22[][]=new int[n/2][n/2];
			
			//dividing subMatrices a
			divideAr(a,a11,0,0);
			divideAr(a,a12,0,n/2);
			divideAr(a,a21,n/2,0);
			divideAr(a,a22,n/2,n/2);
			divideAr(b,b11,0,0);
			divideAr(b,b12,0,n/2);
			divideAr(b,b21,n/2,0);
			divideAr(b,b22,n/2,n/2);			
			
		
		    int s1[][]=sub(b12,b22);
			int s2[][]=add(a11,a12);
			int s3[][]=add(a21,a22);
			int s4[][]=sub(b21,b11);
			int s5[][]=add(a11,a22);
			int s6[][]=add(b11,b22);
			int s7[][]=sub(a12,a22);
			int s8[][]=add(b21,b22);
			int s9[][]=sub(a11,a21);
			int s10[][]=add(b11,b12);
			
			int p1[][]=multiply(a11,s1);
			int p2[][]=multiply(s2,b22);
			int p3[][]=multiply(s3,b11);
			int p4[][]=multiply(a22,s4);
			int p5[][]=multiply(s5,s6);
			int p6[][]=multiply(s7,s8);
			int p7[][]=multiply(s9,s10);
			
			int c11[][]=sub(add(p5,p4),sub(p2,p6));
			int c12[][]=add(p1,p2);
			int c21[][]=add(p3,p4);
			int c22[][]=sub(add(p1,p5),add(p3,p7));
			
			//combining values
            combineAr(c11,ans,0,0);
            combineAr(c12,ans,0,n/2);
            combineAr(c21,ans,n/2,0);
            combineAr(c22,ans,n/2,n/2);			
			
		    }
			
			return ans;
			
	}
	
	  public static int[][] add(int a[][],int b[][])
	  {
		  int n=a.length;
		  int c[][]=new int[n][n];
		  for(int i=0;i<n;i++)
			  for(int j=0;j<n;j++)
				  c[i][j]=a[i][j]+b[i][j];
			  return c;
      }
      public static int[][] sub(int a[][],int b[][])
      {
		  int n=a.length;
		  int c[][]=new int[n][n];
		  for(int i=0;i<n;i++)
			  for(int j=0;j<n;j++)
				  c[i][j]=a[i][j]-b[i][j];
			  return c;
	  }	  
	  public static void divideAr(int x[][],int y[][],int bi,int bj)
	  {
		  for(int i1=0,i2=bi;i1<y.length;i1++,i2++)
			  for(int j1=0,j2=bj;j1<y.length;j1++,j2++)
				  y[i1][j1]=x[i2][j2];
	  }
	  public static void combineAr(int y[][],int x[][],int bi,int bj)
	  {
		  for(int i1=0,i2=bi;i1<y.length;i1++,i2++)
			  for(int j1=0,j2=bj;j1<y.length;j1++,j2++)
				  x[i2][j2]=y[i1][j1];
	  }
	  
	  
	  public static void main(String ar[])
	  {
		  Scanner sc=new Scanner(System.in);
		  Strassen sob=new Strassen();
		  System.out.println("Enter order");
		  int n=sc.nextInt();
		  int A[][]=new int[n][n];
		  int B[][]=new int[n][n];
		  System.out.println("Enetr 1 st matrix's "+n*n+" elements");
		  for(int i=0;i<n;i++)
			  for(int j=0;j<n;j++)
                 A[i][j]=sc.nextInt();
		  System.out.println("Enetr 2 nd matrix's "+n*n+" elements");
		  for(int i=0;i<n;i++)
			  for(int j=0;j<n;j++)
				  B[i][j]=sc.nextInt();
                 
			 
		int c[][]=new int[n][n];
		c=sob.multiply(A,B);
		System.out.println();  
		for(int i=0; i<n; i++)  
		{   
	       for(int j=0; j<n; j++)
		   {    
	           System.out.print(c[i][j] + "\t");   
		   }   System.out.println();  
		}  
		System.out.println(); 
			 
         			 
	  }
}