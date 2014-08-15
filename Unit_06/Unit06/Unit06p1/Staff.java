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

public class Staff extends Employee {
	// Declarations
	private String name = "Lenard Nemoy";
	private String title = "janitor";

	public Staff() {

	}

	protected void getName() {
		System.out.println(name);
	}

	protected String setName(String name) {
		this.name = name;
		return name;
	}
	protected void getTitle() {
		System.out.println(title);
	}

	protected String setTitle(String title) {
		this.title = title;
		return title;
	}

	public String toString() {
		return "Class Name = Staff\tname = " + name;
	}

}
