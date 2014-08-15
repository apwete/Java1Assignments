/**
* Class: CIST 2371 Introduction to JAVA
* Term: Summer 2014
* Instructor: Dave Busse
* Description: Solution to Unit 01 Program
* Due: 6/7/14
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

class Unit01_Prog1{
	public static void main(String[] args){
		//Declaration
		Scanner s = new Scanner(System.in);
		final String F = "\u2109";
		double cels;
		double fahrenheit;
		
		System.out.println("Please, enter the temperature in celsius and I'll tell you what it is in fahrenheit.");
		cels = s.nextDouble();
		fahrenheit = (9.0/5) * cels + 32;
		System.out.println("Today's temperature is "+ fahrenheit + " " + F);
	}
}