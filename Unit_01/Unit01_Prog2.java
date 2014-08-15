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

class Unit01_Prog2{
	public static void main(String[] args){
		//Declaration
		Scanner s = new Scanner(System.in);
		double feet;
		double meters;
		
		System.out.println("How many feet did you travel to get to your computer?");
		feet = s.nextDouble();
		meters = feet * .305;
		System.out.println("You traveled "+ (int)(meters*100)/100.0 + " meters to your computer.");
	}
}