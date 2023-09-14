package collectionsFramework;
import java.util.Stack;

class StackMethods{
	// add elements to the stack
	public Stack<Integer> addElements(){
		Stack<Integer> stackInt = new Stack<>();
		stackInt.push(24);
		stackInt.push(05);
		stackInt.add(2, 1987);
		return stackInt;
	}
}

public class Stacks {
	public static void main(String []args) {
		
		// instantiate the class
		StackMethods stkMethods = new StackMethods();
		
		// invoke addElements method
		Stack<Integer> stkInt = stkMethods.addElements();
		System.out.println(stkInt);
		
	}
}
