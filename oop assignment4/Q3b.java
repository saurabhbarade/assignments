								// Palindrom or not
								// using split() method

import java.util.*;
class Q3b
{
	static int j;
	public static void main(String args[])
	{
		String s = "N,A,Y,A,N";
		String a[] = s.split(",");
	
	
		String ra[] = new String[a.length];
		for(int i=0; i<ra.length; i++)
		{	
		
			 ra[i]=a[a.length-i-1];
		}	
	
	 if(Arrays.equals(a,ra))
		System.out.println("the string is a palindrom");
		
		else
			System.out.println("the string is not a palindrom");
	
	
	
	}
}