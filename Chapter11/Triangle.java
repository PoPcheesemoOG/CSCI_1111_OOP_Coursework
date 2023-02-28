/* Name: Paul Helske
 * Date: 11/29/2022
 */

public class Triangle extends GeometricObject {

	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;
	public Triangle(){
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	public Triangle(double newSide1, double newSide2, double newSide3, String newcolor, boolean newfilled){
		side1 = newSide1;
		side2 = newSide2;
		side3 = newSide3;
		color = newcolor;
		filled = newfilled;
	}
	public double getSide1(){
		return side1;
	}
	public double getSide2(){
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	public double getArea() {
		double area = 0;
		double s = ((side1 + side2 + side3) / 2);
		area = Math.sqrt((s * (s - side1) * (s - side2) * (s - side3)));
		return area;
	}
	public double getPerimeter() {
		double peri = side1 + side2 + side3;
		return peri;
	}
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}
