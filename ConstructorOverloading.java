package javaProgram;

public class ConstructorOverloading 
{
	int a;
	int b;
	double c;

	ConstructorOverloading()
	{
		a = 10;
		b = 20;
		c = 30.55;
	}

	ConstructorOverloading(int a, int b)
	{
		this.a = a;
		this.b = b;
	}

	ConstructorOverloading(int x, double y)
	{
		a = x;
		c = y;
	}

	ConstructorOverloading(int x, int y, double z)
	{
		a = x;
		b = y;
		c = z;
	}

	ConstructorOverloading(int x, double y, int z)
	{
		a = x;
		b = z;
		c = b;
	}

	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public static void main(String[] args) 
	{
		//ConstructorOverloading co = new ConstructorOverloading();
		ConstructorOverloading co = new ConstructorOverloading(30, 50);
		//ConstructorOverloading co = new ConstructorOverloading(30, 55.75);
		//ConstructorOverloading co = new ConstructorOverloading(100, 200, 255.35);
		//ConstructorOverloading co = new ConstructorOverloading(100, 105.95, 200);
		co.display();
	}
}