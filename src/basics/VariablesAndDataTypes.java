package basics;

public class VariablesAndDataTypes {
	/** 
	 * Variable name starts with underscore or small letter
	 * case sensitive
	 * camelCase
	 * */
	
	/**
	 * There are 8 primitive data types
	 * String is not a primitive data type in java
	 */
	
	/**
	 * local variable
	 * static variable -> class variable
	 * instance variable -> object variable, and is mostly private
	 * public variable 
	 * private variable
	 * protected variable
	 * default values for variables
	 * data types for variables
	 * /
	
	/*
	 * CONSTANT value is declared using final dataType variableName or 
	 * 
	 * static final dataType VariableName;
	 */
	
	//CONSTANT variable with static keyword must be declared outside the scope of static method
	static final int NUMBTWO = 34; // declaration and initialization must happen in same line for static final variable
	static final String LANGUAGE = "JAVA";
	
	public static void main(String []args) {
		String name = "Nabin"; // String = double quote
		int age = 30;
		float weight = 145.0f; // or 145.0F to print it do:- %.2f(so 2 places after decimal point)
		double score = 85;
		boolean booleanValue = true; 
		byte byteValue = 45;
		char letter = 'a';     // char = single quote
		long numberOne = 34;
		short numberTwo = 22;
		
		System.out.printf("All the variables are: %s, %d, %.2f, %f, %S, %s, %s, %d, %d ", name, age,
				 weight, score, booleanValue, byteValue, letter, numberOne, numberTwo);
		System.out.println();
		
		// CONSTANT variables in java
		final int numbOne; // with final you can declare variable and then assign value
		numbOne = 22;
		System.out.println("The final integer variable is " + numbOne + ".");
		
		//static final int numbTwo = 34; // You cannot use static identifier inside static method(here main)
		
		//Display the static final variables  values
		System.out.printf("Static final varibales are: %d, and %s", NUMBTWO, LANGUAGE);
	}
}

