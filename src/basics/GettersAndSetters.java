package basics;

// getters and setters work on private variables(or instance variables).
class GetAndSetValues{
	private String status;
	private String level;
	public GetAndSetValues(String status, String level){
		this.status = status;
		this.level = level;
	}
	
	// getter or accessor method
	/*
	 * getter method does not take parameter. It uses 'this' keyword to reference instance variable
	 * getter method is used by another class to access this class's private variable
	 */
	public String getStatus() {
		return this.status;
	}
	
	public String getLevel() {
		return this.level;
	}
	
	//setter or mutator method
	/*
	 * setter is used to update the value of instance variable(object variable) 
	 * it is used by method in another class
	 * it takes parameter, but returns nothing
	 */
	public void setStatus(String stat) {
		this.status = stat;
	}
	
	public void setLevel(String gradLevel) {
		this.level = gradLevel;
	}
}

	
public class GettersAndSetters {
	public static void main(String[]args) {
		// instantiate GetAndSetValues class
		GetAndSetValues gsv = new GetAndSetValues("Student", "MS");
		String level = gsv.getLevel();
		System.out.println("Original level is " + level);
		
		// change level to PhD.
		gsv.setLevel("PhD");
		String updatedLevel = gsv.getLevel();
		System.out.println("Updated level is " + updatedLevel);
	}
}
