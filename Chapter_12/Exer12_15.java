/* Name: Paul Helske
 * Date: 3/29/2023
 */

package bingo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class bango {

	public static void main(String[] args) throws IOException {
		java.io.File bongo = new java.io.File("bongo.txt");
		PrintWriter output = new PrintWriter (bongo);
		System.out.println("Does it exist? " + bongo.exists());
		int b = 0;

		//Printing on to .txt file
		for (int i = 0; i < 100; i++) {
			b = (int)(Math.random()*100);
			output.print(b + " ");
		}
		output.close();

		// Arrays for the integers to be put in order
		Scanner input = new Scanner(bongo);
		int [] numArray = new int[100];      
		int [] numArray2 = new int[100];
		while (input.hasNext() == true) {
			for (int i = 0; i < 100; i++) {
				numArray[i] = input.nextInt();
				numArray2[i] = numArray[i];
			}
		}
		input.close();
		
		// Logic for sorting the Array
		int temp = 0;
		for (int x = 0; x < 100; x++) {
			for (int y = 0; y < 100 ; y++) {
				if (numArray[x] < numArray[y]) {
					temp = numArray[x];
					numArray[x] = numArray[y];
					numArray[y] = temp;
				}
			}
		}
		System.out.println("\nPrinting Array: \n");
		for (int i = 0; i < 100; i++) {
			System.out.print(numArray[i] + " ");
		}

		System.out.println("\nPrinting Array2: \n");
		for (int i = 0; i < 100; i++) {
			System.out.print(numArray2[i] + " ");
		}
	}
}
