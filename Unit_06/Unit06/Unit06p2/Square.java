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

public class Square extends GeometericObject implements Colorable {
	// Declarations
	private double area = 0;
	private double parameter = 0;

	public Square() {

	}

	protected void getArea() {
		System.out.println(area);

	}

	protected double setArea(double side) {
		this.area = side * side;
		return area;
	}

	protected void getParameter() {
		System.out.println(parameter);

	}

	protected double setParameter(double side) {
		this.parameter = side * 4;
		return parameter;
	}

	public String howToColor() {
		// Declarations
		String color = "color all four sides";

		return color;
	}

}
