class Q4
{
	public static void main(String args[])
	{
		System.out.println("Tables from 1 to 30 using 2-d array!!");
		
	int a[][] = new int [30][10];
	for(int i=0; i<a.length; i++)
	{
		for(int j=0; j<10; j++)
		{
			a[i][j]= (i+1)*(j+1);
			System.out.print((i+1)+"*"+(j+1)+" = "+a[i][j]+"  ");
		}
	System.out.println();
	System.out.println();
	}
	
}}