package javaProgram;

public class Exception2 {

	public static void main(String[] args) 
	{
		System.out.println("Program is started");

		String s = null;
		try
		{
			System.out.println(s.length());
		}

		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Program is completed");
	}
}
