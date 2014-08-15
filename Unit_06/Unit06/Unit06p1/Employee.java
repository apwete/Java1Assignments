//package Unit_06;

/**
 * Class: CIST 2371 Introduction to JAVA Term: Summer 2014 Instructor: Dave
 * Busse Description: Solution to Unit 05 Program Due: 6/25/14
 * 
 * @author: William M. Driver
 * @version: 1.0
 * 
 *           By turning in this code, I pledge: 1) That I have completed the
 *           programming assignment independently. 2) I have not copied the code
 *           from a student or any source. 3) I have not given my code to any
 *           student.
 */

public class Employee extends Person {
	// Declarations
	private String name = "Marky Mark";
	private String office = "F9999";
	private double salary = 0.0;
	private String hireDate = "00/00/0000";

	public Employee() {

	}

	protected void getName() {
		System.out.println(name);
	}

	protected String setName(String name) {
		this.name = name;
		return name;
	}
	protected void getOffice() {
		System.out.println(office);
	}

	protected String setOffice(String office) {
		this.office = office;
		return office;
	}

	protected void getSalary() {
		System.out.println(salary);
	}

	protected double setSalary(double salary) {
		this.salary = salary;
		return salary;
	}

	protected void getHireDate() {
		System.out.println(hireDate);
	}

	protected String setHireDate(String hireDate) {
		this.hireDate = hireDate;
		return hireDate;
	}

	public String toString() {
		return "Class Name = Employee\tname = " + name;
	}

}


//public abstract class Employee extends Person {
//	// Declarations
//	private String name = "Marky Mark";
//	private String office = "F9999";
//	private double salary = 0.0;
//	private String hireDate = "00/00/0000";
//
//	public Employee() {
//
//	}
//
//	protected abstract void getName();
//
//	protected abstract String setName(String name);
//
//	protected abstract void getOffice();
//
//	protected abstract String setOffice(String office);
//
//	protected abstract void getSalary();
//
//	protected abstract double setSalary(double salary);
//
//	protected abstract void getHireDate();
//
//	protected abstract String setHireDate(String hireDate);
//
//	public abstract String toString();
//
//}