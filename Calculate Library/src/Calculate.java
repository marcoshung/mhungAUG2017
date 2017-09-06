/*Marcos Hung
 * September 6, 2017
 * Our self written math library. It contains a series of methods to do basic math problems.
*/
public class Calculate {
	//Will square number
	public static int square(int operand) {
		return operand*operand;
	}
	//Will cube number
	public static int cube(int operand) {
		return operand*operand*operand;
	}
	//Will give an average of two numbers
	public static double average(double numberOne,double numberTwo) {
		return (numberOne + numberTwo)/2;
	}
	//Another average, but with three numbers 
	public static double average(double numberOne, double numberTwo, double numberThree) {
		return (numberOne +numberTwo + numberThree)/3;
	}
	//Converts radians to degrees
	public static double toDegrees(double angle) {
		return angle * (180/3.14159);
	}
	//Converts Degrees to radians
	public static double toRadians(double angle) {
		return angle* (3.14159/180);
	}
	//Gives the discriminant of a quadratic equation
	public static double discriminant(double a, double b, double c) {
		return b*b - (4*a*c);
	}
	//converts mixed number into an improper fraction
	public static string toImproperFrac(int wholeNum, int numerator, int denominator) {
		int newNumerator = wholeNum*denominator + numerator;
		return String (newNumerator + "/" + de)
	}
}