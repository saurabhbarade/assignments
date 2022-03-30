import java.util.*;
class Q8
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of lines: ");
		int n = sc.nextInt();
	// for k pattern	
		for(int i=1; i<=n/2; i++)
		{
			System.out.print("*");
			for(int j=i; j< n/2; j++)
			{
				System.out.print("  ");
			}
		System.out.println("*");
		}
	
	for(int i=1; i<=n/2; i++)
		{
			System.out.print("*");
			for(int j=1; j<i; j++)
			{
				System.out.print("  ");
			}
		System.out.println("*");
		}
		System.out.println();
	// for X pattern
	 for(int i=1; i<=n; i++)
		  {
			  for(int j=1; j<=n; j++)
			  {
				  if(i==j||j==n-i+1)
					  System.out.print("*");
				  else
					  System.out.print(" ");
			  }
		  System.out.println();
		  }
		  System.out.println();
	// for Right angled triangle pattern
	  for(int i=1; i<=n; i++)
  {
	  for (int j=1; j<=i; j++)
	  {
		  System.out.print(" *");
	  }
  
   System.out.println();
  }
  System.out.println();
  // for equilateral triangle
  for(int i=1; i<=n; i++)
	{
		for(int j=1; j<=(n-i); j++)
		{System.out.print(" ");}
		
		for(int k=1; k<=i; k++)
		{System.out.print(" *");}
	
	System.out.println();
	}
	}
}
