package javaProgram;

public class Employee 
{
	int empid;
	String empname;
	int salary;
	int deptno;

	/*
	Employee(int id, String name, int sal, int dno)
	{
		empid = id;
		empname = name;
		salary = sal;
		deptno = dno;
	}
	 */

	void setData(int id, String name, int sal, int dno)
	{
		empid = id;
		empname = name;
		salary = sal;
		deptno = dno;
	}

	void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);
	}

	public static void main(String[] args) 
	{

		//1st Way
		/*
		Employee emp1 = new Employee();
		emp1.empid = 100;
		emp1.empname = "Sachin";
		emp1.salary = 150000;
		emp1.deptno = 10;
		emp1.display();

		Employee emp2 = new Employee();
		emp2.empid = 101;
		emp2.empname = "Amit";
		emp2.salary = 250000;
		emp2.deptno = 20;
		emp2.display();
		 */

		//2nd Way
		/*
		Employee emp1 = new Employee(101, "Rajesh", 15000, 10);
		emp1.display();

		Employee emp2 = new Employee(102, "Sanjay", 20000, 20);
		emp2.display();
		 */

		//3rd Way
		Employee emp1 = new Employee();
		emp1.setData(1001, "James", 25000, 70);
		emp1.display();

		emp1.setData(1002, "Chris", 30000, 80);
		emp1.display();
	}
}

