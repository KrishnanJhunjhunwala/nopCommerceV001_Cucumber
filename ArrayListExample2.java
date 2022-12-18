package javaProgram;

import java.util.ArrayList;

public class ArrayListExample2 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();

		//adding elements to ArrayList
		al.add("Java");
		al.add(100);
		al.add('K');
		al.add(123.67);
		al.add(false);
		System.out.println("Numebr of elements in array list are: " +al.size());		//returns numebrs of elements from array List
		System.out.println("Elements in array list: " +al);

		//inserting elements into array list
		al.add(4, "Language");
		al.add(1, 'J');
		al.add(3, true);
		al.add(2, 222.23);
		System.out.println("Numebr of elements in array list are: " +al.size());		//returns numebrs of elements from array List
		System.out.println("Elements in array list: " +al);

		//removing elements from array list
		al.remove(123.67);
		System.out.println("Elements in array list after removing: " +al);

		al.remove(3);
		System.out.println("Elements in array list after removing: " +al);
	}
}
