package javaProgram;


public class ArrayExample2DExample2 {

	public static void main(String[] args) {

		int [][] a = { {10, 20, 30}, {15, 25, 35}, {40, 50, 60}, {45, 55, 65}, {70, 80, 90} };			//declaration

		//Storing elements/values into array
		for(int i[] : a)
		{
			for(int j:i)
			{
				System.out.print(j + "	");
			}
			System.out.println();
		}
	}
}
