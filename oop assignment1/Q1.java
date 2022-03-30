class Assignment
{
	static int i;
	static int j;
	static int k;
	static int l;
	static char m;
static
{
	i = 0b1010;
	j = 012;
	k = 0xa;
	l = '\u0061';
	m = '\u0061';
}


void print()
{
	System.out.println(i);
	System.out.println(j);
	System.out.println(k);
	System.out.println(l);
	System.out.println(m);
}
}
public class Q1
{
	public static void main(String args[])
	{
		Assignment p = new Assignment();
		p.print();
	}
}