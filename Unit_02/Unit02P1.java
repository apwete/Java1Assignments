
/**
* Class: CIST 2371 Introduction to JAVA
* Term: Summer 2014
* Instructor: Dave Busse
* Description: Solution to Unit 01 Program
* Due: 6/6/14
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
public class Unit02P1 {
	public static void main(String[] args) {
		//Declaration
		Scanner s = new Scanner(System.in);
		double input;
		//get input
		System.out.println("Please, enter an integer. (A number without a decimal point)");
		input = s.nextDouble();
		//force input to be an integer
		input = (int)input;
		//output answers
		System.out.println((input%5==0) && (input%6==0) ? "Is "+input+" divisible by 5 and 6? True": "Is "+input+" divisible by 5 and 6? False");
		System.out.println((input%5==0) || (input%6==0) ? "Is "+input+" divisible by 5 or 6? True" :"Is "+input+" divisible by 5 or 6? False");		
		System.out.println((input%5==0) ^  (input%6==0) ? "Is "+input+" divisible by 5 or 6,but not both? True" : "Is "+input+" divisible by 5 or 6, but not both? False");	
	}
}