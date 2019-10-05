package Chpt10;

import java.util.Date;
//just a test
public class Account {
	private int id = 0;
	private double balance = 0.0;
	private double annualInterestRate = 0.0;
	private Date dateCreated;
	//dateCreated = new java.util.Date();
	
	public Account() {
//		this.id = 0;
//		this.balance = 0.0;
		this.dateCreated = new Date();
	}
	
	public Account(int id_x, double balance_y, double annualIntRate_z ) {
		this();
		this.id = id_x;
		this.balance = balance_y;
		this.annualInterestRate = annualIntRate_z;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		return (annualInterestRate / 100) / 12;
	}
	
	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}
	
	
}
