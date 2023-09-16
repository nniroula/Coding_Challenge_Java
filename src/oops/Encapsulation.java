package oops;

// Encapsulation deals with using private key word with methods and variables to hide the 
// implementation details from people.

class EncapsulationExample{
	// create constant and make if public
	// create a variable and make it private
	// create method toe have available for use in next class
	
	
	// To access variables and methods in another class, use getters and setters
	public static final int CONSTANT = 1000;
	public double count = 9.999999999;
	private int NUM = 35;
	private String programmingLanguage = "JAVA";
	//System.out.println(programmingLanguage);      // this has no output due to private variable

	// private method and private variables are the way of doing encapsulation
	private String encapsulationMethodOne() {
		return "Language is " + programmingLanguage;
	}
	
	// use this method to display the output of the private method
	public String printOutputOfPrivateMethodOne() {
		String resultString = encapsulationMethodOne();
		return resultString;
	}
	
	// this is a getter method -> it uses 'this' keyword
	public String getPrivateStringVariable() {
		return this.programmingLanguage;
	}
	 
	// NOTE you cannot invoke the getter method here
	// System.out.pritnln(getPrivateVariable());
	// in another class, call it and returns you the private variable
	
	public int getPrivateInt() {
		int privateValue = this.NUM;
		return privateValue;
	}
	
	public void printPrivateVariable() {
		System.out.println(getPrivateInt());
	}
	
	// setter for private string variable, it does not return any value, but assigns new value
	public void setPrivateString(String newValue) {
		this.programmingLanguage = newValue;
	}
	
	// setter for private int variable
	public void setPrivateVariableInt(int newIntValue) {
		this.NUM = newIntValue;
	}
	
}

public class Encapsulation {
	public static void main(String []args) {
		System.out.println("For encapsulation, make all variables and methods private");
		
		// instantiate the class
		EncapsulationExample eeObject = new EncapsulationExample();
		
		//	encapsulationMethodOne method
		//eeObject.encapsulationMethodOne(); // method is not accessible because its private.
		
		//getEncapsulatingString method to print output of private method
		// NOTE it has no effect as this method cannot print the private variable
		String resultOfPrivateMethod = eeObject.printOutputOfPrivateMethodOne();
		System.out.println(resultOfPrivateMethod);
		
		// getPrivateVariable method -> it prints the private variable
		String privateVariable = eeObject.getPrivateStringVariable();
		System.out.println(privateVariable);
		
		//printPrivateVariable method
		eeObject.printPrivateVariable();  // returns 35
		
		//setPrivateString method to update the new value for private variable
		eeObject.setPrivateString("JavaScript");
		// check if it really updated
		System.out.println(eeObject.getPrivateStringVariable()); // returns JavaScript
		
		//setPrivateVariableInt method
		eeObject.setPrivateVariableInt(87);
		// check if it is updated as expected
		System.out.println(eeObject.getPrivateInt()); // should return 87
		
		// constant variables
		int constantValue = EncapsulationExample.CONSTANT;
		double numb = eeObject.count;
		System.out.println(constantValue);
		System.out.println(numb);
		
	}

}
