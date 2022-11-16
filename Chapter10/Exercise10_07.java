/* Name: Paul Helske
 * Date: 11/16/2022
 */
import java.util.Scanner;

public class Exercise10_07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Account idList [] = new Account[10];
		idList [0] = new Account(0, 100);
		idList [1] = new Account(1, 100);
		idList [2] = new Account(2, 100);
		idList [3] = new Account(3, 100);
		idList [4] = new Account(4, 100);
		idList [5] = new Account(5, 100);
		idList [6] = new Account(6, 100);
		idList [7] = new Account(7, 100);
		idList [8] = new Account(8, 100);
		idList [9] = new Account(9, 100);

		System.out.print("Enter your account id: ");
		int id = input.nextInt();
		System.out.println("Please choose one of the following:");
		System.out.println("Option 1: Check Balance");
		System.out.println("Option 2: Withdraw");
		System.out.println("Option 3: Deposit");
		System.out.println("Option 4: Exit");
		int mainMenu = input.nextInt();
		boolean q = false;
		while (q == false) {
			switch (mainMenu) {
			case 1: 
				System.out.println("You chose option: " + mainMenu);
				System.out.println("Your balance is " + idList[id].getBalance());
				System.out.println("Please choose one of the following:");
				System.out.println("Option 1: Check Balance");
				System.out.println("Option 2: Withdraw");
				System.out.println("Option 3: Deposit");
				System.out.println("Option 4: Exit");
				mainMenu = input.nextInt();
				break; // Check balance
			case 2: 
				System.out.println("You chose option: " + mainMenu);
				System.out.print("Please choose how much to withdraw: ");
				double wd = input.nextDouble();
				idList[id].withdraw(wd);
				System.out.println("Please choose one of the following:");
				System.out.println("Option 1: Check Balance");
				System.out.println("Option 2: Withdraw");
				System.out.println("Option 3: Deposit");
				System.out.println("Option 4: Exit");
				mainMenu = input.nextInt();
				break;//withdraw
			case 3: 
				System.out.println("You chose option: " + mainMenu);
				System.out.print("Please choose how much to deposit: ");
				double dp = input.nextDouble();
				idList[id].deposit(dp);
				System.out.println("Please choose one of the following:");
				System.out.println("Option 1: Check Balance");
				System.out.println("Option 2: Withdraw");
				System.out.println("Option 3: Deposit");
				System.out.println("Option 4: Exit");
				mainMenu = input.nextInt();
				break;//deposit
			case 4: 
				System.out.println("You chose option: " + mainMenu);
				System.out.print("\nEnter your account id: ");
				id = input.nextInt();
				System.out.println("Please choose one of the following:");
				System.out.println("Option 1: Check Balance");
				System.out.println("Option 2: Withdraw");
				System.out.println("Option 3: Deposit");
				System.out.println("Option 4: Exit");
				mainMenu = input.nextInt();
				break;//exit
			default: //error message an re-prompt
			}
		}


	}

}
