/* Name: Paul Helske
 * Date: 10/26/2022
 */
import java.util.Scanner;

public class Exercise06_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		boolean run = true;
		System.out.print("Please enter a password with the following requirements:\n");
		System.out.println("At least 8 characters\nCan only contain digits and letters\nAt least 2 digits");
		while (run == true) {
			System.out.print("Password: ");
			String s = input.nextLine();
			if (isValid (s) == false) {
				System.out.println("Inavlid Password");
			}
			else {
				System.out.println("Valid Password");
				run = false;
			}
		}
	}
	public static boolean isValid(String s) {
		boolean valid = false;
		int counter = 0;
		int dlcount = 0;
		int dcount = 0;
		char c = 'a';
		if (s.length() > 7) {
			counter++;
		}
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (Character.isLetterOrDigit(c) == true) {
				dlcount++;
			}
		}
		if (dlcount == s.length()) {
			counter++;
		}
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (Character.isDigit(c) == true) {
				dcount++;
			}
		}
		if (dcount > 1) {
			counter++;		
		}
		if (counter == 3) {
			valid = true;
		}
		return valid;
	}

}
