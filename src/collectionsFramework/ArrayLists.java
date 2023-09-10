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
	
	public ArrayList<String> removeElements(){
		ArrayList<String> programmingLangs =  addElements();
		// remove items from a given index
		programmingLangs.remove(3);
		return programmingLangs;
	}
}


public class ArrayLists {
	public static void main(String []args) {
		
		// instantiate the ArrayListFromCollections class
		ArrayListFromCollections afc = new ArrayListFromCollections();
		
		// invoke addElements class
		ArrayList<String> langs =  afc.addElements();
		System.out.println(langs);
		
		// removeElements method
		ArrayList<String> prLangs = afc.removeElements();
		System.out.println(prLangs);
		
	}

}
