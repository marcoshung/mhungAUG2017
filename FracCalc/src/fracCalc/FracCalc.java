//Marcos Hung; Period 2
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
			}else {
				System.out.println(produceAnswer(equation));
			}
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
    //@SuppressWarnings("unlikely-arg-type")
	public static String produceAnswer(String equation){ 
        // TODO: Implement this function to produce the solution to the input
		//creates an array that will be used to look at the individual terms of the equation
    	String[] fracStore = equation.split(" ");
    	if(fracStore.length != 3) {
    		throw new IllegalArgumentException("ERROR: Input is in an invalid Format.");
    	}
    	String operator = fracStore[1];
    	//these arrays will be used to hold the numerator and denominator of the fractions
    	int[] storeNum1 = new int[2];
    	int[] storeNum2 = new int[2];
    	//converts to numerator and stores the nums in the arrays to be used in the method
    	parse(fracStore[0], storeNum1);
    	parse(fracStore[2], storeNum2);
    	//throws exception
    	if(storeNum1[1] == 0 ||storeNum2[1] == 0) {
    		throw new IllegalArgumentException("ERROR: Cannot divide by 0");
    	}else if(fracStore[1].equals("+") || fracStore[1].equals("-")) {
    		add(storeNum1,storeNum2,operator);
    	}else if(fracStore[1].equals("*") || fracStore[1].equals("/")) {
    		multiply(storeNum1,storeNum2,operator);
    	}else {
    		throw new IllegalArgumentException("ERROR: Input is in an invalid Format.");
    	}
    	return reduce(storeNum1[0],storeNum1[1]);
    }
	//method used to get the information of the fraction and convert to improper fraction
    public static void parse(String num, int[] array) {
    	int breakPoint = 0;
    	String whole ="";
    	String denominator = "";
    	String numerator = "";
    	//traverses the number for underscores and backslashes to get numbers accordingly 
    	for(int i = 0;i < num.length(); i ++) {
    		if(num.charAt(i) == '_') {
    			whole = num.substring(0, i);
    			breakPoint = i;
    		}
    		if(num.charAt(i) == '/') {
    			numerator += num.substring(breakPoint + 1,i);
    			denominator += num.substring(i +1,num.length());
    		}
    	}
    	//checks to see if there is an underscore, if not then if there isn't a backslash it is a whole num, and if there is a backslash it's a fraction
    	if(num.indexOf("_") == -1 && num.length() != 0) {
    		if(num.indexOf("/") == -1) {
    			whole = num.substring(0,num.length());
    			numerator = "0";
    			denominator ="1";
    		}else {
   				whole = "0";
   				numerator =num.substring(0, num.indexOf("/"));
   				denominator =num.substring(num.indexOf("/") + 1,num.length());
   			}
    	}
    	//checks to see if whole num is negative, if it is then the numerator will be subtracted to get more negative
    	if(Integer.parseInt(whole) > 0 || whole.equals("0")) {
    		array[0] = Integer.parseInt(whole) * Integer.parseInt(denominator) + Integer.parseInt(numerator);
    	}else {
    		array[0] = Integer.parseInt(whole) * Integer.parseInt(denominator) - Integer.parseInt(numerator);
    	}
    	array[1] = Integer.parseInt(denominator);
    }
    //Calculate methods
    public static void add(int[] num1, int[] num2,String operator) {
    	//if minus sign will multiple second term by -1 and add.
    	if(operator.equals("-")) {
    		num2[0] *= -1;
    	}
    	if(num1[1] != num2[1]) {
    		int temp = num1[1];
    		num1[1] *= num2[1];
    		num1[0] *= num2[1];
    		num2[0] *= temp;
    		num1[0] += num2[0];
    	}else {
    		num1[0] += num2[0];
    	}
    }
    
    public static void multiply(int[] num1, int[] num2, String operator) {
    	if(operator.equals("*")) {
    		num1[0] *= num2[0];
    		num1[1] *= num2[1];
    	}else {
    		//multiplies by reciprical
    		num1[0] *= num2[1];
    		num1[1] *= num2[0];
    	}
    }
    public static String reduce(int numerator, int denominator) {
    	int factor = 0;
    	int whole = 0;
    	if(numerator == 0) {
    		return 0 +"";
    	}else if(numerator>=denominator) {
    		factor = denominator;
			while(denominator % factor !=0 || numerator % factor != 0){
				factor--;
			}
		}else {
			factor = numerator;
			while(denominator % factor != 0 || numerator % factor != 0){
				factor--;
			}
		}
    	denominator /= factor;
    	numerator /= factor;
    	whole = numerator / denominator;
    	if(denominator == 1) {
    		return numerator +"";
    	}else if(whole != 0) {
    		return whole + "_" + (numerator - denominator * whole) + "/" + denominator;
    	}else {
    		return numerator + "/" + denominator;
    	}
    }
}