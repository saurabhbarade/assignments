import java.util.Scanner;
class Pattern10
{
	public static void main(String args[])
	{
		System.out.print("how many lines you want: ");
		Scanner sc = new Scanner (System.in);
		char l = sc.next().charAt(0);
		char m = 'A';
	for(char i=65; i<=l; i++)
	{
		for(int j=1; j<=(l-i); j++)
		{System.out.print(" ");}
		
		for(char k=(l-i)+m; k<=l; k++)
		{System.out.print(" "+k);}
	
	System.out.println();
	    
	}
	}
}