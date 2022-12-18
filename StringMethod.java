package javaProgram;

public class StringMethod {

	public static void main(String[] args) {

		String s = "Welcome";

		System.out.println(s.length());

		String s1 = "Welcome to ";
		String s2 = "training";

		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));

		String s3 = "WELCOME";
		String s4 = "welcome";

		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));

		System.out.println(s3.contains("wel"));				//false
		System.out.println(s3.contains("WEL"));			//true

		System.out.println(s3.substring(3, 6));
		System.out.println(s3.substring(2, 5));
		System.out.println(s3.substring(1, 6));
		//Starting index starts from 0
		//Ending index starts from 1

		System.out.println(s.replace('e', 'a'));
		System.out.println(s.replace("come",	"came"));
	}
}
