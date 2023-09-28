package oops;
import java.util.ArrayList;
import java.util.HashMap;

class Vehicles{
	private int age = 34;
	private String name = "RAV4";
	
	public int getAge() {
		return this.age;
	}
	
	public String getName() {
		return this.name;
	}
	
	// override this in motorcyle class
	public int wheels() {
		return 4;
	}
}
 
class MotorCycles extends Vehicles{
	// access private variable name
	public String accessPrivateVariableName() {
		// call getters to access private variables, but won't work b/c variables are private
		// user super to access the private variable
		// String name = getName(); does not work to access private variable
		String name = super.getName();
		return name;
	}
	
	// access private variable age
	public void getPrivateVariableAge() {
		int age = super.getAge();
		System.out.printf("Private variable age is %d", age);
		System.out.println();
	}
	
	// override the method
	@Override
	public int wheels() {
		return 2;
	}
}

// parent and child classes with constructors
class Parent{
	private String title = "Software Engineer";
	private double salary = 106400.00;
	final static double BONUS = 8000.00; // static = class variable, final = constant
	//public static String person = "Nabin"; // works fine to call in main method
	//String person = "Nabin";       // cannot call it in main method
	// public String person = "Nabin"; // static is need to be accessed in static method main
	static String person = "Nabin";     // static is needed to tell it is a class level variable
	Parent(String language, String tool){
		System.out.println("Parent class...");
		System.out.printf("    Language is %s and tool is %s.", language, tool);
		System.out.println();
	}
	// methods to get and set those private variables
	// get title
	public String getTitle() {
		String jobTitle = this.title;
		return jobTitle;
	}
	//set title
	public void setTitle(String newTitle) {
		this.title = newTitle;
	}
	
	// get salary
	public double getSalary() {
		double jobSalary = this.salary;
		return jobSalary;
	}
	// set new salary
	public void setSalary(double newSalary) {
		this.salary = newSalary;
	}
	
	// get constant value, also access this in child class
	public double getBonus() {
		return this.BONUS;
	}
	
	// method to be overridden in child class
	public void getIterable(){
		ArrayList<Integer> al = new ArrayList<>();
		al.add(36);
		al.add(2);
		al.add(34);
		al.add(9);
		System.out.println(al);
	}
}

class Child extends Parent{
	Child(){
		// call and instantiate the parent class constructor
		// parent constructor is Parent(String language, String tool)
		
		//super(); // this does not work b/c you have to initialize parent constructor
		super("JavaScript", "ExpressJS");   //works
		System.out.println();
		System.out.println("Two lines above are from Parent classs constructor called in child class!");
		System.out.println("======================");
		System.out.println();
		System.out.println("Child class...");
	}
	
	// override super class method's implementation to return hashMap instead of ArrayList
	@Override
	public void getIterable(){
		HashMap<String, String> hmString = new HashMap<>();
		hmString.put("Role", "Junior Java Developer");
		hmString.put("Experience", "2+ years");
		hmString.put("Preferred Salary", "80K");
		hmString.put("Location", "Both onside & remote");
		System.out.println(hmString);
	}
	
	// call parent class methods with super keyword, it's the same method name
	public double getSalary() {
		double wage = super.getSalary();
		return wage;
	}
		

}

 
public class Inheritance {
	public static void main(String []args) {
		System.out.println("Inheritence in java...");
		
		// instantiate the MoroCycle class
		MotorCycles mc = new MotorCycles();
		// methods in child class
		String name = mc.accessPrivateVariableName(); // has null value
		System.out.println(name);
		
		// to access private variable age using getters
		mc.getPrivateVariableAge();  // do not store it in a variable b/c its void type
		
		/* Parent class */
		// check if the variables and methods in parent class are callable
		Parent parentObject = new Parent("Java", "JDBC");
		// get title, get salary and get bonus
		String job = parentObject.getTitle();
		System.out.printf("    Job title in constructor is %s ", job);   // 4 spaces, not tab
		System.out.println();
		//now, change the title
		parentObject.setTitle("Java Developer");
		//check if the title is updated properly
		String secondJob = parentObject.getTitle();
		System.out.printf("    Updated job title is %s ", secondJob);
		System.out.println();
		
		// retrieve the BONUS variable calling the method and also without calling the method
		double bonus = parentObject.getBonus();
		System.out.printf("    bonus is %.3f", bonus); // .3f shows 3 decimal places
		System.out.println();
			//access public instance variable on a class, you must store it in a variable to access it
		String person = Parent.person;
		System.out.printf("    Parent class variable value is %s ", person);
		System.out.println();
		
		/**
		 * Child class
		 */
		// instantiate child class
		Child childObject = new Child(); // it has super constructor initialized
		
		// invoke the method from parent class before it was overridden in child class
		System.out.println("In Parent iterable was...");
		parentObject.getIterable();
		// invoke overridden method of the child class
		System.out.println("In Child iterable is...");
		childObject.getIterable();
		
		// invoke child class getSalary method
		double childClassSalary = childObject.getSalary();
		System.out.printf("Salary in child class is %.3f ", childClassSalary);
		System.out.println();
		
	}
}
