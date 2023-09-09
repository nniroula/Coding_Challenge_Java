package basics;


// when you create a class with a constructor, and constructor has some parameters, then you have to pass those parameters 
// when you instantiate that class
// The Name of the constructor is same as the class Name
// Constructor is a special type of method
// constructor is automatically called when a class is instantiated.

// a class can have more than one constructors

class DifferentConstructors{
	// instance variables -> make them private if possible, if they are public, you can access them
	// from a different class and is not a good practice
	private int num;
	private String languageFramework;
	public String myName = "NKN";
	
	// constructor without a parameter
	public DifferentConstructors() {
		String name = "Nabin";
		System.out.printf("In constructor without argument, my name is %s ", name);
		System.out.println();
	}
	
	// parameterized constructor
	public DifferentConstructors(String str1, String str2){
		System.out.printf("From parameterized constructor... ");
		System.out.println(str1 + " " + str2);
	}
	
	// constructor using 'this' keyword
	public DifferentConstructors(int number, String framework){
		// declare num and languageFramework at class level - before constructor(s)
		this.num = number;
		this.languageFramework = framework;
		System.out.printf("num is %d and framework is %s", this.num, this.languageFramework);
	}
}


public class Constructors {
	public static void main(String []args) {
		// instantiate the ConstructorExample class
		DifferentConstructors dc = new DifferentConstructors();
		
		//parameterized constructor
		String language = "Java";
		String job = "Developer"; 
		DifferentConstructors parameterizedConstructor = new DifferentConstructors(language, job);
	
		// constructor using 'this' keyword
		//NOTE 1 means this.num and Springboot is this.languageFramework in constructor
		DifferentConstructors thisKeyWord = new DifferentConstructors(1, "Springboot");
		
		// accessing instance public varibale - do it?
	
	}
}
