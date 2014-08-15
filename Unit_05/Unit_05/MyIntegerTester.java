/**
 * Class: CIST 2371 
 * Introduction to JAVA Term: Summer 2014 
 * Instructor: Dave Busse 
 * Description: Solution to Unit 05 
 * Program Due: 7/14/14
 * 
 * @author: William M. Driver
 * @version: 1.0
 * 
 *           By turning in this code, I pledge: 1) That I have completed the
 *           programming assignment independently. 2) I have not copied the code
 *           from a student or any source. 3) I have not given my code to any
 *           student.
 */

public class MyIntegerTester {
	public static void main(String[] args) {
		// Declarations
		int test = 15;
		char[] a = { '1', '1' };
		String b = "12";
		MyInteger m = new MyInteger();

		// test passing an object
		// test int
		System.out.println("the object is m\n\t the test number is : " + test);
		m.setNum(test);

		MyInteger.getIsEven(m);
		MyInteger.getIsOdd(m);
		MyInteger.getIsPrime(m);

		// test instance of MyInteger
		// test int
		System.out
				.println("the instance is m\n\t the test number is : 0 (default)");

		m.getIsEven();
		m.getIsOdd();
		m.getIsPrime();

		// test int
		System.out
				.println("the instance is m\n\t the test number is : " + test);
		m.setNum(test);

		m.getIsEven();
		m.getIsOdd();
		m.getIsPrime();

		// test parseint(char[])
		System.out.println("\tthe test is char [] a:  11");
		m.setNum(m.parseInt(a));

		MyInteger.getIsEven(m);
		MyInteger.getIsOdd(m);
		MyInteger.getIsPrime(m);

		// test parseint(String)
		System.out.println("\tthe test is String b: 12");
		m.setNum(m.parseInt(b));

		MyInteger.getIsEven(m);
		MyInteger.getIsOdd(m);
		MyInteger.getIsPrime(m);
	}

}
