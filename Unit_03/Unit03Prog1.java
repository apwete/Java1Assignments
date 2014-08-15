/**
 * Class: CIST 2371 Introduction to JAVA Term: Summer 2014 Instructor: Dave
 * Busse Description: Solution to Unit 03 p2 Program Due: 6/17/14
 * 
 * @author: William M. Driver
 * @version: 1.0
 * 
 *           By turning in this code, I pledge: 1) That I have completed the
 *           programming assignment independently. 2) I have not copied the code
 *           from a student or any source. 3) I have not given my code to any
 *           student.
 * 
 */

public class Unit03Prog1 {
	public static void main(String[] args) {
		// Declarations
		char c1 = 'a';
		char c2 = 'z';
		// System.out.println("c1 + 10 = " + (c1+10));
		System.out.println("Printing all characters between " + c1 + " and "
				+ c2 + ".\n");
		printChars(c1, c2);
	}

	public static void printChars(char c1, char c2) {
		// Declarations
		int count = 1;

		while (c1 <= c2) {
			if (count < 10) {
				System.out.print(c1 + " ");
				c1++;
			} else {
				System.out.println(c1 + " ");
				c1++;
				count = 0;
			}
			count++;
		}
	}

}