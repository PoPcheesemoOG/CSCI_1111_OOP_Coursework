/* Name: Paul Helske
 * Date: 02/16/2023
 */
package vingo;

import java.util.Date;

public class Bingo {

	public static void main(String[] args) {
		Account Acc1 = new Account(1122, 20000);
		Acc1.setAnnualInterestRate(4.5);
		System.out.println("Account Details:");
		System.out.println("Id: " + Acc1.getId());
		System.out.println("Balance: " + Acc1.getBalance());
		System.out.println("Interest rate: " + Acc1.getAnnualInterestRate());
		System.out.println("Date: " + Acc1.getDateCreated());
		System.out.println("Monthly interest: " + Acc1.getMonthlyInterest(
				Acc1.getAnnualInterestRate(),Acc1.getBalance()) + "\n");
		
		System.out.println("Using toString method...");
		Acc1.toString();
		
		System.out.println("\nWithdrawing 2500...\n");
		Acc1.withdraw(2500);
		System.out.println("New balance: " + Acc1.getBalance());
		System.out.println("\nDepositing 3000...\n");
		Acc1.deposit(3000);
		Acc1.balance = 5;
		System.out.println("New balance: " + Acc1.getBalance() + "\n\n");
		CheckingsAccount CA1 = new CheckingsAccount();
		System.out.println("Account Details:");
		System.out.println("Id: " + CA1.getId());
		System.out.println("Balance: " + CA1.getBalance());
		System.out.println("Interest rate: " + CA1.getAnnualInterestRate());
		System.out.println("Date: " + CA1.getDateCreated());
		System.out.println("Overdraft Limit: " + CA1.getOverdraftLimit());
		CA1.setBalance(1000);
		System.out.println("\nNew Balance: " + CA1.getBalance());
		System.out.println("Withdrawing 800...");
		CA1.withdraw(800);
		System.out.println("\nNew Balance: " + CA1.getBalance());
		System.out.println("Withdrawing 400...");
		CA1.withdraw(400);
		System.out.println("\nNew Balance: " + CA1.getBalance());
		CA1.withdraw(1000);
		CA1.toString();
		SavingsAccount SA1 = new SavingsAccount();
		SA1.setBalance(100);
		SA1.toString();
		SA1.withdraw(150);
		
	}

}
class Account{
	private int id;
	protected double balance;
	private double annualInterestRate;
	private Date dateCreated = new Date ();
	
	Account(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		Date dateCreated = new Date();
		
	}
	Account(int id, double newBalance){
		this.id = id;
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
	
	public String toString() {
		System.out.println("Account Details:");
		System.out.println("Id: " + id);
		System.out.println("Balance: " + balance);
		System.out.println("Interest rate: " + annualInterestRate);
		System.out.println("Date: " + dateCreated + "\n");
	return "";
	}
}

class CheckingsAccount extends Account{
	private double OverdraftLimit;
	CheckingsAccount(){
		OverdraftLimit = 500;
	}
	CheckingsAccount(double newOverdraftLimit){
		this.OverdraftLimit = newOverdraftLimit;
	}
	public void setOverdraftLimit(double newOverdraftLimit) {
		this.OverdraftLimit = newOverdraftLimit;
	}
	public double getOverdraftLimit() {
		return OverdraftLimit;
	}
	public void withdraw(double wAmount) {
		if (wAmount <= balance == true) {
			balance -= wAmount;
		} else {
			if (wAmount > (balance + OverdraftLimit) ) {
				System.out.println("The withdrawal amount is more than is approved.\n");
			} else {
				this.balance -= wAmount;
			}
		}
	}
	public String toString() {
		System.out.println("Checking Account Details:");
		System.out.println("Id: " + getId());
		System.out.println("Balance: " + getBalance());
		System.out.println("Interest rate: " + getAnnualInterestRate());
		System.out.println("Date: " + getDateCreated());
		System.out.println("Overdraft limit is: " + OverdraftLimit + "\n");
		return "";
	}
}

class SavingsAccount extends Account{
	SavingsAccount(){}
	
	public void withdraw(double wAmount) {
		if (wAmount > balance == true) {
			System.out.println("The withdrawal amount is more than is approved.\n");
		}
		else {
			this.balance -= wAmount;
		}
	}
	public String toString() {
		System.out.println("Savings Account Details:");
		System.out.println("Id: " + getId());
		System.out.println("Balance: " + getBalance());
		System.out.println("Interest rate: " + getAnnualInterestRate());
		System.out.println("Date: " + getDateCreated() + "\n");
		return "";
	}
}
