import java.util.Scanner;
class Pattern2
{ 
	public static void main(String args[])
	{  
		Scanner sc = new Scanner(System.in);
		System.out.print("number of line you want: ");
		char l = sc.next().charAt(0);
  for(int i=65; i<=l; i++)
  {
	  for (char j=65; j<=i; j++)
	  {
		  System.out.print(j+" ");
	  }
  
   System.out.println();
  }
}
}