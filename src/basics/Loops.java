package basics;

class DifferentLoops{
	public void tradidtionForLoop() {
		for(int i = 0; i< 10; i++) {
			System.out.println(i);
		}
	}
	
	// while loop
	void getWhileLoop() {
		int count = 1;
		while(count < 6) {
			System.out.println("Language is JAVA!!!");
			count += 1;
		}
	}
	
	// enhanced for loop OR forEach loop
	
	// do- while loop
}
	
	
public class Loops {
	public static void main(String args[]) {
		// instantiate DifferentLoop class
		DifferentLoops dl = new DifferentLoops();
		
		// traditionalForLoop method
		dl.tradidtionForLoop(); 
		
		// while loop method
		dl.getWhileLoop();
	}
}
