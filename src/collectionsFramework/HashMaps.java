package collectionsFramework;
import java.util.HashMap;


// HashMap is like object in javaScript
class HashMapsBasics{
	public HashMap<Integer, String> addElement() {
		HashMap<Integer, String> hmOne = new HashMap<>();
		hmOne.put(1, "Coding");
		hmOne.put(2, "Programming");
		hmOne.put(3, "Software Engineering");
		hmOne.put(7, "Software Developer");
		return hmOne;
	}
	
	// remove element from HashMap
	public HashMap<Integer, String> removeElement(){
		HashMap<Integer, String> hmTwo = addElement();
		hmTwo.remove(7);
		return hmTwo;
	}
	
	// access element in hashMap
	public String accessElement(){
		HashMap<String, String> hmString = new HashMap<>();
		hmString.put("Java", "Springboot");
		hmString.put("Java ds tool", "Hibernate");
		String value = hmString.get("Java");
		return value;
	}
	
	// get size of hash map
	public int getSize(HashMap<Double, Boolean> hmDB) {
		return hmDB.size();
	}
}


public class HashMaps {
	public static void main(String[]args) {
		// instantiate the class
		HashMapsBasics hmBasics = new HashMapsBasics();
		
		// addElement method
		HashMap<Integer, String> hmOne = hmBasics.addElement();
		System.out.println(hmOne);
		
		// removeElement method
		HashMap<Integer, String> hmTwo = hmBasics.removeElement();
		System.out.println(hmTwo);
		
		//accessElement method
		String hmString = hmBasics.accessElement();
		System.out.println(hmString);
		
		// getSize method
		HashMap<Double, Boolean> hmDB = new HashMap<>();
		hmDB.put(1.4, false);
		hmDB.put(2.5, true);
		int size = hmBasics.getSize(hmDB);
		System.out.printf("The size of the hashMap is %d ", size);
		System.out.println();
	}
}
