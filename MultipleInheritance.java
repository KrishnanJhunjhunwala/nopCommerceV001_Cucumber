package javaProgram;

interface X
{
	int a = 10;
	void display();
}

interface Y
{
	int b = 20;
	void show();
}

public class MultipleInheritance implements X,Y
{
	@Override
	public void display() 
	{
		System.out.println(a);
	}

	@Override
	public void show() 
	{
		System.out.println(b);
	}

	public static void main(String[] args) 
	{
		MultipleInheritance mi = new MultipleInheritance();
		mi.display();
		mi.show();
	}	
}

