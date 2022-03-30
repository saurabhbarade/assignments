class Q6
{
	public static void main(String args[])
	{
		Table.whileTable();
	}
}
class Table
{
		static int i=1;
		static int j=1;
	
static void whileTable()
	{
		
		while(i<=30)
		{
			for(j=1; j<=10; j++)
			{System.out.println(i+" * "+j+" = "+(i*j));}
			i++;
			
		}
	}
}