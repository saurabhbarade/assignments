
// Addition of two matrices
public class Q1
{
	public static void main(String args[])
	{
	/*int d[][]= {{1,2},{3,4}};
	int e[][]= {{4,2},{7,6}};
	System.out.println("Addition of given matrices is :");
	int f[][]= { {d[0][0] + e[0][0], d[0][1]+e[0][1]},
				 {d[1][0] + e[1][0], d[1][1]+e[1][1]} };
	
	for(int i=0; i<f.length; i++)
		{
			for(int j=0; j<f.length; j++)
			{
				
				System.out.print(" "+f[i][j]);
			}
		   System.out.println();
		}*/
	
	int a[][]= {{33,24,54},{53,45,43},{67,32,34}};
	int b[][]= {{45,22,34},{73,64,54},{34,34,65}};
	int c[][]= new int[3][3];
	System.out.println("Addition of given matrices is :");

	for(int i=0; i<c.length; i++)
	{
		for(int j=0; j<c.length; j++)
		{
			c[i][j]= a[i][j]+b[i][j];
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}
	
	
	}
}