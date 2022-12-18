package javaProgram;

public class ArrayExample2 {

	public static void main(String[] args) 
	{	
		String s[] = new String[3];

		s[0] = "Zero";
		s[1] = "One";
		s[2] = "Two";

		System.out.println(s.length);

		for(String st:s)
		{
			System.out.println(st);
		}
	}
}
