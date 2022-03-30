class Q3
{
	public static void main(String args[])
	{
	int x[][]= {{332,243,544},{535,475,438},{647,323,354}};
	int y[][]= {{455,226,345},{735,644,584},{345,364,665}};
	int z[][]= new int[3][3];
	System.out.println("Substraction of two  matrices is :");

	for(int i=0; i<z.length; i++)
	{
		for(int j=0; j<z.length; j++)
		{
			z[i][j]= x[i][j]-y[i][j];
			System.out.print(z[i][j]+" ");
		}
		System.out.println();
	}
	}
	
}