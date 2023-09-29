package basics;
/**
 * For method overriding, you have to use inheritance, and override method in sub class
 */
class ParentClass{
	public String getLanguage() {
		return "Java";
	}
}

class ChildClass extends ParentClass{
	@Override
	public String getLanguage() {
		return "Java Full Stack Developmnt " + "Progamming.";
	}
}

public class MethodOverriding {
	// main method
	public static void main(String[]args) {
		// parent class
		ParentClass pc = new ParentClass();
		System.out.println(pc.getLanguage());
		
		// child class
		ChildClass cc = new ChildClass();
		System.out.println(cc.getLanguage());
	}
}
