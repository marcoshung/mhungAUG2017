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
		System.out.println(Calculate.discriminant(-3, 9.3, -4));
		System.out.println(Calculate.toImproperFrac(6,3,5));
		System.out.println(Calculate.toMixedNum(-7,2));
		System.out.println(Calculate.foil(5,-7,2,-9,"x"));
		System.out.println(Calculate.isDivisibleBy(16, -2));
		System.out.println(Calculate.absValue(-43));
		System.out.println(Calculate.max(-10,-18));
		System.out.println(Calculate.max(-1,-2,-3));
		System.out.println(Calculate.round2(1.24223));
	}

}
