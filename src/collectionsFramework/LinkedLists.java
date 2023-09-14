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
	}
}
