/* Name: Paul Helske
 * Date: 11/09/2022
 */
public class Exercise10_03 {
	
	public static void main(String[] args) {
		int a = 20;
		int b = 15;
		int c = 37;
		MyInteger d = new MyInteger(a);
		MyInteger e = new MyInteger(b);
		MyInteger f = new MyInteger(c);
		char [] array = {'1', '2', '5', '9'};
		String s = "54321";
		System.out.println("My Integer value is... " + d.getMyInteger());
		System.out.println("My Integer is an Even..." + d.isEven());
		System.out.println("My Integer is an Odd..." + d.isOdd());
		System.out.println("My Integer is a Prime..." + d.isPrime());
		System.out.println("****************************");
		System.out.println("My Integer is an Even..." + d.isEven(15));
		System.out.println("My Integer is an Odd..." + d.isOdd(15));
		System.out.println("My Integer is a Prime..." + d.isPrime(15));
		System.out.println("*****************************");
		System.out.println("My Integer is an Even..." + f.isEven(f));
		System.out.println("My Integer is an Odd..." + f.isOdd(f));
		System.out.println("My Integer is a Prime..." + f.isPrime(f));
		System.out.println("*****************************");
		System.out.println("My Integer of 20 is equal to 15..." + d.equals(15));
		System.out.println("My Integer of 37 is equal to 37..." + f.equals(f));
		MyInteger.parseInt(array);
		MyInteger.parseInt(s);
	}

}
