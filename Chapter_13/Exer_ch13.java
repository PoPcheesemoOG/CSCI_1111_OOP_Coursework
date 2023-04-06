/* Name: Paul Helske
 * Date: 4/6/23
 */
package practice;

import java.util.Date;

public class Exer_ch13 {

	public static void main(String[] args) {
		Octagon oct = new Octagon(4.5);
		Octagon oct2 = new Octagon();
		Octagon oct3 = (Octagon)oct2.clone();
		System.out.println(oct2.compareTo(oct3));
		System.out.println(oct.compareTo(oct3));	
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

class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {
	private double side;
	private double A = getArea();
	
	public Octagon() {
		this.side = 2;
	}
	public Octagon(double newside) {
		this.side = newside;
	}
	@Override
	public int compareTo(Octagon o) {
		 if (getArea() > o.getArea())
			 return 1;
		 else if (getArea() < o.getArea())
			 return -1;
		 else
		return 0;
	}
	
	@Override
	double getArea() {
		this.A =  (2 * (1 + Math.sqrt(2) * Math.pow(this.side, 2)));
		return this.A;
	}
	@Override
	double getPerimiter() {
		double peri = this.side * 8;
		return peri;
	}
	@Override
	public Object clone() {
		try {
			return super.clone();
		}
		catch(CloneNotSupportedException ex) {
			return null;
		}
	}
}
