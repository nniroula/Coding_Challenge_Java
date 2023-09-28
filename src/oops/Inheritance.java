package oops;

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
	@override
	public int wheels() {
		return 2;
	}
}

// parent and child classes with constructors
class Parent{
	private String title = "Software Engineer";
	private double salary = 106400.00;
	final static double BONUS = 8000.00; // static = class variable, final = constant
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
	
	// get constant value, also access this in child class without call this method
	public double getBonus() {
		return this.BONUS;
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
		
	}
}
