/* Name: Paul Helske
 * Date: 11/02/2022
 */
public class Exercise09_01 {

	public static void main(String[] args) {
		System.out.println("Creating a rectangle of 4 by 40...");
		Rectangle Rectangle1 = new Rectangle(40, 4);
		System.out.println("The height of the rectangle is " + Rectangle1.height + " and the width is " + Rectangle1.width + ".");
		System.out.println("The area is: " + Rectangle1.getArea());
		System.out.println("The Perimeter is: " + Rectangle1.getPerimeter() + "\n\n");
		System.out.println("Creating a rectangle of 3.5 by 35.9...");
		Rectangle Rectangle2 = new Rectangle(35.9, 3.5);
		System.out.println("The height of the rectangle is " + Rectangle2.height + " and the width is " + Rectangle2.width + ".");
		System.out.println("The area is: " + Rectangle2.getArea());
		System.out.println("The Perimeter is: " + Rectangle2.getPerimeter() + "\n\n");
	}
}
class Rectangle {
	double height;
	double width;
	Rectangle() {
		height = 1;
		width = 1;
	}
	Rectangle(double newHeight, double newWidth) {
		height = newHeight;
		width = newWidth;
	}
	double getArea() {
		return height * width;
	}
	double getPerimeter() {
		return (2 * height) + (2 * width);
	}
	void setHeightWidth(double newHeight, double newWidth) {
		height = newHeight;
		width = newWidth;
	}
}
