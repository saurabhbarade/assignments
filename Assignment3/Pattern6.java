import java.util.Scanner;
class Pattern6
{ 
	public static void main(String args[])
	{  
		Scanner sc = new Scanner(System.in);
		System.out.print("number of line you want: ");
		int l = sc.nextInt();
  for(int i=1; i<=l; i++)
  {
	  for (int j=1; j<=(l-i); j++)
	  {
		  System.out.print(" ");
	  }
	  for (int k=1; k<=i; k++)
      {
		  System.out.print("*");
	  }
   System.out.println();
  }
}
}