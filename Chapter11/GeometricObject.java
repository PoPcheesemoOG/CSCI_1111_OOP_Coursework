/* Name: Paul Helske
 * Date: 11/29/2022
 */

public class GeometricObject {
	boolean filled;
	String color = "white";
	java.util.Date dateCreated;

	public GeometricObject() {
		filled = true;
		color = "white";
		dateCreated = new java.util.Date();
	}
	public GeometricObject(String newcolor, boolean newfilled) {
		color = newcolor;
		filled = newfilled;
		dateCreated = new java.util.Date();
	}
	public String getColor() {
		return color;
	}
	public boolean getFilled() {
		return filled;
	}

}
