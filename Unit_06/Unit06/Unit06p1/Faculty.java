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

public class Faculty extends Employee {
	// Declarations
	private String name = "Mortisha Adams";
	private String hours = "9-5";
	private String rank = "None";

	public Faculty() {

	}

	protected void getName() {
		System.out.println(name);
	}

	protected String setName(String name) {
		this.name = name;
		return name;
	}
	protected void getHours() {
		System.out.println(hours);
	}

	protected String setHours(String hours) {
		this.hours = hours;
		return hours;
	}

	protected void getRank() {
		System.out.println(rank);
	}

	protected String setRank(String rank) {
		this.rank = rank;
		return rank;
	}

	public String toString() {
		return "Class Name = Faculty \tname = " + name;
	}

}
