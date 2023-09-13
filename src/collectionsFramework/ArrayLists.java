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
	public boolean comapreTwoArrayLists(ArrayList<Integer> al1, ArrayList<String> al2) {
//		if(al1.size() == 0 || al2.size() == 0) {
//			return false;
//		}else {
//			if(al1.equals(al2)) {
//				return true;
//			}
//		}
//		return false;
		return al1.equals(al2);
	}
	
	// access an element in array list
	public void accessElementInAL(ArrayList<String> al) {
		System.out.println("ArrayList elements are...");
		for(int i = 0; i<al.size(); i++) {
			System.out.println("	" + al.get(i));
		}
	}
	 
	// size of an array list
	public int getArrayListSize(ArrayList<Boolean> al) {
		return al.size();
	}
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
		
		//comapreTwoArrayLists method
		ArrayList<Integer> arList1 = new ArrayList<>();
		ArrayList<Integer> arList2 = new ArrayList<>();
		
		//accessElementInAL method
		ArrayList<String> stringAL = new ArrayList<String>();
		stringAL.add("Coding");
		alfc.accessElementInAL(stringAL);
		
		//getArrayListSize method
		ArrayList<Boolean> booleanAL1 = new ArrayList<>();
		int size1 = alfc.getArrayListSize(booleanAL1);
		System.out.printf("The size of the arrayList is %d ", size1);
		System.out.println();
		
		ArrayList<Boolean> booleanAL2 = new ArrayList<>();
		booleanAL2.add(false);
		booleanAL2.add(true);
		int size2 = alfc.getArrayListSize(booleanAL2);
		System.out.printf("The size of second arraylist is %d ", size2);
		System.out.println();
		
		
	}

}
