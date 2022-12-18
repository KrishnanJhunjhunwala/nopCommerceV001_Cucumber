package javaProgram;

import java.util.ArrayList;

public class ArrayListExample1 
{
	public static void main(String[] args) 
	{
		ArrayList <String> al = new ArrayList<String>();

		//adding elements to ArrayList
		al.add("Java");
		al.add("Selenium");
		al.add("Automation");
		al.add("Python");
		al.add("Cucumber");

		System.out.println(al.size());		//returns numebrs of elements from array List

		for(String s: al)		//reading elements from arrayList
		{
			System.out.println(s);
		}
	}
}
