import java.util.Scanner;
class Pattern1
{ public static void main(String args[])
{  Scanner sc = new Scanner(System.in);
  System.out.print("number of line you want: ");
  int l = sc.nextInt();
  for(int i=1; i<=l; i++)
  { for (int j=1; j<=i; j++)
	  {System.out.print(j+" ");}
  System.out.println();}
}}