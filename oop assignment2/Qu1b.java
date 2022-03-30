class Arithmatic
{
	double a;
	double b;
	static double result;
	
Arithmatic(double a, double b)
{
	this.a = a;
	this.b = b;
}
void Add()
{
	result = a + b;
	System.out.println("Addition : "+result);
}
void sub()
{
	result = a - b;
	System.out.println("Substraction : "+result);	
}
void mul()
{
	result = a * b;
	System.out.println("Multiplication : "+result);
}
void div()
{
	result = a / b;
	System.out.println("Division : "+result);
}
}
class Qu1b
{
	public static void main(String args[])
	{
		Arithmatic a1 = new Arithmatic(12, 24);
		a1.Add();
		a1.sub();
		a1.mul();
		a1.div();
		Arithmatic a2 = new Arithmatic(1000, 3600);
		a2.Add();
		a2.sub();
		a2.mul();
		a2.div();
	}
}