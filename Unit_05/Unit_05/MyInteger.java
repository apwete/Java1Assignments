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

public class MyInteger {
	// Declarations
	private static int num = 0;

	public MyInteger() {
	
	}

	protected void getNum() {
		System.out.println(num);
	}

	protected int setNum(int num) {
		MyInteger.num = num;
		return num;
	}

	// isEven methods
	protected void getIsEven() {
		System.out.println("Is the number even?\t" + isEven(num));
	}// end getIsEven()

	protected static void getIsEven(MyInteger m) {
		System.out.println("Is the number even?\t" + isEven(m));
	}// end getInEven( Object )

	private boolean isEven() {
		if (num % 2 == 0) {
			return true;
		}
		return false;
	}// end isEven( )

	private boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;
		}
		return false;
	}// end isEven( int )

	private static boolean isEven(MyInteger m) {
		if (num % 2 == 0) {
			return true;
		}
		return false;
	}// end isEven( Object )

	// isOdd methods
	protected void getIsOdd() {
		System.out.println("Is the number odd?\t" + isOdd(num));
	}// end getIsOdd()

	protected static void getIsOdd(MyInteger m) {
		System.out.println("Is the number odd?\t" + isOdd(m));
	}// end getInOdd( Object )

	private boolean isOdd() {
		if (num % 2 != 0) {
			return true;
		}
		return false;
	}// end isOdd( )

	private boolean isOdd(int num) {
		if (num % 2 != 0) {
			return true;
		}
		return false;
	}// end isOdd( int )

	private static boolean isOdd(MyInteger m) {
		if (num % 2 != 0) {
			return true;
		}
		return false;
	}// end isOdd( Object )

	// isPrime methods
	protected void getIsPrime() {
		System.out.println("Is the number Prime?\t" + isPrime(num));
	}// end getPrime()

	protected static void getIsPrime(MyInteger m) {
		System.out.println("Is the number prime?\t" + isPrime(m));
	}// end getInPrime( Object )

	private boolean isPrime() {
		if (num == 2 || num == 3) {
			return true;
		}
		if (num % 2 == 0) {
			return false;
		}
		int sqrt = (int) Math.sqrt(num) + 1;
		for (int i = 3; i < sqrt; i += 2) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}// end isPrime( )

	private boolean isPrime(int num) {
		if (num == 2 || num == 3) {
			return true;
		}
		if (num % 2 == 0) {
			return false;
		}
		int sqrt = (int) Math.sqrt(num) + 1;
		for (int i = 3; i < sqrt; i += 2) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}// end isPrime( int )

	private static boolean isPrime(MyInteger m) {
		if (num == 2 || num == 3) {
			return true;
		}
		if (num % 2 == 0) {
			return false;
		}
		int sqrt = (int) Math.sqrt(num) + 1;
		for (int i = 3; i < sqrt; i += 2) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}// end isPrime( Object )

	// parseInt methods
	protected int parseInt(char[] input) {
		// for(int i = 0; i < input.length; i++){
		// if(!Character.isDigit(input[i])){
		// System.out.println("Please, enter just numbers.");
		// break;
		// }
		// }
		num = Integer.parseInt(new String(input));
		return num;
	}// end parseInt( char[] )

	protected int parseInt(String input) {
		int num = Integer.parseInt(input);
		return num;
	}// end parseInt( String )

}
