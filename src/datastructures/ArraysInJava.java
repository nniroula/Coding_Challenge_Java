package datastructures;
import java.util.Arrays;

// array declaration and initialization
// 1D arrays
// 2D arrays
// multidimensional arrays
// array methods

/*
 * Array declaration :- dataType arrayName[] = new dataType[length of array]
 * 
 * Array Initialization:- dataType arrayName[] = { elements };
 * 
 * To Print array :- Arrays.toString(arrayName); OR use loop
 * 
 * 
 */

// NOTE: when you declare a method, your return type must be an array

// one D arrays
class OneDimensionalArray{
	public String[] getProgrammingLanguages() {
		String languages[] = {"Java", "Python", "JavaScript" };
		// you cannot directly return arrays. Use built-in function to return arrays
		//ArraysInJava.toString(languages);
		//System.out.println(languages);
		return languages;
	}
}



public class ArraysInJava {
	public static void main(String []args) {
		// instantiate OneDimesionalArray class
		OneDimensionalArray oneDArray = new OneDimensionalArray();
		String resultantOneDArray[] = oneDArray.getProgrammingLanguages();
		System.out.println(Arrays.toString(resultantOneDArray));
	}
}
