/* Name: Paul Helske
 * Date: 02/16/2023
 */

import java.util.Date;

public class Exercise11_3 {

	public static void main(String[] args) {
		Account Acc1 = new Account(1122, 20000);
		Acc1.setAnnualInterestRate(4.5);
		System.out.println("Account Details:");
		System.out.println("Id: " + Acc1.getId());
		System.out.println("Balance: " + Acc1.getBalance());
		System.out.println("Interest rate: " + Acc1.getAnnualInterestRate());
		System.out.println("Date: " + Acc1.getDateCreated());
		//System.out.println("Monthly interest rate: " + Acc1.getMonthlyInterestRate(Acc1.getAnnualInterestRate()));
		System.out.println("Monthly interest: " + Acc1.getMonthlyInterest(Acc1.getAnnualInterestRate(), Acc1.getBalance()));
		System.out.println("\nWithdrawing 2500...\n");
		Acc1.withdraw(2500);
		System.out.println("New balance: " + Acc1.getBalance());
		System.out.println("\nDepositing 3000...\n");
		Acc1.deposit(3000);
		System.out.println("New balance: " + Acc1.getBalance());
		
	}

}
class Account{
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