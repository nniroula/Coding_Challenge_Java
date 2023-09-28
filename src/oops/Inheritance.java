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
	// constructor}
	public String accessPrivateVariableInParentClass() {
		// call getters to access private variables, but won't work b/c variables are private
		// user super to access the private variable
		// String name = getName(); does not work to access private variable
		String name = super.getName();
		return name;
	}
}


public class Inheritance {
	public static void main(String []args) {
		System.out.println("Inheritence in java...");
		
		// instantiate the MoroCycle class
		MotorCycles mc = new MotorCycles();
		// methods in child class
		String name = mc.accessPrivateVariableInParentClass(); // has null value
		System.out.println(name);
		
		// to access private values using getters
	}
}
