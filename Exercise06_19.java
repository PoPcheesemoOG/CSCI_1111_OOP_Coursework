/* Name: Paul Helske
 * Date: 10/25/2022
 */
import java.util.Scanner;

public class Exercise06_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double side1, side2, side3;
		System.out.println("Enter the length of the 3 sides of the triangle: ");
		side1 = input.nextDouble();
		side2 = input.nextDouble();
		side3 = input.nextDouble();
		if (isValid (side1, side2, side3) == true) {
			area (side1, side2, side3);
		}
		
	}
	public static boolean isValid(double side1, double side2, double side3) {
		boolean triangle = false;
		if ((side1 + side2) > side3 && (side3 + side2) > side1 && (side3 + side1) > side2) {
			triangle = true;
			System.out.println("Side 1: \t" + side1 + "\nSide 2: \t" + side2 + "\nSide 3: \t" + side3);
		}
		else {
			System.out.println("That is not a valid triangle");
		}
		return triangle;
	}
	public static double area(double side1, double side2, double side3) {
		double area, s;
		s = ((side1 + side2 + side3) / 2);
		area = Math.sqrt((s * (s - side1) * (s - side2) * (s - side3)));
		System.out.printf("Area: \t\t%.1f", area);
		return area;
	}

}
