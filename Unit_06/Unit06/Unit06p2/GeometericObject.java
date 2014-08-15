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


public abstract class GeometericObject {
	//Declarations
	private String color = "null";
	private boolean filled = true;

	public GeometericObject() {
		
	}
	
	protected void getColor(){
		System.out.println(color);
	}
	protected String setColor(String color){
		this.color = color;
		return color;
	}
	
	protected void getFilled(){
		System.out.println(filled);
	}
	protected boolean setFilled(boolean filled){
		this.filled = filled;		
		return filled;
	}
	protected void getCreationDate(){
		java.util.Date creationDate = new java.util.Date();
		System.out.println(creationDate);
	}
	
}
