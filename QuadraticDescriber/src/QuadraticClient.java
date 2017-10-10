import java.util.*;
public class QuadraticClient {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Quadratic Describer\nProvide values for the coefficients a, b, c");
		boolean done = false;
			while(!done) {
			System.out.println("a:");
			double a = input.nextDouble();
			System.out.println("b:");
			double b = input.nextDouble();
			System.out.println("c:");
			double c = input.nextDouble();
			System.out.println(quadDescriber(a,b,c));
			System.out.println("Do you want to keep going? <Type \"quit\" to end>");
			String finished = input.next();
			if(finished.equals("done")) {
				done = true;
			}
		}
	}
	public static String quadDescriber(double a, double b, double c) {
		String summary = "Description of the graph of:\ny = " + a +"x^2 + " + b + "x + " + c +"\n\n";
		double yInt=c;
		//gives direction of graph
		if(a > 0) {
			summary += "Opens: up \n";
		}else if(a <0) {
			summary += "Opens: down \n";
		}
		//axis of symmetry
		double axis = -b/(2*a);
		summary += "Axis of Symmetry: " + Quadratic.round2(axis) +"\n";
		//vertex
		double yValue= (a * Quadratic.exponent(axis, 2)) + (b *axis) + c;
		summary += "Vertex: <" + axis + "," +Quadratic.round2(yValue) + ">\n";
		//roots
		String roots = Quadratic.quadForm(a,b,c);
		if(roots.equals("no real roots")) {
			roots = "None";
		}
		summary += "x-intercepts : " + roots +"\n";
		//y-intercept
		summary += "y-intercept : " + c + "\n\n";
		return summary;
	}

}