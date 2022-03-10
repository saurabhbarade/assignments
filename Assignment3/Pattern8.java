import java.util.Scanner;
class Pattern8
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("how many lines you want: ");
		int l = sc.nextInt();
		
		for(int i=0; i<l; i++)
		{
			for(int j=0; j<(l-i); j++)
			{System.out.print(" ");}
			
			for(int k=(l-i); k<=l; k++)
			{System.out.print(" "+k);}
		
		 System.out.println();
		}
	}
}