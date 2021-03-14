package chpt10;

//Intro to Java Programming 10th ed. Y. Daniel Liang

public class Testing {

	public static void main(String[] args) {
		Account acct = new Account(2112,100.00,10.0);
		
		System.out.println("account id: " + acct.getId());
		System.out.println("balance: " + acct.getBalance());
		System.out.println("date created: " + acct.getDateCreated());
		System.out.println("annual int rate: " + acct.getAnnualInterestRate());
		System.out.println("monthly int rate: " + acct.getMonthlyInterestRate());
		System.out.println("monthly int on balance is: " + acct.getMonthlyInterest());
	}

}
