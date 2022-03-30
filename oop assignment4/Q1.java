class Q1
{
	
		static int k;
		static int j;
	public static void main(String args[])
	{
		
		String s = "1010111100001010100000000101";
		for(int i=0; i<s.length(); i++)
		{
			
			if(s.charAt(i) == '1')
				++k;
			else if(s.charAt(i) == '0')
				++j;
		}
		
		System.out.println("count of 1`s = "+k);
		System.out.println("count of 0`s = "+j);
	}
}