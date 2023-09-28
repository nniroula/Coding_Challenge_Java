package basics;

// method overloading in java
public class MethodOverloading {
	public static String returnName() {
		return "Nabin";
	}

	public static String returnName(String name) {
		return name;
	}
	public static void main(String[]args) {
		System.out.println("Method overloading...");
		
		// method before it is overloaded
		System.out.println(returnName());
		// method after it is overloaded
		System.out.println(returnName("Pabitra"));
	}
}
