package javaProgram;

public class StaticExample 
{

	int a;
	static int b;

	static void m1()
	{
		System.out.println("This is a static method - m1");
	}

	void m2()
	{
		System.out.println("This is non-static method - m2");
	}

	void m3()
	{
		System.out.println(a = 1000); 
		System.out.println(b = 2000);
		m1();
		m2();
	}

	public static void main(String[] args) 
	{
		b = 100;
		System.out.println(b);
		m1();

		StaticExample se = new StaticExample();
		se.a = 200;
		System.out.println(se.a);
		se.m2();

		se.m3();
	}
}
