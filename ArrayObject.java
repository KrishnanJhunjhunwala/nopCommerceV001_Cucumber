package javaProgram;

public class ArrayObject {

	public static void main(String[] args) {

		Object a[] = new Object[5];

		//Object o[] = {100, "Selenium", 'T', 90.55, true};

		a[0] = 100;
		a[1] = "Selenium";
		a[2] = 'T';
		a[3] = 90.55;
		a[4] = true;

		for(Object i:a)
		{
			System.out.println(i);
		}
	}
}
