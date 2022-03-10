import java.util.Scanner;
class Pattern16
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("how many lines do you want: ");
		int l = sc.nextInt();
	    for(int i=0; i<l; i++)
			{
				for(int j=l; j>=(l-i) ; j--)
				{System.out.print(j+" ");}
			
			System.out.println();
			}
	}
	
}