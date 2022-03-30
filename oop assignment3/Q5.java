// transpose of matrix
public class Q5
{
	public static void main(String args[])
	{
		System.out.println("Transpose of 2 * 2 matrix : ");
		int a[][]={{2,4},{6,8}};
		
		
		int ta[][]= new int[2][2];
		 
		for(int i=0; i<ta.length; i++)
		{
			for(int j=0; j<ta.length; j++)
			{
				ta[i][j]=a[j][i];
				System.out.print(ta[i][j]+" ");
			}
		System.out.println();
		}
	
	
	System.out.println("Transpose of 3 * 3 matrix : ");
	  int b[][]={{5,6,8},{7,4,4},{1,3,5}};
	  int tb[][]= new int[3][3];
	  
	  for(int i=0; i<tb.length; i++)
		{
			for(int j=0; j<tb.length; j++)
			{
				tb[i][j]=b[j][i];
				System.out.print(tb[i][j]+" ");
			}
		System.out.println();
		}
	}
}