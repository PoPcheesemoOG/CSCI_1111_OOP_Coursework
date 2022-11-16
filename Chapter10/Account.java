/* Name: Paul Helske
 * Date: 11/16/2022
 */

import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated = new Date ();

	Account(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		Date dateCreated = new Date();
	}
	Account(int newId, double newBalance){
		id = newId;
		balance = newBalance;
		annualInterestRate = 0;
		Date dateCreated = new Date();
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

	public String getDateCreated() {
		return dateCreated.toString();
	}

	public double getMonthlyInterestRate(double annualInterestRate) {
		return annualInterestRate / 1200;
	}

	public double getMonthlyInterest(double annualInterestRate, double balance) {
		return getMonthlyInterestRate(annualInterestRate) * balance;
	}

	public void withdraw(double wAmount) {
		this.balance -= wAmount;
	}

	public void deposit(double dAmount) {
		this.balance += dAmount;
	}
}


