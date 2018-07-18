/*Marcos Hung
 *September 6, 2017
 *This is the runner for the calculate library. It is used to test methods in calculate.
*/
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(6));
		System.out.println(Calculate.cube(5));
		System.out.println(Calculate.average(3,0));
		System.out.println(Calculate.average(6,-3,4));
		System.out.println(Calculate.toDegrees(4.66));
		System.out.println(Calculate.toRadians(653));
		System.out.println(Calculate.discriminant(1, 0, 0));
		System.out.println(Calculate.toImproperFrac(6,3,5));
		System.out.println(Calculate.toMixedNum(-7,2));
		System.out.println(Calculate.foil(5,-7,2,-9,"x"));
		System.out.println(Calculate.isDivisibleBy(5, 2));
		System.out.println(Calculate.absValue(-43));
		System.out.println(Calculate.max(-10,-10));
		System.out.println(Calculate.max(-1,-1,-3));
		System.out.println(Calculate.min(2, 2));
		System.out.println(Calculate.round2(0));
		System.out.println(Calculate.exponent(2.5698,0));
		System.out.println(Calculate.factorial(9));
		System.out.println(Calculate.isPrime(17));
		System.out.println(Calculate.gcf(54,60));
		System.out.println(Calculate.sqrt(169));
		System.out.println(Calculate.quadForm(1,-8,16));
		System.out.println(Calculate.interestCalc(100, 5, 5));
	}

}
