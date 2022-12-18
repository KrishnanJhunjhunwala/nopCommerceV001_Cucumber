package javaProgram;

class Access
{
	/*
	private int i = 10;

	private void m1()
	{
		System.out.println(i);
	}
	 */

	int i = 10;

	void m1()
	{
		System.out.println(i);
	}

}

public class AccessSpecifiers 
{

	public static void main(String[] args) 
	{
		Access obj = new Access();
		//obj.m1();		cannot access since it is private
		//System.out.println(obj.i);		cannot access since it is private
		
		obj.m1();

	}
}
