class RefVar
{
	int a;
	int b;
	
RefVar(int a, int b)
{
	this.a = a;
	this.b = b;
}
void greatestOfAll()
{
	if(a>b)
		System.out.println(a+" is greater than "+b);
	else if(a<b)
		System.out.println(b+" is greater than "+a);
	else
		System.out.println("Both are equal");
}
}

class Qu2
{
	public static void main(String args[])
	{
		RefVar r1 = new RefVar(12, 12);
		RefVar r2 = new RefVar(16, 12);
		RefVar r3 = new RefVar(200, 12);
		RefVar r4 = new RefVar(12, 212);
		
		r1 = r2;
		r1.greatestOfAll();
		r2.greatestOfAll();
		
		r2 = r3;
		r1.greatestOfAll();
		r2.greatestOfAll();
		r3.greatestOfAll();
		
		r4 = r1;
		r2 = r4;
		r1.greatestOfAll();
		r2.greatestOfAll();
		r3.greatestOfAll();
		r4.greatestOfAll();
		
	}
}