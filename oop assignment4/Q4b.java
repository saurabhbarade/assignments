			// String reverse using charAt() method

class Q4b
{
	static int j;
	public static void main(String args[])
	{
		String s = "SAURABH";
		char a[] = new char[s.length()];
		for(int i=0; i<a.length; i++)
		{
			a[i]= s.charAt(i);
		}
		
		char ra[] = new char[a.length];
		for(int i=0; i<ra.length; i++)
		{	
		
			 ra[i]=a[a.length-i-1];
		}	
		for(char w : a)
		{
			System.out.print(w);
		}
	System.out.println();
	System.out.println("reverse of above string is : ");
		for(char w : ra)
		{
			System.out.print(w);
		}
	
	}
}