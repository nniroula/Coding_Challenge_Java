package basics;
import java.util.Scanner;

class UserInputAndOutput{
	// instantiate Scanner class
	Scanner sc = new Scanner(System.in);
	// user scanner object to store user inputs
	// get user input, store it in a variable, and display it
	// You need scanner class to get and store user input
	
	public String getProgrammingLanguage() {
		System.out.print("Enter your basic programming language: ");
		String programmingLanguage = sc.next();
		return programmingLanguage;
	}
	// method without public keyword
	String getBackendFramework() {
		System.out.print("Enter a backend framework: ");
		String framework = sc.next();
		return framework;
	}
	
	/*
	 * NOTE:
	// method with static keyword
	static String getPackageManager() {
		System.out.print("Enter the package manager: ");
		// sc is non-static. So you cannot make reference to it.
		// You have to make sc static like this:- static Scanner sc = new Scanner(System.in);
		String packageManager =  sc.next();
		return packageManager;
	}
	*/
	
	// private method, discuss scope
	
	// protected method,  discuss scope
	
	// getDouble method
	
	//getFloat method
	
	// get boolean method
	
	// getChar method
	
	// getInteger method
	
}

public class IO {
	public static void main(String []args) {
		UserInputAndOutput userInputInstance = new UserInputAndOutput();
		String language = userInputInstance.getProgrammingLanguage();
		System.out.printf("You entered %s. ", language);
		System.out.println();
		
		// getBackendFramework method invocation
		String framework = userInputInstance.getBackendFramework();
		System.out.printf("Framework is %s", framework);
		
		

	}
}
