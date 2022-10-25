/* Name: Paul Helske
 * Date: 10/25/2022
 */
import java.util.Scanner;

public class Exercise06_20 {

	public static void main(String[] args) {
		int count = 0;
		Scanner input = new Scanner (System.in);
		String s = "";
		System.out.print("Enter a string: ");
		s = input.nextLine();
		System.out.println("'" + s + "' is " + s.length() + " characters long");
		count = countLetters(s);
		System.out.println("There are " + count + " letters in '" + s + "'");
	}
	public static int countLetters (String s) {
		int count = 0;
		char c;
		int length = s.length();
		for (int i = 0; i < length; i++) {
			c = s.charAt(i);
			if (Character.isLetter(c) == true) {
				count++;
			}
		}
		return count;
	}	
}
