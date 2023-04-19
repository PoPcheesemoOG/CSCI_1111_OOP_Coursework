/* Name: Paul Helske
 * Date: 4/18/23
 */

package bingo;

public class menu {
	public static void main(String[] args) {
		askOrder();
		burger SingleCheese = new burger(1, true, 4, "Single with cheese", 3.00);
		SingleCheese.toString();
				
		
		

	}
	
	public static void askOrder() {
		System.out.println("Welcome to [Enter Restaurant Name Here]");
		System.out.println("Please enter the number of the items you want to order: ");
	}
}