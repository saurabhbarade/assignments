class Table
{
	static int i;
	static int j;
	
	static void Table(){
		for(i=1; i<=30; i++)
		{
			for(j=1; j<=10; j++)
			{	
				System.out.println(i+" * "+j+" = "+(i*j));
			}
			
			System.out.print("");
			
	}}
	
}
public class Q5
{
	public static void main(String args[])
	{
		Table.Table();
	}
} 