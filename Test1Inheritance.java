package javaProgram;


class A
{
	int a;
	int b;

	public void display()
	{
		System.out.println(a+b);
	}
}

class B extends A
{
	int x;
	int y;

	public void show()
	{
		System.out.println(x+y);
	}
}

class C extends B
{
	int p;
	int q;

	public void addition()
	{
		System.out.println(p+q);
	}
}

public class Test1Inheritance 
{

	public static void main(String[] args) 
	{
		/*A aobj = new A();
		aobj.a = 100;
		aobj.b = 100;
		aobj.display();*/

		B bobj = new B();
		bobj.x = 200;
		bobj.y = 200;
		bobj.show();

		bobj.a = 150;
		bobj.b = 150;
		bobj.display();

		C cobj = new C();
		cobj.a = 5;
		cobj.b = 5;
		cobj.x = 10;
		cobj.y = 10;
		cobj.p = 15;
		cobj.q = 15;

		cobj.display();
		cobj.show();
		cobj.addition();
	}
}
