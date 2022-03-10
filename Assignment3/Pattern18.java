import java.util.Scanner;
class Pattern18
{ 	
		public static void main(String args[])
		{	Scanner sc = new Scanner(System.in);
			System.out.print("how many lines do you want: ");
			char l = sc.next().charAt(0);
			
			for(int i=0; i<(l-64); i++)
			{
				for(char j='A'; j<=l-i; j++)
				{
					System.out.print(j+" ");
				}
			System.out.println();
			}
		}
}