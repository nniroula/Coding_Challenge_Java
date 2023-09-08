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
	
	// common array algorithms
	
	//1. Filling an array
	//Q fill the array with first 5 perfect square numbers
	public int[] fillArrayWithPerfectSquares() {
		final int LENGTH = 5;
		int arrayOfSquares[] = new int[LENGTH];
		for(int i = 0; i<LENGTH; i++) {
			arrayOfSquares[i] = i*i;
		}
		return arrayOfSquares;
	}
	
	//2. Sum of the array
	public double getSumOfArrayElem(double arr[]) {
		double sum = 0.0;
		if(arr.length == 0) {
			return -1;
		}else {
			for(double element: arr) {
				sum += element;
			}
		}
		return sum;
	}
	
	//3. Average of the array elements
	public double getAveargeOfArrayElems(int arr2[]) {
		double average = 0;
		int sum = 0;
		if(arr2.length == 0) {
			return -1;
		}else {
			for(int element: arr2) {
				sum += element;
			}
		}
		average = (double)sum/arr2.length;
		return average;
	}
	
	//4. removing array elements
	// to remove an element, move one index position down from the right of the element to be removed
	public String[] removeElem(String strs[]) {
		// remove third element
		for(int i = 2; i< strs.length - 1; i++) { // third element= index 2
			strs[i] = strs[i + 1];
			strs[i + 1] = null;
		}
		return strs;
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
		
		//fillArrayWithPerfectSquares
		int resultantArray [] = oneDArray.fillArrayWithPerfectSquares();
		System.out.println(Arrays.toString(resultantArray));
		
		// getSumOfArrayElem
		double array1[] = {1.0, 4.4, 8.5};
		double arraySum = oneDArray.getSumOfArrayElem(array1);
		System.out.printf("Sum of array elements is %.2f", arraySum);
		System.out.println();
		
		//getAveargeOfArrayElems
		int arr[] = {2, 4, 5, 8, 9};
		double avg = oneDArray.getAveargeOfArrayElems(arr);
		System.out.printf("The average of the array elements is %.3f", avg);
		System.out.println();
		
		//removeElem
		String langs[] = {"Java", "HTML", "CSS", "JS"};
		String resultantStringArray[] = oneDArray.removeElem(langs);
		System.out.println(Arrays.toString(resultantStringArray));
	}
}
