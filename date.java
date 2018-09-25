import java.util.*;
class date
{
	public static void main(String ar[])
	{
		while(true)
		{
			
		Scanner sc=new Scanner(System.in);
		System.out.println("\nSelect from below option\n\n1.Execute Program\n\n2.Exit\n");
		int op=sc.nextInt();
		if(op==1)
		{
			System.out.print("\nEnter any date:-- ");
		    String str=sc.next();
		    System.out.println();
		    String arg[]=str.split("\\.");
		    int n1=Integer.parseInt(arg[0]);
		    int n2=Integer.parseInt(arg[1]);
		    int n3=Integer.parseInt(arg[2]);
		
		
			if(n2==5 || n2==7 || n2==8 || n2==10)
			{
				if(n1>31)
				{
					System.out.println("Please Enter Correct Date");
				}
				else if(n1==31)
				{
					System.out.println("Previous Date:-- "+ Integer.toString(n1-1)+"."+Integer.toString(n2)+"."+ Integer.toString(n3));
			        System.out.println("\nNext Date:-- "+1+"."+ Integer.toString(n2+1)+"."+ Integer.toString(n3));
			    }
				else if(n1==1)
				{
					if(n2==8)
					{
						System.out.println("Previous Date:-- "+31+"."+Integer.toString(n2-1)+"."+ Integer.toString(n3));
				        System.out.println("\nNext Date:-- "+ Integer.toString(n1+1)+"."+Integer.toString(n2)+"."+ Integer.toString(n3));	
					}
					else
					{
						System.out.println("Previous Date:-- "+30+"."+Integer.toString(n2-1)+"."+ Integer.toString(n3));
				        System.out.println("\nNext Date:-- "+ Integer.toString(n1+1)+"."+Integer.toString(n2)+"."+ Integer.toString(n3));	
					}
				}
				else 
				{
					System.out.println("Previous Date:-- "+ Integer.toString(n1-1)+"."+Integer.toString(n2)+"."+ Integer.toString(n3));
			        System.out.println("\nNext Date:-- "+Integer.toString(n1+1)+"."+ Integer.toString(n2)+"."+ Integer.toString(n3));
				}
			}
			else if(n2==4 || n2==6 || n2==9 || n2==11)
			{
				if(n1>31)
				{
					System.out.println("Please Enter Correct Date");
				}
				else if(n1==31)
				{
					System.out.println("Please Enter Correct Date");
				}
				else if(n1==30)
				{
					System.out.println("Previous Date:-- "+ Integer.toString(n1-1)+"."+Integer.toString(n2)+"."+ Integer.toString(n3));
			        System.out.println("\nNext Date:-- "+1+"."+ Integer.toString(n2+1)+"."+ Integer.toString(n3));
				}
				else if(n1==1)
				{
					System.out.println("Previous Date:-- "+ 31+"."+Integer.toString(n2-1)+"."+ Integer.toString(n3));
				    System.out.println("\nNext Date:-- "+ Integer.toString(n1+1)+"."+Integer.toString(n2)+"."+ Integer.toString(n3));	
				}
				else
				{
					System.out.println("Previous Date:-- "+ Integer.toString(n1-1)+"."+Integer.toString(n2)+"."+ Integer.toString(n3));
			        System.out.println("\nNext Date:-- "+Integer.toString(n1+1)+"."+ Integer.toString(n2)+"."+ Integer.toString(n3));
				}
				
			}
			else if(n2==12)
			{
				if(n1>31)
				{
					System.out.println("Please Enter Correct Date");
				}
				else if(n1==31)
				{
					System.out.println("Previous Date:-- "+ Integer.toString(n1-1)+"."+Integer.toString(n2)+"."+ Integer.toString(n3));
			        System.out.println("\nNext Date:-- "+01+"."+01+"."+ Integer.toString(n3+1));
				}
				else if(n1==1)
				{
					System.out.println("Previous Date:-- "+ 30+"."+Integer.toString(n2-1)+"."+ Integer.toString(n3));
				    System.out.println("\nNext Date:-- "+ Integer.toString(n1+1)+"."+Integer.toString(n2)+"."+ Integer.toString(n3));	
				}
				else
				{
					System.out.println("Previous Date:-- "+ Integer.toString(n1-1)+"."+Integer.toString(n2)+"."+ Integer.toString(n3));
			        System.out.println("\nNext Date:-- "+Integer.toString(n1+1)+"."+ Integer.toString(n2)+"."+ Integer.toString(n3));
				}
			}
			else if(n2==1)
			{
				if(n1>31)
				{
					System.out.println("Please Enter Correct Date");
				}
				else if(n1==31)
				{
					System.out.println("Previous Date:-- "+ Integer.toString(n1-1)+"."+Integer.toString(n2)+"."+ Integer.toString(n3));
			        System.out.println("\nNext Date:-- "+01+"."+Integer.toString(n2+1)+"."+ Integer.toString(n3));
				}
				else if(n1==1)
				{
					if(n3==1)
					{
						System.out.println("Previous Date not found");
			            System.out.println("\nNext Date:-- "+Integer.toString(n1+1)+"."+Integer.toString(n2)+"."+ Integer.toString(n3));
					}
					else
					{
						System.out.println("Previous Date:-- "+ 31+"."+12+"."+ Integer.toString(n3-1));
			            System.out.println("\nNext Date:-- "+Integer.toString(n1+1)+"."+ Integer.toString(n2)+"."+ Integer.toString(n3));
					}
				}
				else
				{
					System.out.println("Previous Date:-- "+ Integer.toString(n1-1)+"."+Integer.toString(n2)+"."+ Integer.toString(n3));
			        System.out.println("\nNext Date:-- "+Integer.toString(n1+1)+"."+ Integer.toString(n2)+"."+ Integer.toString(n3));
				}
			}	
			else if(n2==2)
			{
				
				if(n1>31)
				{
					System.out.println("Please Enter Correct Date");
				}
			    else if(n1==31)
				{
					System.out.println("Please Enter Correct Date");
				}
				else if(n1==30)
				{
					System.out.println("Please Enter Correct Date");
				}
				else if(n1==29)
				{
					if(n3%4!=0)
					{
						System.out.println("Please Enter Correct date");
					}
					else
					{
						System.out.println("Previous Date:-- "+ Integer.toString(n1-1)+"."+Integer.toString(n2)+"."+ Integer.toString(n3));
			            System.out.println("\nNext Date:-- "+01+"."+Integer.toString(n2+1)+"."+ Integer.toString(n3));
					}
				}
				else if(n1==28)
				{
					if(n3%4==0)
					{
						System.out.println("Please Enter Correct date");
					}
					else
					{
						System.out.println("Previous Date:-- "+ Integer.toString(n1-1)+"."+Integer.toString(n2)+"."+ Integer.toString(n3));
			            System.out.println("\nNext Date:-- "+01+"."+Integer.toString(n2+1)+"."+ Integer.toString(n3));
					}
				}
				else if(n1==1)
				{
					System.out.println("Previous Date:-- "+ 31+"."+Integer.toString(n2-1)+"."+ Integer.toString(n3));
				    System.out.println("\nNext Date:-- "+ Integer.toString(n1+1)+"."+Integer.toString(n2)+"."+ Integer.toString(n3));	
				}
				else
				{
					System.out.println("Previous Date:-- "+ Integer.toString(n1-1)+"."+Integer.toString(n2)+"."+ Integer.toString(n3));
			        System.out.println("\nNext Date:-- "+Integer.toString(n1+1)+"."+ Integer.toString(n2)+"."+ Integer.toString(n3));
				}
			}
			else if(n2==3)
			{
				if(n1>31)
				{
					System.out.println("Please Enter Correct Date");
				}
				else if(n1==31)
				{
					System.out.println("Previous Date:-- "+ Integer.toString(n1-1)+"."+Integer.toString(n2)+"."+ Integer.toString(n3));
			        System.out.println("\nNext Date:-- "+1+"."+ Integer.toString(n2+1)+"."+ Integer.toString(n3));
			    }
				else if(n1==1)
				{
					if(n3%4==0)
					{
						System.out.println("Previous Date:-- "+29+"."+Integer.toString(n2-1)+"."+ Integer.toString(n3));
				        System.out.println("\nNext Date:-- "+ Integer.toString(n1+1)+"."+Integer.toString(n2)+"."+ Integer.toString(n3));	
					}
					else
					{
					    System.out.println("Previous Date:-- "+28+"."+Integer.toString(n2-1)+"."+ Integer.toString(n3));
				        System.out.println("\nNext Date:-- "+ Integer.toString(n1+1)+"."+Integer.toString(n2)+"."+ Integer.toString(n3));	
					}	
				}
				else 
				{
					System.out.println("Previous Date:-- "+ Integer.toString(n1-1)+"."+Integer.toString(n2)+"."+ Integer.toString(n3));
			        System.out.println("\nNext Date:-- "+Integer.toString(n1+1)+"."+ Integer.toString(n2)+"."+ Integer.toString(n3));
				}
			}
			else if(n2>12)
			{
				System.out.println("Please Enter Correct date");
			}
		}
		else{break;}
		}
	}
}