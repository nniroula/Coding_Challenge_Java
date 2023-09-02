package basics;
import java.util.Scanner;

class ArithmaticOperators{
	// relational operators return boolean values
	boolean booleanFunction() {
		boolean result1 = 5 < 4;
		// boolean result2 = 'a' > 'A'; // compares ascii values, A = 65
		return result1;
	}
}

class LogicalOperators{
	Scanner sc = new Scanner(System.in);
	public void threeLogicalOperators() {
		// logical AND is &&
		// logical OR is ||
		//logical NOT is !, example !=(not equal)
		
		System.out.print("enter a number between 0 and 10: ");
		int number = sc.nextInt();
		if(number > 4 && number < 8) {
			System.out.println("You like coding");
		}else if(number < 4 || number > 8) {
			System.out.println("You like problem solving");
		}else if(number != 4) {
			System.out.println("You love DSA! ");
		}else {
			System.out.println("Persitency matters in coding.");
		}
	}
}

class TernaryOperators {
	// Ternary, also called as Conditional operator uses following pattern for comparison
	// condition 1 ? expression2: exp2; -> if condition is true, execute expression1 else run exp2
	
	Scanner sc = new Scanner(System.in);
	String conditionalOperator() {
		// get a user input and compare it with other values
		System.out.println("Enter your name: ");
		String name = sc.next();
		int lengthOfName = name.length();
		//System.out.print(lengthOfName);
		System.out.println();
		
		return lengthOfName > 4 ? "Shorten your name please!": "Nice name!";
	}
}

public class Operators {
	public static void main(String[]args) {
		// instantiate basicOperators class
		ArithmaticOperators bo = new ArithmaticOperators();
		boolean output = bo.booleanFunction();
		System.out.print("output of boolean function is -> ");
		System.out.println(output);
		
		// instantiate the LogicalOperators class, and invoke functions in it
		LogicalOperators lo = new LogicalOperators();
		lo.threeLogicalOperators();
		
		// Ternary class instantiation
		TernaryOperators to = new TernaryOperators();
		String result1 = to.conditionalOperator();
		System.out.println(result1);
	}

}
