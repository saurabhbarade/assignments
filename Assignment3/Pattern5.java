import java.util.Scanner;
class Pattern5
{ 
	public static void main(String args[])
	{  
		Scanner sc = new Scanner(System.in);
		System.out.print("number of line you want: ");
		char l = sc.next().charAt(0);
  for(char i='A'; i<=l; i++)
  {
	  for (char j='A'; j<=i; j++)
	  {
		  System.out.print(i+" ");
	  }
  
   System.out.println();
  }
}
}