/**
 * Class: CIST 2371 
 * Introduction to JAVA Term: Summer 2014 Instructor: Dave
 * Busse Description: Solution to Unit 05 
 * Program Due: 7/21/14
 * 
 * @author: William M. Driver
 * @version: 1.0
 * 
 *           By turning in this code, I pledge: 1) That I have completed the
 *           programming assignment independently. 2) I have not copied the code
 *           from a student or any source. 3) I have not given my code to any
 *           student.
 */

public class Unit06_Prog2 extends Square{
	public static void main(String[] args) {
		// Declarations
		Square square = new Square();
		
		//Get defaults
		square.getCreationDate();
		square.getColor();
		square.getFilled();
		square.getArea();
		square.getParameter();
		square.howToColor();
		
		System.out.println();
		
		//Change defaults
		square.setColor("Red");
		square.setFilled(false);
		square.setArea(5);
		square.setParameter(5);
		square.howToColor();
		
		//Get defaults
		square.getCreationDate();
		square.getColor();
		square.getFilled();
		square.getArea();
		square.getParameter();
		square.howToColor();
	}
}