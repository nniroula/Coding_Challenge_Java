package Algorithms;

/*
 * Worst case time complexity for linear search is O(n)
 * Best case time complexity is O(1) - or constant time
 */

/*
 * QUESTION 1: if item is found in an array, return found, else return not found
 * QUESTION 2: if character is not found in a String, do the same thing
 */
public class LinearSearch {
	public static int findElement(int []numbers, int target) {
		int index = -1;
		if(numbers.length == 0) {
			return -1;
		}
		for(int i = 0; i< numbers.length; i++) {
			if(target == numbers[i]) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public static int findCharInString(String str, char ch) {
		int index = -1;
		if(str.isEmpty() == true) {
			return -1;
		}else {
			for(int i = 0; i< str.length(); i++) {
				if(str.charAt(i) == ch) {
					index = i;
					break;
				}
			}
		}
		return index;
	}
	
	/* 
	 * O(n) for time complexity
	 * O(n) for space complexity
	 */
	
	public static void main(String []args) {
		int arr1 [] = {2, 4, 6, 8};
		int arr2 [] = {};
		int indexValue = findElement(arr2, 7);
		if(indexValue == -1) {
			System.out.println("Not Found");
		} else {
			System.out.printf("Found at index %d. ", indexValue);
		}
		
		// findCharInString method
		String str1 = "Java";
		char c1 = 'a';
		char c2 = 'n';
		//int charIndex = findCharInString(str1, c1);
		int charIndex = findCharInString(str1, c2);
		
		if(charIndex == -1) {
			System.out.println("Character not found in the string.");
		}else {
		System.out.println("Character is found at index " + charIndex);
		}
	}
}
