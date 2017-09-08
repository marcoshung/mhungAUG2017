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
	public static String toImproperFrac(int wholeNum, int numerator, int denominator) {
		int newNumerator = wholeNum*denominator + numerator;
		return (newNumerator + "/" + denominator);
	}
	//converts improper fraction to mixed number
	public static String toMixedNum(int numerator, int denominator) {
		int wholeNum = numerator/denominator;
		int newNumerator = numerator % denominator;
		return (wholeNum + "_" + newNumerator + "/" + denominator);
	}
	//foils a quadratic equation
	public static String foil(int a,int b, int c, int d, String x) {
		int newA = a*c;
		int newB = (a*d) + (b*c);
		int newC = b*d;
		return (newA + x +"^2 + " + newB + x + "+ " + newC);	
	}
	//sees if one int is divisible by another and returns a boolean
	public static boolean isDivisibleBy(int operandOne, int operandTwo) {
		if(operandOne % operandTwo == 0) {
			return true;
		}else if(operandTwo % operandOne ==0) {
			return true;
		}else {
			return false;
		}
	}
	//returns absolute value of a number
	public static double absValue(double operand) {
		if(operand <0) {
			return operand*-1;
		}else {
			return operand;
		}
	}
	//returns the bigger number of two numbers
	public static double max(double numOne, double numTwo) {
		if(numOne>numTwo) {
			return numOne;
		}else {
			return numTwo;
		}
	}
	//returns the largest number of three numbers
	public static double max(double numOne,double numTwo, double numThree) {
		if(numOne>=numTwo && numOne>=numThree) {
			return numOne;
		}else if(numTwo>=numOne && numTwo>=numThree) {
			return numTwo;
		}else {
			return numThree;
		}
	}
	//rounds double value to 2 decimal places
	public static double round2(double operand) {
		int determinant = operand/1;
	}
}