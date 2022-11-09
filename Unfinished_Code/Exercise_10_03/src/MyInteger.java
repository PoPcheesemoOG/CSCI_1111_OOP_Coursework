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
	}
	public boolean isOdd(){
		if (value % 2 == 1)
		return true;
	}
	public boolean isPrime(){
		if (value <= 1) {
			return false;
		}
		for (int i = 1; i <= value; i++) {
			if (value % i == 0) {
		return true;
			}
		}
	}
	public static boolean isEven(int tempValue){
		if (tempValue % 2 == 0)
		return true;
	}
	public static boolean isOdd(int tempValue){
		return true;
	}
	public static boolean isPrime(int tempValue){
		return true;
	}
	public static boolean isEven(){
		return true;
	}
	public static boolean isOdd(){
		return true;
	}
	public static boolean isPrime(){
		return true;
	}
}

