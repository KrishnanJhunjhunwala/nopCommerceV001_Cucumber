package javaProgram;

class Bank
{
	int getRateOfInterest()
	{
		return 0;
	}
}

class SBI extends Bank
{
	int getRateOfInterest()
	{
		return 10;
	}
}

class ICICI extends Bank
{
	int getRateOfInterest()
	{
		return 20;
	}
}

class HDFC extends Bank
{
	int getRateOfInterest()
	{
		return 15;
	}
}

public class Overriding 
{

	public static void main(String[] args) 
	{
		SBI obj1 = new SBI();
		System.out.println(obj1.getRateOfInterest());

		ICICI obj2 = new ICICI();
		System.out.println(obj2.getRateOfInterest());

		HDFC obj3 = new HDFC();
		System.out.println(obj3.getRateOfInterest());
	}
}
