/* Name:Paul Helske
 * Date: 11/08/2022
 */
public class MyInteger {
	int value = 0;
	
	MyInteger(int newValue){
		value = newValue;
	}
	public int getMyInteger() {
		return value;
	}
	public boolean isEven(){
		if (value % 2 == 0)
		return true;
		else {
			return false;
		}
	}
	public boolean isOdd(){
		if (value % 2 == 1)
		return true;
		else {
			return false;
		}
	}
	public boolean isPrime(){
		boolean q = false;
		if (value < 1) {
			q = false;
		}
		for (int i = 2; i < value; i++) {
			if (value % i == 0) {
		q = false;
		return q;
			}
			else
				q = true;
		}
		return q;
	}
	public static boolean isEven(int tempValue){
		if (tempValue % 2 == 0)
		return true;
		else {
			return false;
		}
	}
	public static boolean isOdd(int tempValue){
		if (tempValue % 2 == 1)
		return true;
		else {
			return false;
		}
	}
	public static boolean isPrime(int tempValue){
		boolean q = false;
		if (tempValue < 1) {
			q = false;
		}
		for (int i = 2; i < tempValue; i++) {
			if (tempValue % i == 0) {
		q = false;
		return q;
			}
			else
				q = true;
		}
		return q;
	}
	public static boolean isEven(MyInteger temp){
		if (temp.getMyInteger() % 2 == 0)
		return true;
		else {
			return false;
		}
	}
	public static boolean isOdd(MyInteger temp){
		if (temp.getMyInteger() % 2 == 1)
			return true;
			else {
				return false;
			}
	}
	public static boolean isPrime(MyInteger temp){
		boolean q = false;
		if (temp.getMyInteger() < 1) {
			q = false;
		}
		for (int i = 2; i < temp.getMyInteger(); i++) {
			if (temp.getMyInteger() % i == 0) {
		q = false;
		return q;
			}
			else
				q = true;
		}
		return q;
	}
	public boolean equals(int tempValue) {
		if (tempValue == this.value) {
			return true;
		}
		else return false;
	}
	public boolean equals(MyInteger temp) {
		if (temp.getMyInteger() == this.value) {
			return true;
		}
		else return false;
	}
	public static void parseInt(char[] array) {
		String s = "";
		int par = 0;
		int temp = 0;
		
		for (int i = 0; i < array.length; i++) {
			temp = Character.getNumericValue(array [i]);
			par += temp * (Math.pow(10, (array.length - i)));
		}
		par /= 10;
		System.out.println(par);
	}
	public static void parseInt(String s) {
		int par = 0;
		int temp = 0;
		for (int i = 0; i < s.length(); i++) {
			temp = (int) Character.getNumericValue(s.charAt(i));
			par += temp * (Math.pow(10, (s.length() - i)));
		}
		par /= 10;
		System.out.println(par);
	}
}
