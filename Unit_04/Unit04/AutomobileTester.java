/**
 * Class: CIST 2371 Introduction to JAVA
 * Term: Summer 2014
 * Instructor: Dave Busse
 * Description: Solution to Unit 04 Program
 * Due: 6/24/14
 * @author: William M. Driver
 * @version: 1.0
 *
 *By turning in this code, I pledge:
 *  1) That I have completed the programming assignment independently.
 *  2) I have not copied the code from a student or any source.
 *  3) I have not given my code to any student.
 *
 */
import java.util.Scanner;

public class AutomobileTester {
	public static void main(String[] args) {
		// Create Objects
		Scanner s = new Scanner(System.in);
		Automobile auto = new Automobile();

		// auto with nothing set
		System.out.print("Your vehicle information is curently set to" + auto
				+ "\n\n");

		// set info for auto
		System.out.print("Please, enter your vehicle's make: \t");
		auto.setMake(s.nextLine());
		System.out.print("Please, enter your vehicle's model: \t");
		auto.setModel(s.nextLine());
		System.out.print("Please, enter your vehicle's color: \t");
		auto.setColor(s.nextLine());
		System.out.print("Please, enter your vehicle's VIN: \t");
		auto.setVIN(s.nextLine());

		System.out.print(auto);

	}

}