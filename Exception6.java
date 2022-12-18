package javaProgram;

public class Exception6 
{
	public static void main(String[] args) 
	{
		int arr[] = new int[5];

		try 
		{
			arr[2] = 100;
		}

		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

		finally
		{
			System.out.println("Finally block will always execute");
		}
	}
}
