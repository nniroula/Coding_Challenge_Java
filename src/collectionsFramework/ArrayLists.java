package collectionsFramework;
import java.util.ArrayList;

class ArrayListFromCollections{
	
	public ArrayList<String> addElements() {
		ArrayList<String> languages = new ArrayList();
		// add elements to an array list
		languages.add("Java");
		languages.add("C++");
		languages.add("Python");
		languages.add("JavaScript");
		
		return languages;
	}
	
	// remove element from the array list
	public ArrayList<String> removeElements(){
		ArrayList<String> programmingLangs =  addElements();
		// remove items from a given index
		programmingLangs.remove(3);  // 3 is the index
		return programmingLangs;
	}
	
	// update the value in the array list
	public ArrayList<String> updateElement(){
		ArrayList<String> al = new ArrayList<String>();
		al.add("JUnit unit test");
		al.add("Jasmine unit test");
		al.add("Jest unit test");
		al.add("Py test");
		al.add(".NET Entity test");
		
		// removet the .NET Entity test
		//System.out.println(al.indexOf(".NET Entity test"));
		al.remove(al.indexOf(".NET Entity test"));
		
		// update the value with al.set(indnex, newValue) method
		al.set(al.indexOf("Py test"), "Mokito");
		al.set(al.indexOf("Jest unit test"), "Mocha");
		
		return al;
	}
	
	// find the index of array list element
	public int getIndexOfArrayListElement() {
		ArrayList<String> dbs = new ArrayList<String>();
		dbs.add("PostgreSQL");
		dbs.add("MySQL");
		dbs.add(1, "DynamoDB"); // at index 1, add DynamoDB
		
		// find an index of the element
		return dbs.indexOf("DynamoDB");
	}
	
	// if array list contains an element
	public boolean searchElement() {
		ArrayList <Integer> al = new ArrayList<>();
		for(int i = 0; i < 6; i++) {
			al.add(i);
		}
		
		boolean alHasElem = al.contains(4); // returns true
		return alHasElem;
	}
	
	// compare two array lists
	
	// access an element in array list
	
	
	
	
}


public class ArrayLists {
	public static void main(String []args) {
		
		// instantiate the ArrayListFromCollections class
		ArrayListFromCollections alfc = new ArrayListFromCollections();
		
		// invoke addElements class
		ArrayList<String> langs =  alfc.addElements();
		System.out.println(langs);
		
		// removeElements method
		ArrayList<String> prLangs = alfc.removeElements();
		System.out.println(prLangs);
		
		//updateElement method
		ArrayList<String> updatedAL= alfc.updateElement();
		System.out.println(updatedAL);
		
		//getIndexOfArrayListElement method
		int index = alfc.getIndexOfArrayListElement();
		System.out.printf("Index of DynamoDB database is %d ", index);
		System.out.println();
		
		// searchElement method
		boolean result1 = alfc.searchElement();
		System.out.println(result1);
		
	}

}
