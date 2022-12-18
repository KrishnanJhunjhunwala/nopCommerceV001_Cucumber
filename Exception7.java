package javaProgram;

public class Exception7 
{
	public static void main(String[] args) 
	{
		System.out.println("Program is started");
		System.out.println("Program is in progress");

		try 
		{
			Thread.sleep(4000);
		}

		catch(Exception e) 
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		System.out.println("Program is completed");
		System.out.println("Program is exited");	
	}
}
