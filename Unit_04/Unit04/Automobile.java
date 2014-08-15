/**
 * Class: CIST 2371 Introduction to JAVA Term: Summer 2014 Instructor: Dave
 * Busse Description: Solution to Unit 04 Program Due: 6/24/14
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

public class Automobile {
	// Declarations
	String vin = "null";
	String make = "null";
	String model = "null";
	String color = "null";

	protected Automobile() {

	}

	public String toString() {
		return "\n\tYour vehicle is a " + color + ", " + make + ", " + model
				+ ".\n\tThe VIN is: " + vin;
	}

	protected String getVIN() {
		return vin;
	}

	protected void setVIN(String vin) {
		this.vin = vin;
	}

	protected String getMake() {
		return make;
	}

	protected void setMake(String make) {
		this.make = make;
	}

	protected String getModel() {
		return model;
	}

	protected void setModel(String model) {
		this.model = model;
	}

	protected String getColor() {
		return color;
	}

	protected void setColor(String color) {
		this.color = color;
	}

}