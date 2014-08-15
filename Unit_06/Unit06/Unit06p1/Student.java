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

public class Student extends Person {

	// Declarations
	// private String status[] = {"freshman", "sophomore", "junior", "senior"};
	private String name = "Sally Jane";
	private String status = "freshman";

	Student() {

	}

	protected void getName() {
		System.out.println(name);
	}

	protected String setName(String name) {
		this.name = name;
		return name;
	}
	protected void getStatus() {

		System.out.println(status);
	}

	protected String setStatus(String status) {
		this.status = status;
		return status;
	}

	public String toString() {
		return "Class Name = Student\tname = " + name;
	}

}

//public abstract class Student extends Person {
//
//	// Declarations
//	// private String status[] = {"freshman", "sophomore", "junior", "senior"};
//	private String name = "Sally Jane";
//	private String status = "freshman";
//
//	Student() {
//
//	}
//
//	protected abstract void getName();
//
//	protected abstract String setName(String name);
//
//	protected abstract void getStatus();
//
//	protected abstract String setStatus(String status);
//
//	public String toString() {
//		return "Class Name = Student\tname = " + name;
//	}
//
//}