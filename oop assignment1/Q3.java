class Static
{
	static String name;
	static int age;
	static String course;
	static double fees;
	
	static
	{
		name = "Saurabh Barade";
		age = 24;
		course = "PG-DAC";
		fees = 90000.00;
	}
	
	static void Print()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Course : "+course);
		System.out.println("Fees : "+fees);
	}
}
public class Q3
{
	public static void main(String args[])
	{
		System.out.println(Static.name);
		System.out.println(Static.age);
		System.out.println(Static.course);
		System.out.println(Static.fees);
		
		Static.Print();
	}
}