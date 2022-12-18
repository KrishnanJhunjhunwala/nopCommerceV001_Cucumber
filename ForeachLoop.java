package javaProgram;

public class ForeachLoop 
{
	public static void main(String[] args) 
	{
		int a[] = new int[5];				//declaration of an aaray

		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;

		for(int i : a)
		{
			System.out.println(i);
		}
		System.out.println("End Loop");
	}
}
