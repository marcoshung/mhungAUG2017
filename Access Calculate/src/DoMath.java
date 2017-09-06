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
	}

}
