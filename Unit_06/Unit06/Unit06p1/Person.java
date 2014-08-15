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

public class Person {
	// Declarations
	private String name = "J. Doe";
	private String address = "1 Street, City, State";
	private String email = "jDoe@email.com";
	private String phoneNumber = "55555555";

	Person() {

	}

	protected void getName() {
		System.out.println(name);
	}

	protected String setName(String name) {
		this.name = name;
		return name;
	}

	protected void getAddress() {
		System.out.println(address);
	}

	protected String setAddress(String address) {
		this.address = address;
		return address;

	}

	protected void getEmail() {
		System.out.println(email);
	}

	protected String setEmail(String email) {
		this.email = email;
		return email;

	}

	protected void getPhoneNumber() {
		System.out.println(phoneNumber);
	}

	protected String setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return phoneNumber;

	}

	public String toString() {
		return "Class Name = Person\tname = " + name;
	}
}

//public abstract class Person {
//	// Declarations
//	private String name = "J. Doe";
//	private String address = "1 Street, City, State";
//	private String email = "jDoe@email.com";
//	private String phoneNumber = "55555555";
//
//	Person() {
//
//	}
//
//	protected abstract void getName();
//
//	protected abstract String setName(String name);;
//
//	protected abstract void getAddress();
//
//	protected abstract String setAddress(String address);
//
//	protected abstract void getEmail();
//
//	protected abstract String setEmail(String email);
//
//	protected abstract void getPhoneNumber();
//
//	protected abstract String setPhoneNumber(String phoneNumber);
//
//	public abstract String toString();
//}
