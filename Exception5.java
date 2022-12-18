package javaProgram;

public class Exception5 
{
	public static void main(String[] args) 
	{
		int arr[] = new int[5];

		try 
		{
			arr[10] = 100;
		}

		finally
		{
			System.out.println("Finally block will always execute");
		}
	}
}
