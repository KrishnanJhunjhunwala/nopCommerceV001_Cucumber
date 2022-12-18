package javaProgram;

public class Exception4 {

	public static void main(String[] args) {

		int arr[] = new int[5];

		try 
		{
			arr[10] = 100;
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
