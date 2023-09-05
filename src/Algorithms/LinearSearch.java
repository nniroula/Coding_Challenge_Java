package Algorithms;

/*
 * Worst case time complexity for linear search is O(n)
 * Best case time complexity is O(1) - or constant time
 */

/*
 * QUESTION: if item is found in an array, return found, else return not found
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
	}
}
