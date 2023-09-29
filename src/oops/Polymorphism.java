package oops;
/**
 * To demonstrate Polymorphism, create class A, class B, class C
 * In class C, create a method name d( d(A a) ) that accepts class A object as its parameter
 * When you invoke d, pass class B object to it. This is Polymorphism.
 */

class BankAccount{
	public String getAccountName() {
		return "Checking";
	}
}

class Savings extends BankAccount{
	public double getSavingTotal() {
		return 22000.00;
	}
}

class AccountDetails{
	public String getBankInfo(BankAccount ba) {
		return ba.getAccountName();
	}
}

public class Polymorphism {
	
	public static void main(String[]args) {
		System.out.println("Polymorphism in java...");
		
		// instantiate all classes
		BankAccount ba = new BankAccount();
		Savings sav = new Savings();
		AccountDetails ad = new AccountDetails();
		// invoke getBankInfo but using child class's object
		String accountType = ad.getBankInfo(sav); // expect parent class object, but give child class object
		System.out.println(accountType);  // Polymorphism
	}
}
