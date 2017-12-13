package fracCalc;
import java.util.*;
public class FracCalc {
    public static void main(String[] args) {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	Scanner input = new Scanner(System.in);
		System.out.println("Enter a fraction equation");
		boolean done = false;
		while(!done) {
			String equation = input.nextLine();
			if(equation.equals("quit")) {
				done = true;
			}else {
				System.out.println(produceAnswer(equation));
			}
		}
    }
    public static String produceAnswer(String equation){ 
        String[] fracStore = equation.split(" ");
    	if(fracStore.length != 3) {
    		throw new IllegalArgumentException("ERROR: Input is in an invalid Format.");
    	}
    	Fraction fracOne = new Fraction(fracStore[0]);
    	Fraction fracTwo = new Fraction(fracStore[2]);
        return fracTwo.toString();
    }
}