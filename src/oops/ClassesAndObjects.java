package oops;

//create a class and instantiate it in public class
class ProgrammingLanguages{
	//public static String getLanguages() { // works
	//public String getLanguages() { // works
	String getLanguages() { // only return type and function name
		System.out.println("This is from class to be instantiated...");
		return "Languages are Java, JavaScript, Python, and C++.";
	}
}

public class ClassesAndObjects {
	public static void main(String[] args) {
		// Instantiate the ProgrammingLanguages class - means create its object
		ProgrammingLanguages pl = new ProgrammingLanguages();
		String result1 = pl.getLanguages();
		System.out.println(result1);
	}
}