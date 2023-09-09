package basics;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Stack;
import java.util.Vector;

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
		
		// use of wrapper class is in generics
		ArrayList<Integer> al = new ArrayList(); // or new ArrayList<Integer>()
		LinkedList<Double> ll = new LinkedList();
		HashMap<Byte, Character> hm = new HashMap(); // hashmap is key value pair
		Stack<String> stk = new Stack();
		Vector<Float> vect = new Vector();
	}
}
