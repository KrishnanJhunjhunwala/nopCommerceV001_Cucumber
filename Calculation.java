package javaProgram;

public class Calculation {

	int a;
	int b;

	//1 - Method without parameter 	
	//4 - Method may not returns value
	void sum()
	{
		System.out.println(a+b);
	}


	//2 - Method takes parameter
	void sum(int x, int y)
	{
		a=x;
		b=y;
		System.out.println(a+b);
	}


	//3 - Method return some value
	int add()
	{
		return (a+b);
	}

	public static void main(String[] args) 
	{
		Calculation cal = new Calculation();

		//1 - Method without parameter
		cal.a = 200;
		cal.b = 300;
		cal.sum();


		//2 - Method takes parameter
		cal.sum(100, 800);


		//3 - Method return some value
		cal.a = 200;
		cal.b = 200;
		int result = cal.add();
		System.out.println(result);
	}
}
