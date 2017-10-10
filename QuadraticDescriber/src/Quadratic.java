
public class Quadratic {
	public static double sqrt(double operand) {
		if(operand < 0) {
			throw new IllegalArgumentException("Cannot square root negatives");
		}else if(operand == 0) {
			return 0;
		}
		double numOne = 0;
		while(numOne * numOne <operand) {
			numOne++;
		}
		if((numOne *numOne) % operand == 0) {
			return numOne;
		}else {
			return .5 * (operand/numOne + numOne);
		}
	}
	public static double discriminant(double a, double b, double c) {
		return b*b - (4*a*c);
	}
	public static double round2(double operand) {
		if(operand >0) {
			double newOperand = operand*100 + .5;
			int num = (int) (newOperand);
			return ((double) (num))/100;
		}else {
			double newOperand = operand*100 - .5;
			int num = (int) (newOperand);
			return ((double) (num))/100;
		}
	}
	public static String quadForm(double a, double b, double c) {
		double discriminant = discriminant(a,b,c);
		if(discriminant < 0) {
			return ("no real roots");
		}else {
			if(a == 0) {
				throw new IllegalArgumentException("Not a quadratic equation");
			}
			double rootOne = (-b+ sqrt(discriminant))/(2*a);
			double rootTwo = (-b- sqrt(discriminant))/(2*a);
			if(rootOne != rootTwo) {
				rootOne = round2(rootOne);
				rootTwo = round2(rootTwo);
				if(rootOne > rootTwo) {
					return rootTwo + " and " + rootOne;
				}else {
					return rootOne + " and " + rootTwo;
				}
			}else {
				rootOne = round2(rootOne);
				return rootOne +"";
			}
		}
	}
	public static double exponent(double operand, int exponent) {
		if(exponent < 0) {
			throw new IllegalArgumentException("Cannot take negative exponents");
		}
		if(exponent ==0) {
			return 1;
		}
		double multiply = operand;
		for(int i = 1; i<exponent;i++) {
			operand *= multiply;
		}
		return operand;
	}
}