package javaProgram;

interface TestInterface
{
	int a = 10;	//by default variable is static and final

	void display();		//abstract method
}

public class Interface implements TestInterface
{
	@Override
	public void display() 
	{
		System.out.println(a);
	}

	public static void main(String[] args) 
	{
		Interface ie = new Interface();
		ie.display();
	}
}
