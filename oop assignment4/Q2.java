
//traversing the string!!!
class Q2
{
	
		static int k;
		static int j;
	public static void main(String args[])
	{
		
		String s = "1010111100001010100000000101";
		for(int i=0; i<s.length(); i++)
		{
			
			if(s.charAt(i) == '0' && s.charAt(i-1)== '1')
				++k;
			
		}
		
		System.out.println("count of 1`s preceeded by 0 = "+k);
		
	}
}