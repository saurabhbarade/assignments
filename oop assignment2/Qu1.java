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
	sub();
}
void sub()
{
	result = a - b;
	System.out.println("Substraction : "+result);
	mul();
}
void mul()
{
	result = a * b;
	System.out.println("Multiplication : "+result);
	div();
}
void div()
{
	result = a / b;
	System.out.println("Division : "+result);
}
}
class Qu1
{
	public static void main(String args[])
	{
		Arithmatic a1 = new Arithmatic(12, 24);
		a1.Add();
	}
}