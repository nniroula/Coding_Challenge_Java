package basics;

/*
 * Integer is a Wrapper class for 'int' primitive data type.
 * Wrapper class converts corresponding primitive data types to a reference type
 * int and Integer,   long and Long, byte and Byte, boolean and Boolean,
 * char and Character, float and Float, double and Double
 *
 */

public class WrapperClasses {
	public static void main(String []args) {
		// use Wrapper classes
		Integer age = 27;
		Double gpa = 3.8;
		Character ch = 'A';
		
		age.intValue(); // has different methods
		System.out.println(age.intValue()); //both work fine
		System.out.println(age);
	}
}
