import java.util.Scanner;
class Pattern9
{
	public static void main(String args[])
	{
		System.out.print("how many lines you want: ");
		Scanner sc = new Scanner (System.in);
		char l = sc.next().charAt(0);
		
	for(char i='A'; i<=l; i++)
	{
		for(int j=1; j<=(l-i); j++)
		{System.out.print(" ");}
		
		for(char k='A'; k<=i; k++)
		{System.out.print(" "+k);}
	
	System.out.println();
	}
	}
}