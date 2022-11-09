/* Name: Paul Helske
 * Date: 11/09/2022
 */
public class Exercise10_03 {
	
	public static void main(String[] args) {
		int a = 5;
		MyInteger b = new MyInteger(a);
		System.out.println("My Integer value is... " + b.getMyInteger());
		System.out.println("My Integer is an Even..." + b.isEven());
		System.out.println("My Integer is an Odd..." + b.isOdd());
		System.out.println("My Integer is a Prime..." + b.isPrime());
		
	}

}
