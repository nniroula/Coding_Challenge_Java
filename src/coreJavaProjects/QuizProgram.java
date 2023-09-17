package coreJavaProjects;

import java.util.HashMap;
import java.util.Scanner;

/*
 * ALgorithm
 * keep answers in hashMap, check if user input is correct and display score
 */

// this class creates methods for questions and answers
class QuizProgramQuestions {
	// create private variables and questions and answers
	private String question;
	private String answer;
	
	/*
	 * constructor with empty question and answer
	 */
	public QuizProgramQuestions() {
		question = "";
		answer = "";
	}
	
	// key value pair of the question and answer, use this to generate questions in another class
	public HashMap<String, String> getQandA(){
		HashMap<String, String> qAnda = new HashMap<>();
		qAnda.put("Who is the Java Inventor?", "James Gosling");
		//qAnda.put("What is the output of '1' + '1' in java?", "11");
		//qAnda.put("What is an Integer?", "Wrapper class");
		return qAnda;
	}
	
	// set question
	public void setQuestion(String questionText) {
		this.question = questionText;
	}
	
	// set answer
	public void setAnswer(String ans) {
		this.answer = ans;
	}
	
	//check if the answer is correct
	public boolean checAnswer(String response) {
		return answer.equals(response);          // answer though private is in the same class
	}
	
	// display the question
	public void askQuestion() {
		System.out.println(question);
	}
} 



// public class
public class QuizProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// instantiate the question class
		QuizProgramQuestions quizObject = new QuizProgramQuestions();
		
		// method calls
		
		// getQandA method
		quizObject.getQandA();
		
		//askQuestion method
		quizObject.askQuestion();
		// get user input
		System.out.println("Type your answer: ");
		String userInput = sc.nextLine();
		
	}
}
