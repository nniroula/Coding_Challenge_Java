package collectionsFramework;
import java.util.LinkedList;

class LinkedListMethods{
	// create linked list and add elements
	public LinkedList<String> addElements() {
		LinkedList<String> ll = new LinkedList<>();
		// add elements to linkedlist
		ll.add("University of Colorado Denver");
		ll.addFirst("MSU Denver");
		ll.addLast("CCA");
		return ll;
	}
	
	// remove elements from linked list
	public LinkedList<Integer> removeElements(LinkedList<Integer> llInteger){
		//		for(int i = 0; i< llInteger.size(); i++) {
		//			llInteger.remove(i);
		//		}
		llInteger.removeFirst();
		llInteger.removeLast();
		return llInteger;
	}
	
	// get the size of the linked list element
	public int getSize(LinkedList<Character> ch) {
		return ch.size();
	}
	
	// access an element in the linked list
	public double getElement(LinkedList<Double> llD) {
		double element = llD.get(1);
		return element;
	}
	
}

public class LinkedLists {
	public static void main(String[]args) {
		System.out.println("This is a linked list learning...");
		
		// instantiate the LinkedListMethods class
		LinkedListMethods llObject = new LinkedListMethods();
		
		// addElements
		LinkedList<String> llString = llObject.addElements();
		System.out.println(llString);
		
		// removeElements
		LinkedList<Integer> llInt = new LinkedList<>();
		llInt.add(1);
		llInt.addFirst(0);
		llInt.addFirst(-1);
		llInt.add(1, 37);
		LinkedList<Integer> llInteger = llObject.removeElements(llInt);
		System.out.println(llInteger);
		
		// getSize method
		LinkedList<Character> ch = new LinkedList<>();
		ch.addFirst('N');
		ch.addLast('n');
		ch.add(1, 'a');
		ch.add(2, 'b');
		ch.add(3, 'i');
		int size = llObject.getSize(ch);
		System.out.printf("Length of linked list is %d ", size);
		System.out.println();
		
		//getElement
		LinkedList<Double> llD = new LinkedList<>();
		llD.add(2.5);
		llD.addFirst(0.5);
		llD.addLast(9.9999);
		double number1 = llObject.getElement(llD);
		System.out.println(number1);
		
	}
}
