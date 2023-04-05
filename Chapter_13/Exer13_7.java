// Name: Paul Helske
// Date: 4/5/23
package practices;

import java.util.Date;
import java.util.Scanner;

public class Exer13_7 {

	public static void main(String[] args) {
		GeometricObject[] list = new GeometricObject[5];

		for (int i = 0; i < list.length; i++) {
			list[i] = new Triangle();
			System.out.println("Triangle " + (i+1));
			System.out.println(list[i].getArea());
			list[i].howToColor();
		}

	}
}

interface Colorable {
	void howToColor();
}

abstract class GeometricObject implements Colorable {
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
	@Override
	public void howToColor() {
		System.out.println("Color all three sides\n");
	}
	abstract double getArea();
	abstract double getPerimiter();
}

class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;

	public Triangle() {
		side1 = 3;
		side2 = 4;
		side3 = 5;
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
