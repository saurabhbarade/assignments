import java.util.Scanner;
class Pattern11
{
	public static void main(String args[])
	{
		System.out.print("how many lines you want: ");
		Scanner sc = new Scanner (System.in);
		int l = sc.nextInt();
		
	for(int i=1; i<=l; i++)
	{
		for(int j=1; j<=(l-i); j++)
		{System.out.print(" ");}
		
		for(int k=1; k<=i; k++)
		{System.out.print(" *");}
	
	System.out.println();
	}
	}
}