// Name: Paul Helske
// Date: 4/5/23
package practices;

import java.util.Date;
import java.util.Scanner;

public class Exer13_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the 3 sides of the triangle, "
				+ "if it is filled or not and the color");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		boolean filled = input.nextBoolean();
		String color = input.next();
		input.close();
		Triangle Tri = new Triangle(side1, side2, side3, color, filled);
		Tri.toString();
		System.out.println("The perimiter is: " + Tri.getPerimiter());
		System.out.println("The area is: " + Tri.getArea());
	}
}

abstract class GeometricObject {
	private String color = "Black";
	private boolean filled;
	private Date dateCreated;

	protected GeometricObject() {
		color = "Black";
		filled = true;
		dateCreated = new Date();
	}

	protected GeometricObject(String color, boolean filled) {
		dateCreated = new Date();
		this.color = color;
		this.filled = filled;
	}
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	@Override
	public String toString() {
		System.out.println("Color: " + this.color);
		System.out.println("Filled: " + this.filled);
		System.out.println("Date Created: " + dateCreated);
		return "";
	}
	abstract double getArea();
	abstract double getPerimiter();
}

class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle() {
		side1 = 1;
		side2 = 1;
		side3 = 1;
	}
	public Triangle(double side1, double side2, double side3, String color1, boolean filled) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		setColor(color1);
		setFilled(filled);
		
	}
	public double getPerimiter() {
		double peri = side1 + side2 + side3;
		return peri;
	}
	public double getArea() {
		double s = getPerimiter() / 2;
		double a = (Math.sqrt((s * (s - side1) * (s - side2) * (s - side3))));
		return a;
	}
	
}
