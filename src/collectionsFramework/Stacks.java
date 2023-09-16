package collectionsFramework;
import java.util.Stack;


/*
 * In stack, you add from one end(push) and remove from another end(pop)
 */
class StackMethods{
	// add elements to the stack
	public Stack<Integer> addElements(){
		Stack<Integer> stackInt = new Stack<>();
		stackInt.push(24);
		stackInt.push(05);
		stackInt.add(2, 1987);
		return stackInt;
	}
	
	// remove element from stack
	public Stack<Character> removeElement(){
		Stack<Character> ch = new Stack<>();
		// add element to the stack
		ch.push('J');
		ch.push('A');
		ch.push('V');
		ch.push('A');
		ch.push('S');
		// remove element from the stack
		ch.pop(); // removes last element
		return ch;
	}
	
	// if stack contains an element
	public boolean getElement() {
		Stack<Double> stack = new Stack<>();
		stack.push(2.0);
		stack.push(8.9999);
		if(stack.contains(36.5)) {
			return true;
		}
		return false;
	}
	
	// if stack is empty
	public String isStackEmpty(Stack<String> stack) {
		if(stack.isEmpty()) {
			return "Stack is Empty";
		}
		return "Stakc is Not empty";
	}
	
	// size or length of stack
	public int getSize(Stack<Double> stack) {
		stack.push(2.4);
		stack.push(3.5);
		stack.push(8.7);
		return stack.size();
	}
	
	// access elements in stack
	
	
	// iterate elements in stack
}

public class Stacks {
	public static void main(String []args) {
		
		// instantiate the class
		StackMethods stkObject = new StackMethods();
		
		// invoke addElements method
		Stack<Integer> stkInt = stkObject.addElements();
		System.out.println(stkInt);
		
		// removeElement method
		Stack<Character> ch = stkObject.removeElement();
		System.out.println(ch);
		
		//getElement method
		boolean result = stkObject.getElement();
		System.out.printf("The boolean result is %b", result);
		System.out.println();
		
		//isStackEmpty method
		Stack<String> stack = new Stack<>();
		
		String output = stkObject.isStackEmpty(stack);
		System.out.println(output);
		
		// getSize method
		// NOTE: this call of size method with stack variable is not legal though works
		Stack<Double> doubleStack = new Stack<>();
		
		int size = stkObject.getSize(doubleStack);
		System.out.printf("The size of the stack is %d", size);
		System.out.println();
		
	}
}
