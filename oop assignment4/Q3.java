								// Palindrome or not
								// using charAt() method 

import java.util.*;
class Q3
{
	static int j;
	public static void main(String args[])
	{
		String s = "nayan";
	
	char a[]=new char[s.length()];
	for(int i =0; i<a.length; i++)
	{
		a[i]=s.charAt(i);
	}
		char ra[] = new char[a.length];
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