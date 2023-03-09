/* Name: Paul Helske
 * Date: 3/8/2023
 */
import java.util.Scanner;

public class Exec12_3 {

	public static void main(String[] args) {
		rando();
	}

public static void rando() {
	int list[] = {};
	list = new int[100];
	for (int i = 0; i < 100; i++) {
		double p = Math.round(Math.random()*100);
		int o = (int) p;
		list[i] = o;	
	}
	Scanner input = new Scanner(System.in);
	int w = 0;
	while (w == 0) {
		try {
			System.out.print("please enter an integer between 0-99 for the array: ");
			int q = input.nextInt();
			System.out.print("\nHere is your random number: " + list[q]);
			w = 1;

		} catch (Exception ex) {
			System.out.println("Sorry that is OUT OF BONDS \nPlease enter an integer between 0-99.\n");
		}
	}
}
}

