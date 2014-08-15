/**
 * Class: CIST 2371 Introduction to JAVA
 * Term: Summer 2014
 * Instructor: Dave Busse
 * Description: Solution to Unit 05 Program
 * Due: 6/25/14
 * @author: William M. Driver
 * @version: 1.0
 *
 *By turning in this code, I pledge:
 *  1) That I have completed the programming assignment independently.
 *  2) I have not copied the code from a student or any source.
 *  3) I have not given my code to any student.
 */
import java.util.Scanner;

public class Unit05_Prog1 {
	public static void main(String[] args) {
		// Declarations

		Scanner s = new Scanner(System.in);
		String arg1;
		String arg2;
		int lower = 0;
		int upper = 0;
		int nonChar = 0;

		System.out
				.println("Please, enter an argument.  I'll tell you how many upper, lower,"
						+ " and non- letter characters are in it.  \nAlso, I do not read spaces so don't"
						+ " use them.");
		arg1 = s.nextLine();
		arg2 = arg1.replaceAll(" ", "");
		// System.out.println("String before editing:  "+s);
		// System.out.println("\nString after removing non letters:  "+s2);
		for (int i = 0; i < arg2.length(); i++) {
			// String letter = s2.substring(i);
			if (Character.isLowerCase(arg2.charAt(i))) {
				lower++;
			} else if (Character.isUpperCase(arg2.charAt(i))) {
				upper++;
			} else {
				nonChar++;
			}
		}
		System.out.println("\nNumber of uppercase letters:  " + upper);
		System.out.println("\nNumber of lowercase letters:  " + lower);
		System.out.println("\nNumber of non letter Characters:  " + nonChar);
		System.out.println("\nFinal string s:  " + arg1);

	}

}
