package javaProgram;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 
{
	public static void main(String[] args) 
	{

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(100, "Raj");
		hm.put(200, "Rajesh");
		hm.put(300, "Rahul");
		hm.put(400, "Ravi");

		System.out.println(hm);

		for(Map.Entry m: hm.entrySet())
		{
			System.out.println(m.getKey()+ "	"+m.getValue());
		}

		hm.remove(400);
		System.out.println(hm);
	}
}
