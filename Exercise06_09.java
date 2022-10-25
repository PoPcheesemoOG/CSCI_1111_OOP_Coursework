/* Name: Paul Helske
 * Date: 10/25/2022
 */

public class Exercise06_09 {

	public static void main(String[] args) {
		double foot, confoot;
		double meter, conmeter;
		System.out.println("Feet\tMeters\t\tMeters\tFeet");
		System.out.println("------------------------------------");
		for (int i = 1; i < 11; i++) {
			foot = i;
			meter = i * 5 + 15;
			conmeter = footToMeter(foot);
			confoot = meterToFoot(meter);
			System.out.printf(foot + "\t%.3f\t\t" + meter + "\t%.3f\n", conmeter, confoot);

		}

	}

	public static double footToMeter (double foot) {
		double conmeter;
		conmeter = foot * 0.305;
		return conmeter;
	}
	public static double meterToFoot (double meter) {
		double confoot;
		confoot = meter * 3.279;
		return confoot;
	}

}
