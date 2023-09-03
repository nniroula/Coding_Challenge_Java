package coreJavaProjects;
import java.util.Scanner;

/*
 * Requirements
 * generate a random number using c mputer
 * Ask user for input
 * compare those two numbers
 * 		- if bigger -> display message, get another user input
 * 		- if smaller -> display message, get another user input
 * 		- if both are equal -> display win message
 * 		- show total attempts taken
 */

class ComputerGeneratedRandomNumber{
	public int generateRandomNumber() {
		// Math.random() generates double number
		//int randomNumber = (int)Math.random();
		//return randomNumber;
		double randomDouble = Math.floor(Math.random()*10);
		int randomInt = (int)randomDouble;
		return randomInt;
	}
}

class PlayGame{
	Scanner sc = new Scanner(System.in);
	ComputerGeneratedRandomNumber randomNum = new ComputerGeneratedRandomNumber();
//	int currentRandomNum = randomNum.generateRandomNumber();
//	System.out.printf("Computer number = %d", currentRandomNum);
	
//	public String playGame(int number) {
	public void playGame() {
		int currentRandomNum = randomNum.generateRandomNumber();
		System.out.printf("Computer number = %d", currentRandomNum);
		System.out.println();
		
//		System.out.println("Enter a number between 0 and 10: ");
//		int userInput = sc.nextInt();
		
		int maxAttempt = 10; // b/c 0 - 9 = 10 numbers
		int minAttempt = 0;
		System.out.println("Enter a number between 0 and 10: ");
		int userInput = sc.nextInt();
		minAttempt += 1;
		while(minAttempt <= 10) {
			//System.out.println("Enter a number between 0 and 10: ");
			//int userInput = sc.nextInt();
			
			if(userInput < currentRandomNum) {
				System.out.println("little bit small");
				System.out.print("Enter number again: ");
				//System.out.println();
				userInput = sc.nextInt();
				minAttempt += 1;
			}else if(userInput > currentRandomNum) {
				System.out.println("little big");
				System.out.print("Enter number again: ");
				//System.out.println();
				userInput = sc.nextInt();
				minAttempt += 1;
			}else if(userInput == currentRandomNum) {
				System.out.println("You win!!!");
				break;
			}else {
				System.out.println("Invalid number!");
				System.out.print("Enter number again: ");
				//System.out.println();
				userInput = sc.nextInt();
			}
		}
		System.out.printf("you took %d attemps. ", minAttempt);
		System.out.println();
		if(minAttempt > 10) {
			System.out.println("You reached maximum allowd attempts!");
		}
		
		//return "You won it!";
	}
}

public class GuessANumberGame {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		// instantiate the ComputerGeneratedRandomNumber class
		/**
		ComputerGeneratedRandomNumber randomNum = new ComputerGeneratedRandomNumber();
		int result1 = randomNum.generateRandomNumber();
		System.out.println(result1);
		*/
		
		// instantiate PlayGame class
		PlayGame pg = new PlayGame();
		pg.playGame();
//		System.out.println("Do you wanna play again[y/n]? : ");
//		String userInterest = sc.next();
		int count = 1;
		while(count < 4) {
			System.out.println("Do you wanna play again[y/n]? : ");
			String userInterest = sc.next();
			if(userInterest.equalsIgnoreCase("n")) {
				System.out.println("You can play next time!");
				break;
			}
			else if(userInterest.toLowerCase().equals("y")) {
				pg.playGame();
				count += 1;
			}else {
				System.out.println("Invalid entry. Try again.");
//				System.out.println("Do you wanna play again[y/n]? : ");
//				userInterest = sc.next();
			}
		}
		if(count >= 4) {
			System.out.println("No options to play again. You already palyed 4 times!");
		}
	}
}
