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
	
	public int findMinValue(int arr[]) {
		// if an array is empty
		if(arr.length == 0) {
			return Integer.MIN_VALUE;  // property in Integer class
		}
		int minValue = arr[0];
		for(int arrayElement : arr) {      // for each loop
			if(arrayElement < minValue) {
				minValue = arrayElement;
			}
		}
		return minValue;
	}
	
	//public String[] addRemoveUpdateElement(String arr1[]) {
	public String[] addRemoveUpdateElement() {
		String languages[] = new String[5];
		// add elements
		languages[0] = "Java";
		languages[1] = "JS";
		languages[2] = "Py";
		languages[3] = "C++";
		languages[4] = "C";
		// update an element
		languages[1] = "C#";
		return languages;
	}
	
	// array methods and properties
	public String[] arrayMethodsAndProperties() {
		String frameworks[] = new String[5];
		frameworks[0] = "Spring";
		frameworks[1] = "Springboot";
		frameworks[2] = "JDBC";
		frameworks[3] = "Hibernate";
		frameworks[4] = "Mokito";
		
		// make copies of array with Arrays.copyOf() method
		// compare two arrays with Arrays.equals(arr1, arr2) method
		
		return frameworks;
	}
}

	



public class ArraysInJava {
	public static void main(String []args) {
		// instantiate OneDimesionalArray class
		OneDimensionalArray oneDArray = new OneDimensionalArray();
		String resultantOneDArray[] = oneDArray.getProgrammingLanguages();
		System.out.println(Arrays.toString(resultantOneDArray));
		
		// findMinValue method
		int arr1[] = {5, -6, 3, -2};
		int arr2[] = {};
		int minimumValue = oneDArray.findMinValue(arr2);
		if(minimumValue == Integer.MIN_VALUE) {
			System.out.println("Array is empty!");
		}else {
			System.out.printf("Minimum value is %d", minimumValue);
		}
		
		// addRemoveUpdateElement method
		String[] strArray = oneDArray.addRemoveUpdateElement();
		System.out.println(Arrays.toString(strArray));
		
		//arrayMethodsAndProperties method
		String backendTools [] = oneDArray.arrayMethodsAndProperties();
		System.out.println(Arrays.toString(backendTools));
	}
}
