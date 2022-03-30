			// String reverse using split() method

class Q4
{
	static int j;
	public static void main(String args[])
	{
		String s = "S,A,U,R,A,B,H";
		String a[] = s.split(",");
		
		String ra[] = new String[a.length];
		for(int i=0; i<ra.length; i++)
		{	
		
			 ra[i]=a[a.length-i-1];
		}	
		for(String w : a)
		{
			System.out.print(" "+w);
		}
	System.out.println();
	System.out.println("reverse of above string is : ");
		for(String w : ra)
		{
			System.out.print(" "+w);
		}
	
	
	
	}
}