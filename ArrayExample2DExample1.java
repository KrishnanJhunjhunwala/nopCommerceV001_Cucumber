package javaProgram;

public class ArrayExample2DExample1 {

	public static void main(String[] args) {

		int [][] a = new int[3][2];			//declaration

		//Storing elements/values into array

		a[0][0] = 10;
		a[0][1] = 20;

		a[1][0] = 30;
		a[1][1] = 40;

		a[2][0] = 50;
		a[2][1] = 60;

		/*
		for(int row = 0; row<= 2; row++)	//Printing row
		{
			for(int col = 0; col<= 1; col++)	//Printing col
			{
				System.out.print(a[row][col] + "	 ");
			}
			System.out.println();
		 */

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
