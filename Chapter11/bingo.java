/* Name: Paul Helske
 * Date: 11/29/2022
 */

import java.util.Scanner;

public class bingo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the three "
				+ "lengths of the triangle, it's color and whether it is filled or not: ");
		double newside1 = input.nextDouble();
		double newside2 = input.nextDouble();
		double newside3 = input.nextDouble();
		String newcolor = input.next();
		boolean newfilled = input.nextBoolean();

		Triangle t = new Triangle(newside1, newside2, newside3, newcolor, newfilled);
		System.out.println("The area of the triangle is: " + t.getArea());
		System.out.println("The perimeter is: " + t.getPerimeter());
		System.out.println("The color is: " + t.getColor());
		System.out.println("The object is filled... " + t.getFilled());		
		System.out.println("The date it was created is: " + t.dateCreated);
	}
}

