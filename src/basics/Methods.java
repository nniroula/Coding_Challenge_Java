package basics;
import java.util.Scanner;

/*
 * You can use all 4 modifiers with methods, public, private, protected, default
 **/
public class Methods {
	static Scanner sc = new Scanner(System.in);
	
	// static method
	 static int addNums(int a, int b) {
		 return a + b;
	 }

	public static void main(String []args) {
		System.out.println("This is for learning java methods...");
		
		int sum1 = addNums(2, 3);
		System.out.println(sum1);
		//OR
		System.out.println("enter your first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter your second number: ");
		int num2 = sc.nextInt();
		
		int sum2 = addNums(num1, num2);
		System.out.printf("Sum is %d.", sum2);
		System.out.println();
		
		// static methods are directly called on their classes, not on the objects
	
		StaticMethods.getDevloperSalary();
		System.out.println(	StaticMethods.getLanguage());
		
		// private methods are not accessible outside the class
		PrivateMethods pm = new PrivateMethods();
		// pm.getFramework(); // this method is not accessible outside of its class
	
		// ProtectedMethods class
		ProtectedMethods packageLevelAccess = new ProtectedMethods();
		byte grade = packageLevelAccess.getGrade();
		String role = packageLevelAccess.getRole();
		System.out.printf("Role is %s ", role);
		System.out.println();
		
		System.out.printf("ACII Grade is %s", grade);
		System.out.println();
		
		char letterGrade = packageLevelAccess.getLetterGrade();
		System.out.println("Letter grade is " + letterGrade);
		
		// PublicMethods class
		PublicMethods pubMethods = new PublicMethods();
		int total = pubMethods.sum(3, 5);
		System.out.println("Sum is " + total);
	}
}


// static methods are directly called on their classes, not on the objects
// You do not need to create object(instantiate class) to use static methods.
class StaticMethods{
	static String getLanguage() {
		return "Java";
	}
	
	static double getDevloperSalary() {
		return 120000.00;
	}
	
	static int getPercentage() {
		return 90;
	}
	
	static boolean getBooleanOutput() {
		return true;
	}	
}

// private methods are accessible within the class scope
class PrivateMethods{
	private String getFramework() {
		return "Springboot";
	}
	
	private int getJavaRank() {
		return 3;
	}
	
	private double getAnnualSalary() {
		return 100000.00;
	}
}


// Protected methods are accessible within the package scope
class ProtectedMethods{
	protected String getRole() {
		return "Java Developer";
	}
	
	protected byte getGrade() {
		return 'A';  // this will be returned converted to ascii value of 65 for A
	}
	
	
	protected char getLetterGrade() {
		return 'A';  // this will be returned converted to ascii value of 65 for A
	}
}

class PublicMethods{
	public int sum(int num1, int num2) {
		return num1 + num2;
	}
}
