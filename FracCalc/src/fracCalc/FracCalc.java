package fracCalc;
import java.util.*;
import java.util.Arrays;
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
		}
		System.out.println(produceAnswer(equation));
		}
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String equation){ 
        // TODO: Implement this function to produce the solution to the input
    	String[] fracStore = equation.split(" ");
        pa
    }
    public static String parse(String num) {
    	int breakPoint = 0;
    	String whole ="";
    	String denominator = "";
    	String numerator = "";
    	for(int i = 0;i < num.length(); i ++) {
    		if(num.charAt(i) == '_') {
    			whole = num.substring(0, i);
    			breakPoint = i;
    		}
    		if(num.charAt(i) == '/') {
    			numerator += num.substring(breakPoint,i);
    			denominator += num.substring(i,num.length());
    		}
    		if(num.indexOf("_") == -1 && num.length() != 0) {
    			if(num.indexOf("/") == -1) {
    				whole += num.substring(0,num.length());
    				denominator = "0";
    				numerator ="0";
    			}else {
    				whole = "0";
    				denominator =num.substring(0, num.indexOf("/"));
    				numerator =num.substring(num.indexOf("/"),num.length());
    			}
    		}
    	}
    	return ("Whole:" + whole + " numerator:" + numerator + " denominator:" + denominator);
    }
    
    // TODO: Fill in the space below with any helper methods that you think you will need
    
}